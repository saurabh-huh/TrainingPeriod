package oops.brickManage;

public class Admin extends User {
    boolean spacialAccess;
    public Admin(User user,boolean spacialAccess){
        this.name = user.getName();
        this.spacialAccess = spacialAccess;
    }



}
