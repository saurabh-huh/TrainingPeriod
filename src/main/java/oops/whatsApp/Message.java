package oops.whatsApp;

abstract class Message {
    private String sender;
    private String receiver;
// message having the sender name and receiver name
    public Message(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public abstract void displayMessage();
}

class TextMessage extends Message {
    private String text;

    public TextMessage(String sender, String receiver, String text) {
        super(sender, receiver);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void displayMessage() {
        System.out.println("Text Message from " + getSender() + " to " + getReceiver() + ": " + text);
    }
}

class AudioMessage extends Message {
    private String audioPath;

    public AudioMessage(String sender, String receiver, String audioPath) {
        super(sender, receiver);
        this.audioPath = audioPath;
    }

    public String getAudioPath() {
        return audioPath;
    }

    @Override
    public void displayMessage() {
        System.out.println("Audio Message from " + getSender() + " to " + getReceiver() + ": " + audioPath);
    }
}

class VideoMessage extends Message {
    private String videoPath;

    public VideoMessage(String sender, String receiver, String videoPath) {
        super(sender, receiver);
        this.videoPath = videoPath;
    }

    public String getVideoPath() {
        return videoPath;
    }

    @Override
    public void displayMessage() {
        System.out.println("Video Message from " + getSender() + " to " + getReceiver() + ": " + videoPath);
    }
}
