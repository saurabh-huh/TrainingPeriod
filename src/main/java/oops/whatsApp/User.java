package oops.whatsApp;

import java.util.ArrayList;
import java.util.List;


//structure of user
public class User {
    private String username;
    private long mobileNumber;
    private List<Contact> contacts;
    private List<Message> messages;
    private List<Status> statuses;

    public User(String username,long mobileNumber) {
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.statuses = new ArrayList<>();
    }

    //getter and setter methods
    public long getMobileNumber() {
        return mobileNumber;
    }

    public String getUsername() {
        return username;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void sendMessage(Message message) {
        messages.add(message);
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void postStatus(Status status) {
        statuses.add(status);
    }
}
