package rooms;

import guests.Guest;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;
    private Double nightlyRate;
    private int lengthOfStay;

    public Bedroom(int roomNumber, RoomType roomType, Double nightlyRate) {
        super(roomType.getValue());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
        this.lengthOfStay = 0;
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

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public void setLengthOfStay(int length) {
        this.lengthOfStay = length;
    }

    public void clearLengthOfStay() {
        this.lengthOfStay = 0;
    }

}
