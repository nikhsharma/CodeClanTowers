import guests.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Room", 100, 1500.00);
        guest = new Guest("Bob");
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

    @Test
    public void canAddGuestToRoom() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.guestCount());
        assertEquals(guest, conferenceRoom.removeGuest(guest));
        assertEquals(0, conferenceRoom.guestCount());
    }
}
