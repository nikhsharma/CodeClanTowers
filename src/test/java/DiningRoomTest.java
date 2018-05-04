import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before() {
        diningRoom = new DiningRoom(20);
    }

    @Test
    public void hasCapacity() {
        assertEquals(20, diningRoom.getCapacity());
    }

    @Test
    public void hasListOfGuests() {
        assertEquals(0, diningRoom.guestCount());
    }
}

