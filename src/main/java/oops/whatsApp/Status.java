package oops.whatsApp;

abstract class Status {
    private String username;

    public Status(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public abstract void displayStatus();
}

class TextStatus extends Status {
    private String text;

    public TextStatus(String username, String text) {
        super(username);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void displayStatus() {
        System.out.println("Text Status by " + getUsername() + ": " + text);
    }
}

class ImageStatus extends Status {
    private String imagePath;

    public ImageStatus(String username, String imagePath) {
        super(username);
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    @Override
    public void displayStatus() {
        System.out.println("Image Status by " + getUsername() + ": " + imagePath);
    }
}
