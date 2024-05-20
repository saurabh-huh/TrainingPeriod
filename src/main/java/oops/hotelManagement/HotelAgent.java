package oops.hotelManagement;

public class HotelAgent extends Person{
    private HotelDatabase hotelDb;

    public HotelAgent(String username, String email, String password, HotelDatabase hotelDb) {
        super(username, email, password);
        this.hotelDb = hotelDb;
    }

    public Hotel addHotel(String name, String location, int numberOfRooms, String[] facilities) {
        Hotel hotel = new Hotel(name, location, numberOfRooms, facilities);
        hotelDb.add(hotel);
        System.out.println("Hotel added, awaiting approval.");
        return hotel;
    }
}
