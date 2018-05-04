import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(10);
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, bedroom.getCapacity());
    }

    @Test
    public void hasListofGuests() {
        assertEquals(0, bedroom.guestCount());
    }
}
