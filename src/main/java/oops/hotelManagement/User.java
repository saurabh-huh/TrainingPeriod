package oops.hotelManagement;

public class User extends Person {
    private ReservationDatabase reservationDb;

    public User(String username, String email, String password, ReservationDatabase reservationDb) {
        super(username, email, password);
        this.reservationDb = reservationDb;
    }

    public Hotel[] searchHotels(SearchCriteria criteria) {
        // Implement search logic
        return new Hotel[0];
    }

    public void bookRoom(Hotel hotel, int roomNumber) {
        if (hotel.isRoomAvailable(roomNumber)) {
            Reservation reservation = new Reservation(this, hotel, roomNumber);
            reservationDb.add(reservation);
            hotel.bookRoom(roomNumber);
            System.out.println("Room booked successfully.");
        } else {
            System.out.println("Room is not available.");
        }
    }
}
