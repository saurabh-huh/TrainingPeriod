package oops.LibraryManagement;

class NotificationService {
    public void sendNotification(LibraryMember libraryMember, String message) {
        // For simplicity, we will just print the message
        System.out.println("Notification to " + libraryMember.getName() + ": " + message);
    }
}