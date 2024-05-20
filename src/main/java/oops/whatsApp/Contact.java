package oops.whatsApp;

public class Contact {
    private String username;
    private long mobileNumber;

// contact information of particular user
    public Contact(String username,long mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.username = username;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getUsername() {
        return username;
    }
}
