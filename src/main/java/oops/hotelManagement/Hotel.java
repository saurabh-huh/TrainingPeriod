package oops.hotelManagement;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private String name;
    private String location;
    private int numberOfRooms;
    private String[] facilities;
    private boolean isApproved;
    private Map<Integer, Boolean> roomAvailability;

    public Hotel(String name, String location, int numberOfRooms, String[] facilities) {
        this.name = name;
        this.location = location;
        this.numberOfRooms = numberOfRooms;
        this.facilities = facilities;
        this.isApproved = false;
        this.roomAvailability = new HashMap<>();
        for (int i = 1; i <= numberOfRooms; i++) {
            roomAvailability.put(i, true);
        }
    }

    public boolean isRoomAvailable(int roomNumber) {
        return roomAvailability.getOrDefault(roomNumber, false);
    }

    public void bookRoom(int roomNumber) {
        roomAvailability.put(roomNumber, false);
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public Map<Integer, Boolean> getRoomAvailability() {
        return roomAvailability;
    }

    public void setRoomAvailability(Map<Integer, Boolean> roomAvailability) {
        this.roomAvailability = roomAvailability;
    }
// getters and setters for other fields
}
