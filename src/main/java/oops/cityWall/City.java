package oops.cityWall;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Wall> walls = new ArrayList<>();

    public City(String name) {
        this.name = name;
        walls.add(new Wall());
    }

    public void addBrick(User owner, String message, String dedicationTo) {
        Wall lastWall = walls.get(walls.size() - 1);
        Brick brick = new Brick(owner, message, dedicationTo);
        if (!lastWall.addBrick(brick)) {
            Wall newWall = new Wall();
            newWall.addBrick(brick);
            walls.add(newWall);
        }
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public String getName() {
        return name;
    }
}
