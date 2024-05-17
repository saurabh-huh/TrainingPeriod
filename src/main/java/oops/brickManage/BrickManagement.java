package oops.brickManage;

import java.util.ArrayList;

public class BrickManagement {
    public static void main(String[] args) {
        User user = new User("name",new ArrayList<>(10));
        Admin admin = new Admin(user,true);
        Comment comment = new Comment("yes", user.getName());
        BrickModification brickModification = new BrickModification();

    }

    //having max number of comment
    public void findHottestPerson(){

    }
    // having min. number of comments
    public void findNoDedicationPerson(){

    }
}
