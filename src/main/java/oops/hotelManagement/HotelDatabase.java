package oops.hotelManagement;

import java.util.HashMap;
import java.util.Map;

public class HotelDatabase implements Database<Hotel> {
    private Map<String, Hotel> hotels = new HashMap<>();

    @Override
    public void add(Hotel hotel) {
        hotels.put(hotel.getName(), hotel);
    }

    @Override
    public void delete(String hotelName) {
        hotels.remove(hotelName);
    }

    @Override
    public Hotel get(String hotelName) {
        return hotels.get(hotelName);
    }
}