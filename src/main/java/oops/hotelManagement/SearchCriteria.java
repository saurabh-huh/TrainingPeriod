package oops.hotelManagement;

public class SearchCriteria {
    private String location;

    public SearchCriteria(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}