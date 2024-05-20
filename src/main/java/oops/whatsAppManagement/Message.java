package oops.whatsAppManagement;

abstract class Message {
    String sender;
    String receiver;
    public Message(String sender,String receiver){
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    abstract void displayMassage();
}
class TextMessage extends Message{
    String text;
    public TextMessage(String sender,String receiver,String text){
        super(sender,receiver);
        this.text = text;
    }
    @Override
    void displayMassage() {

    }
}

