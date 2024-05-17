package oops.LibraryManagement;

class NotificationService {
    public void sendNotification(Member member, String message) {
        // For simplicity, we will just print the message
        System.out.println("Notification to " + member.getName() + ": " + message);
    }
}