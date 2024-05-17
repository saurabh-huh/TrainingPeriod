package oops.cityWall;

import java.util.ArrayList;
import java.util.List;

//Adding bricks to wall and check
public class Wall {
    private static final int MAX_BRICKS = 90;
    private List<Brick> bricks = new ArrayList<>();

    public Wall() {
        for (int i = 0; i < MAX_BRICKS; i++) {
            bricks.add(null);
        }
    }

    public boolean addBrick(Brick brick) {
        for (int i = 0; i < bricks.size(); i++) {
            if (bricks.get(i) == null) {
                bricks.set(i, brick);
                return true;
            }
        }
        return false;
    }

    public List<Brick> getBricks() {
        return bricks;
    }
}
