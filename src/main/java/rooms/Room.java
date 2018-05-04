package rooms;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<String> guests;
    private int capacity;

    public Room(int capacity) {
        this.guests = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int guestCount() {
        return guests.size();
    }
}
