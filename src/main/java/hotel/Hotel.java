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
        if (room.getClass() != Bedroom.class) {
            if (room.guestCount() < room.getCapacity()) {
                room.addGuest(guest);
            }
        }
    }

    public void checkGuestIntoBedroom(Guest guest, int lengthOfStay, Bedroom room) {
        if (room.guestCount() < room.getCapacity()) {
            room.addGuest(guest);
            room.setLengthOfStay(lengthOfStay);
        }
    }

    public void checkGuestOut(Guest guest) {
        for (Room room : bedrooms) {
            if (room.getGuests().contains(guest)) {
                room.removeGuest(guest);
            }
        }

        for (Room room : conferenceRooms) {
            if (room.getGuests().contains(guest)) {
                room.removeGuest(guest);
            }
        }

        for (Room room : diningRooms) {
            if (room.getGuests().contains(guest)) {
                room.removeGuest(guest);
            }
        }
    }

    public ArrayList<Guest> getGuestsInRoom(Room room) {
        return room.getGuests();
    }

    public ArrayList<Room> getListOfVacantBedrooms() {
        ArrayList<Room> vacantRooms = new ArrayList<>();
        for (Room room : bedrooms) {
            if (room.guestCount() == 0) {
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }
}
