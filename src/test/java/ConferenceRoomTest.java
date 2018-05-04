import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Room", 100, 1500.00);
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void hasListOfGuests() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void hasName() {
        assertEquals("The Room", conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate() {
        assertEquals(1500.00, conferenceRoom.getDailyRate(), 0.01);
    }
}
