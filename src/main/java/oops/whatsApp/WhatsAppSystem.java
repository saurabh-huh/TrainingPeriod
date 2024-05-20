package oops.whatsApp;

import java.util.HashMap;
import java.util.Map;

public class WhatsAppSystem {
    private Map<String, User> contactList;

    public WhatsAppSystem() {
        this.contactList = new HashMap<>();
    }

    public void registerUser(String username,long mobileNumber) {
        if (!contactList.containsKey(username)) {
            contactList.put(username, new User(username,mobileNumber));
            System.out.println( username + " registered successfully.");
        } else {
            System.out.println( username + " is already taken.");
        }
    }

    public User getUser(String username) {
        return contactList.get(username);
    }

    public void addContact(String username, String contactUsername) {
        User user = contactList.get(username);
        User contactUser = contactList.get(contactUsername);
        long mobileNumber = contactUser.getMobileNumber();

        user.addContact(new Contact(contactUsername,mobileNumber));
        System.out.println("Contact " + contactUsername + " added to " + username + "'s contacts.");
    }

    public void sendMessage(String senderUsername, String receiverUsername, Message message) {
        User sender = contactList.get(senderUsername);
        User receiver = contactList.get(receiverUsername);
        if (sender != null && receiver != null) {
            sender.sendMessage(message);
            receiver.sendMessage(message);
            message.displayMessage();
        } else {
            System.out.println("Either sender or receiver does not exist.");
        }
    }

    public void postStatus(String username, Status status) {
        User user = contactList.get(username);
        user.postStatus(status);
    }

    public void displayStatuses(String username) {
        User user = contactList.get(username);
        for (Contact contact : user.getContacts()) {
            User contactUser = contactList.get(contact.getUsername());
            if (contactUser != null) {
                for (Status status : contactUser.getStatuses()) {
                    status.displayStatus();
                }
            }
        }
    }
}
