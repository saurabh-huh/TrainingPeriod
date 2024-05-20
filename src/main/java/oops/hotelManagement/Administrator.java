package oops.hotelManagement;

public class Administrator extends Person{
    private UserDatabase userDb;
    private HotelDatabase hotelDb;
    private ReservationDatabase reservationDb;

    public Administrator(String username, String email, String password, UserDatabase userDb, HotelDatabase hotelDb, ReservationDatabase reservationDb) {
        super(username, email, password);
        this.userDb = userDb;
        this.hotelDb = hotelDb;
        this.reservationDb = reservationDb;
    }

    public void approveHotel(Hotel hotel) {
        hotel.setApproved(true);
        System.out.println("Hotel approved.");
    }

    public void deleteUser(String username) {
        userDb.delete(username);
        System.out.println("User deleted.");
    }

    public void deleteHotel(String hotelName) {
        hotelDb.delete(hotelName);
        System.out.println("Hotel deleted.");
    }
}
