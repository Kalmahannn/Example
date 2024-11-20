package dom_11_1;

import java.util.List;

public class HotelBookingApp {
    public static void main(String[] args) {
        // Инициализация сервисов
        HotelService hotelService = new HotelService();
        BookingService bookingService = new BookingService();

        // Добавляем отели
        Hotel hotel1 = new Hotel("Grand Hotel", "New York");
        hotel1.addRoomType("Single", 100, 10);
        hotel1.addRoomType("Double", 200, 5);

        Hotel hotel2 = new Hotel("Beach Resort", "Miami");
        hotel2.addRoomType("Single", 150, 20);
        hotel2.addRoomType("Suite", 400, 2);

        hotelService.addHotel(hotel1);
        hotelService.addHotel(hotel2);

        // Поиск отелей
        System.out.println("Searching for hotels in New York...");
        List<Hotel> nyHotels = hotelService.searchHotels("New York");
        for (Hotel hotel : nyHotels) {
            System.out.println(hotel);
        }

        // Бронирование комнаты
        System.out.println("Booking a Single room at Grand Hotel...");
        bookingService.bookRoom(hotel1, "Single", 1, null, null);
    }
}
