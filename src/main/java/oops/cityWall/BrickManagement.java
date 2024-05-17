package oops.cityWall;

class BrickManagement {
    private Country country;
    private UserManagement userManagement;
    private static final String ADMIN_ROLE = "admin";

    public BrickManagement(Country country, UserManagement userManagement) {
        this.country = country;
        this.userManagement = userManagement;
    }

    public void dedicateBrick(String userName, String message, String dedicationTo) {
        User user = userManagement.findUser(userName);
        City city = country.getCities().get(0);
        city.addBrick(user, message, dedicationTo);
    }


    public void flagBrick(int wallIndex, int brickIndex) {
        City city = country.getCities().get(0);
        Wall wall = city.getWalls().get(wallIndex);
        Brick brick = wall.getBricks().get(brickIndex);
        brick.flag();
    }

    public void editBrick(String userName, int wallIndex, int brickIndex, String newMessage) {
        User user = userManagement.findUser(userName);
        City city = country.getCities().get(0);
        Wall wall = city.getWalls().get(wallIndex);
        Brick brick = wall.getBricks().get(brickIndex);

        if (user.getRole().equals(ADMIN_ROLE) || brick.getOwner().equals(user.getName())) {
            brick.setMessage(newMessage);
            System.out.println("Brick message updated");
        } else {
            System.out.println("You can only edit your own bricks");
        }
    }
}
