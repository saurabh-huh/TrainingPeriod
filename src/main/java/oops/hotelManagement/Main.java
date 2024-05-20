package oops.hotelManagement;

public class Main {
    public static void main(String[] args) {
        HotelManagementSystem hotelManagementSystem = new HotelManagementSystem();

        Administrator admin = new Administrator("admin", "admin@example.com", "password", hotelManagementSystem.getUserDb(), hotelManagementSystem.getHotelDb(), hotelManagementSystem.getReservationDb());
        HotelAgent agent = new HotelAgent("agent", "agent@example.com", "password", hotelManagementSystem.getHotelDb());
        User user = new User("user", "user@example.com", "password", hotelManagementSystem.getReservationDb());

        // Admin approves a new hotel
        Hotel newHotel = agent.addHotel("Grand Hotel", "New York", 100, new String[]{"Pool", "Gym"});
        admin.approveHotel(newHotel);

        // User searches for hotels
        SearchCriteria criteria = new SearchCriteria("New York");
        Hotel[] hotels = user.searchHotels(criteria);

        // User books a room
        if (hotels.length > 0) {
            user.bookRoom(hotels[0], 1);
        }
    }
}
