package oops.cityWall;

import java.util.ArrayList;
import java.util.List;

public class Brick {
    private User owner;
    private String message;
    private String dedicationTo;
    private List<String> comments = new ArrayList<>();;
    private boolean visible = true;
    private int flagCount = 0;

    public Brick(User owner, String message, String dedicationTo) {
        this.owner = owner;
        this.message = message;
        this.dedicationTo = dedicationTo;
    }


    public void flag() {
        flagCount++;
        if (flagCount > 10) {
            visible = false;
        }
    }

    public User getOwner() {
        return owner;
    }

    public String getMessage() {
        return message;
    }

    public String getDedicationTo() {
        return dedicationTo;
    }

    public boolean isVisible() {
        return visible;
    }

    public int getFlagCount() {
        return flagCount;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void addComment(String comment) {
        comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }
}