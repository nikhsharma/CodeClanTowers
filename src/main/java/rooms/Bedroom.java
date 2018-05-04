package rooms;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private Double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, Double nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Double getNightlyRate() {
        return nightlyRate;
    }
}
