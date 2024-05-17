package oops.cityWall;

public class CommentManagement {
    private Country country;
    private UserManagement userManagement;

    public void commentOnBrick(String userName, int wallIndex, int brickIndex, String comment) {
        User user = userManagement.findUser(userName);

        City city = country.getCities().get(0);
        Wall wall = city.getWalls().get(wallIndex);
        Brick brick = wall.getBricks().get(brickIndex);
        if (brick.isVisible()) {
            brick.addComment(comment);
            System.out.println("Comment added successfully");
        }
    }
}
