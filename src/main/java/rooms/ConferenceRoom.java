package rooms;

public class ConferenceRoom extends Room {

    private String name;
    private Double dailyRate;

    public ConferenceRoom(String name, int capacity, Double dailyRate) {
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public Double getDailyRate() {
        return dailyRate;
    }
}
