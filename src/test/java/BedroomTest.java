import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(23, RoomType.DOUBLE, 100.00);
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
}
