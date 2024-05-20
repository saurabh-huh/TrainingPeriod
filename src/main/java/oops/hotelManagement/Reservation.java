package oops.hotelManagement;

import java.util.UUID;

public class Reservation {
    private String identifier;
    private User user;
    private Hotel hotel;
    private int roomNumber;

    public Reservation(User user, Hotel hotel, int roomNumber) {
        this.identifier = UUID.randomUUID().toString();
        this.user = user;
        this.hotel = hotel;
        this.roomNumber = roomNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
// getters and setters for user, hotel, and roomNumber
}