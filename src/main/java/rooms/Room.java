package rooms;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<String> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<String> getGuests() {
        return guests;
    }

    public int guestCount() {
        return guests.size();
    }
}
