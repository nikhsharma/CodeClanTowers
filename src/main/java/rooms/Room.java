package rooms;

import guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Guest> guests;
    private int capacity;

    public Room(int capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public Guest removeGuest(Guest guest) {
        return guests.remove(guests.indexOf(guest));
    }
}
