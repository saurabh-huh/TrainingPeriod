package oops.brickManage;

import java.util.ArrayList;

public class Brick {
    String caption;
    String message;
    String dedication;
    User owner;
    boolean isVisible;
    ArrayList<Comment> comments;
    public Brick(){};
    public Brick(String caption, String message, String dedication, User owner, boolean isVisible, ArrayList<Comment> comments) {
        this.caption = caption;
        this.message = message;
        this.dedication = dedication;
        this.owner = owner;
        this.isVisible = isVisible;
        this.comments = comments;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDedication() {
        return dedication;
    }

    public void setDedication(String dedication) {
        this.dedication = dedication;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
//methods to add/remove comment,flagBrock,animate

}
