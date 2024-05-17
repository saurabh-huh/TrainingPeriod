package oops.brickManage;

import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Brick> bricksOwned;
    public User(){};
    public User(String name, ArrayList<Brick> bricksOwned) {
        this.name = name;
        this.bricksOwned = bricksOwned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Brick> getBricksOwned() {
        return bricksOwned;
    }

    public void setBricksOwned(ArrayList<Brick> bricksOwned) {
        this.bricksOwned = bricksOwned;
    }
}
