import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(100);
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void hasListOfGuests() {
        assertEquals(0, conferenceRoom.guestCount());
    }
}
