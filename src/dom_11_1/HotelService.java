package dom_11_1;

import java.util.ArrayList;
import java.util.List;

class HotelService {
    private List<Hotel> hotels;

    public HotelService() {
        this.hotels = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public List<Hotel> searchHotels(String location) {
        List<Hotel> result = new ArrayList<>();
        for (Hotel hotel : hotels) {
            if (hotel.getLocation().equalsIgnoreCase(location)) {
                result.add(hotel);
            }
        }
        return result;
    }
}
