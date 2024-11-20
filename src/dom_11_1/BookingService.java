package dom_11_1;

import java.util.Date;

class BookingService {
    public boolean bookRoom(Hotel hotel, String roomType, int count, Date checkIn, Date checkOut) {
        if (hotel.checkAvailability(roomType, count)) {
            hotel.bookRoom(roomType, count);
            System.out.println("Room booked successfully!");
            return true;
        } else {
            System.out.println("Room not available.");
            return false;
        }
    }
}
