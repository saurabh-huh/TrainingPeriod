package oops.hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class ReservationDatabase implements Database<Reservation> {
    private List<Reservation> reservations = new ArrayList<>();

    @Override
    public void add(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public void delete(String identifier) {
        reservations.removeIf(reservation -> reservation.getIdentifier().equals(identifier));
    }

    @Override
    public Reservation get(String identifier) {
        for (Reservation reservation : reservations) {
            if (reservation.getIdentifier().equals(identifier)) {
                return reservation;
            }
        }
        return null;
    }
}
