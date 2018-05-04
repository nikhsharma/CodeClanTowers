package rooms;

public class Bedroom extends Room {

    RoomType roomType;

    public Bedroom(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return roomType.getValue();
    }
}
