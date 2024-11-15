package practika_10;

// Подсистема бронирования номеров
class RoomBookingSystem {
    public void bookRoom() {
        System.out.println("Номер забронирован.");
    }

    public void cancelBooking() {
        System.out.println("Бронирование номера отменено.");
    }
}

// Подсистема ресторана
class RestaurantSystem {
    public void reserveTable() {
        System.out.println("Столик в ресторане забронирован.");
    }

    public void orderFood() {
        System.out.println("Заказ еды в ресторане выполнен.");
    }
}

// Подсистема мероприятий
class EventManagementSystem {
    public void bookEventHall() {
        System.out.println("Конференц-зал забронирован.");
    }

    public void orderEquipment() {
        System.out.println("Оборудование для мероприятия заказано.");
    }
}

// Служба уборки
class CleaningService {
    public void scheduleCleaning() {
        System.out.println("Уборка номера запланирована.");
    }

    public void requestCleaning() {
        System.out.println("Уборка номера выполнена.");
    }
}

class HotelFacade {
    private RoomBookingSystem roomBooking;
    private RestaurantSystem restaurant;
    private EventManagementSystem eventManagement;
    private CleaningService cleaning;

    public HotelFacade() {
        this.roomBooking = new RoomBookingSystem();
        this.restaurant = new RestaurantSystem();
        this.eventManagement = new EventManagementSystem();
        this.cleaning = new CleaningService();
    }

    public void bookRoomWithServices() {
        roomBooking.bookRoom();
        restaurant.orderFood();
        cleaning.scheduleCleaning();
        System.out.println("Бронирование номера с заказом еды и услугами уборки завершено.");
    }

    public void organizeEvent() {
        eventManagement.bookEventHall();
        eventManagement.orderEquipment();
        roomBooking.bookRoom();
        System.out.println("Организация мероприятия с бронированием оборудования и номеров завершена.");
    }

    public void reserveTableWithTaxi() {
        restaurant.reserveTable();
        System.out.println("Бронирование столика в ресторане и вызов такси завершены.");
    }
}


 class HotelFacadeDemo {
    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

        hotelFacade.bookRoomWithServices();
        hotelFacade.organizeEvent();
        hotelFacade.reserveTableWithTaxi();
    }
}

