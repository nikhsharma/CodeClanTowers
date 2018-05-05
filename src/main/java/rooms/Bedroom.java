package rooms;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private Double nightlyRate;
    private int timeUntilCheckout;

    public Bedroom(int roomNumber, RoomType roomType, Double nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
        this.timeUntilCheckout = 0;
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

    public int getTimeUntilCheckout() {
        return timeUntilCheckout;
    }
}
