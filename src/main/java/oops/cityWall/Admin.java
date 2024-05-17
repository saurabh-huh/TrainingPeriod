package oops.cityWall;

public class Admin extends User {
    String role;
    public Admin(String name,String role) {
        super(name,role);
        this.role = role;
    }

}
