package oops.cityWall;

import java.util.ArrayList;
import java.util.List;

// creating a new user
public class User  {
    private String name;
    private String role;;
    private List<Brick> bricksDedicatedTo = new ArrayList<>();

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public List<Brick> getBricksDedicatedTo() {
        return bricksDedicatedTo;
    }
}
