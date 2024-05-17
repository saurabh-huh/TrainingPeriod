package oops.brickManage;

public class Comment {
    String message;
    String commenter;

    public Comment(String message, String commenter) {
        this.message = message;
        this.commenter = commenter;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCommenter() {
        return commenter;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

}
