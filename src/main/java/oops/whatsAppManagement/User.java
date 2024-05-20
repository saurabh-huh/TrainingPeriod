package oops.whatsAppManagement;

import java.util.List;

public class User {
    String name;
    long mobileNumber;
    List<Contact> contactList;
    List<Message> messageList;
    List<Status> statusList;

    public User(String name, long mobileNumber, List<Contact> contactList, List<Message> messageList, List<Status> statusList) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.contactList = contactList;
        this.messageList = messageList;
        this.statusList = statusList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
    }
}
