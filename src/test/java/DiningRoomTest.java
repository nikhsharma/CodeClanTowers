import guest.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(20);
        guest = new Guest("Bob");
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, diningRoom.getCapacity());
    }

    @Test
    public void hasListOfGuests() {
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void canAddGuestToRoom() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        diningRoom.addGuest(guest);
        assertEquals(1, diningRoom.guestCount());
        assertEquals(guest, diningRoom.removeGuest(guest));
        assertEquals(0, diningRoom.guestCount());
    }
}

