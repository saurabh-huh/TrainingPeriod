package oops.hotelManagement;

public class HotelManagementSystem {
    UserDatabase userDb;
    HotelDatabase hotelDb;
    ReservationDatabase reservationDb;

    public HotelManagementSystem(){
        this.userDb =  new UserDatabase();
        this.hotelDb = new HotelDatabase();
        this.reservationDb = new ReservationDatabase();
    }

    public UserDatabase getUserDb() {
        return userDb;
    }

    public HotelDatabase getHotelDb() {
        return hotelDb;
    }

    public ReservationDatabase getReservationDb() {
        return reservationDb;
    }
}