package oops.brickManage;

import java.util.ArrayList;

public class Wall {
    ArrayList<Brick> bricks;
    int maxBricks;

    public Wall(ArrayList<Brick> bricks, int maxBricks) {
        this.bricks = bricks;
        this.maxBricks = 90;
    }

    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

// methods add,getTotalBricks

    public void addBrick(Brick brick){

    }

    public int getMaxBricks(){
        return 0;
    }


}
