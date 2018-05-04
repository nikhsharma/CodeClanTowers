import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(23, RoomType.DOUBLE, 100.00);
        guest = new Guest("Bob");
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasListOfGuests() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasNightRate() {
        assertEquals(100.00, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(23, bedroom.getRoomNumber());
    }

    @Test
    public void canAddGuestToRoom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
        assertEquals(guest, bedroom.removeGuest(guest));
        assertEquals(0, bedroom.guestCount());
    }
}
