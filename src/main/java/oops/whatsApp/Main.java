package oops.whatsApp;

public class Main {
    public static void main(String[] args) {
        WhatsAppSystem system = new WhatsAppSystem();

        system.registerUser("Saurabh",1234567890l);
        system.registerUser("Rajat",1234567890l);

        system.addContact("Saurabh", "Rajat");

        system.sendMessage("Saurabh", "Rajat", new TextMessage("Saurabh", "Rajat", "Hello, Rajat!"));
        system.sendMessage("Rajat", "Saurabh", new AudioMessage("Rajat", "Saurabh", "/path/to/audio"));
        system.sendMessage("Saurabh", "Rajat", new VideoMessage("Saurabh", "Rajat", "/path/to/video"));

        system.postStatus("Saurabh", new TextStatus("Saurabh", "Feeling good today!"));
        system.postStatus("Rajat", new ImageStatus("Rajat", "/path/to/image"));
//
        system.displayStatuses("Saurabh");
//        system.displayStatuses("Rajat");
    }
}
