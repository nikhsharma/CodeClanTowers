import guests.Guest;
import hotel.Hotel;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.RoomType;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(23, RoomType.FAMILY, 150.00);
        conferenceRoom = new ConferenceRoom("MeetRoom", 100, 1500.00);
        diningRoom = new DiningRoom(50);
        guest = new Guest("Bob");
    }

    @Test
    public void hasBedroomList() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void hasConferenceRoomList() {
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test

    public void hasDiningRoomList() {
        assertEquals(0, hotel.diningRoomCount());
    }

    @Test
    public void canAddRoomToHotel() {
        hotel.addRoom(bedroom);
        assertEquals(1, hotel.bedroomCount());
        hotel.addRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
        hotel.addRoom(diningRoom);
        assertEquals(1, hotel.diningRoomCount());
        assertEquals(3, hotel.allRoomCount());
    }

    @Test
    public void canCheckGuestIntoRoom() {
        hotel.addRoom(bedroom);
        hotel.addRoom(conferenceRoom);
        hotel.addRoom(diningRoom);
        hotel.checkGuestIn(guest, bedroom);
        assertEquals(1, hotel.getBedrooms().get(0).guestCount());
        hotel.checkGuestIn(guest, conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().get(0).guestCount());
        hotel.checkGuestIn(guest, diningRoom);
        assertEquals(1, hotel.getDiningRooms().get(0).guestCount());
    }

    @Test
    public void canCheckGuestOutOfRoom() {
        hotel.addRoom(bedroom);
        hotel.addRoom(conferenceRoom);
        hotel.addRoom(diningRoom);
        hotel.checkGuestIn(guest, bedroom);
        assertEquals(1, hotel.getBedrooms().get(0).guestCount());
        hotel.checkGuestIn(guest, conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms().get(0).guestCount());
        hotel.checkGuestIn(guest, diningRoom);
        assertEquals(1, hotel.getDiningRooms().get(0).guestCount());
        hotel.checkGuestOut(guest);
        hotel.checkGuestOut(guest);
        hotel.checkGuestOut(guest);
        assertEquals(0, hotel.getBedrooms().get(0).guestCount());
        assertEquals(0, hotel.getConferenceRooms().get(0).guestCount());
        assertEquals(0, hotel.getDiningRooms().get(0).guestCount());
    }
}
