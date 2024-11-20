package dom_11_1;

import java.util.*;

class Hotel {
    private String name;
    private String location;
    private Map<String, Double> roomPrices; // RoomType -> Price
    private Map<String, Integer> availableRooms; // RoomType -> Count

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
        this.roomPrices = new HashMap<>();
        this.availableRooms = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addRoomType(String roomType, double price, int count) {
        roomPrices.put(roomType, price);
        availableRooms.put(roomType, count);
    }

    public boolean checkAvailability(String roomType, int count) {
        return availableRooms.getOrDefault(roomType, 0) >= count;
    }

    public void bookRoom(String roomType, int count) {
        availableRooms.put(roomType, availableRooms.get(roomType) - count);
    }

    public Map<String, Double> getRoomPrices() {
        return roomPrices;
    }

    @Override
    public String toString() {
        return "Hotel: " + name + ", Location: " + location;
    }
}
