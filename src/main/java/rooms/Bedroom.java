package rooms;

public class Bedroom extends Room {

    RoomType roomType;
    Double nightlyRate;

    public Bedroom(RoomType roomType, Double nightlyRate) {
        super(roomType.getValue());
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Double getNightlyRate() {
        return nightlyRate;
    }
}
