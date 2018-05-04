package rooms;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<String> guests;

    public Room() {
        this.guests = new ArrayList<>();
    }

    public abstract int getCapacity();

    public int guestCount() {
        return guests.size();
    }
}
