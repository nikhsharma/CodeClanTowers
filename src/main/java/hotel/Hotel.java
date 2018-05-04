package hotel;

import guests.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> bedrooms;
    private ArrayList<Room> conferenceRooms;
    private ArrayList<Room> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public ArrayList<Room> getBedrooms() {
        return bedrooms;
    }

    public int bedroomCount() {
        return bedrooms.size();
    }

    public ArrayList<Room> getConferenceRooms() {
        return conferenceRooms;
    }

    public int conferenceRoomCount() {
        return conferenceRooms.size();
    }

    public ArrayList<Room> getDiningRooms() {
        return diningRooms;
    }

    public int diningRoomCount() {
        return diningRooms.size();
    }

    public int allRoomCount() {
        return bedrooms.size() + conferenceRooms.size() + diningRooms.size();
    }

    public void addRoom(Room room) {
        if (room.getClass() == Bedroom.class) {
            bedrooms.add(room);
        }
        if (room.getClass() == ConferenceRoom.class) {
            conferenceRooms.add(room);
        }
        if (room.getClass() == DiningRoom.class) {
            diningRooms.add(room);
        }
    }

    public void checkGuestIn(Guest guest, Room room) {
        if (bedrooms.contains(room)) {
            bedrooms.get(bedrooms.indexOf(room)).addGuest(guest);
        }
        if (conferenceRooms.contains(room)) {
            conferenceRooms.get(conferenceRooms.indexOf(room)).addGuest(guest);
        }
        if (diningRooms.contains(room)) {
            diningRooms.get(diningRooms.indexOf(room)).addGuest(guest);
        }
    }

}
