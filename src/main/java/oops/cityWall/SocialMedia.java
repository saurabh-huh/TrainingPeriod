package oops.cityWall;

public class SocialMedia {
     Country country = new Country();
     UserManagement userManagement = new UserManagement();
     BrickManagement brickManagement = new BrickManagement(country, userManagement);
     CommentManagement commentManagement = new CommentManagement();

    void initializeUsers() {
        for (int i = 1; i <= 10; i++) {
            userManagement.addUser(new User("User" + i,"user"));
        }
        userManagement.addUser(new Admin("Admin","admin"));
        country.addCity(new City("City1"));
    }

     boolean executeCommand(String command) {

        return false;
    }

    void viewBricks(int wallIndex) {
        City city = country.getCities().get(0);
        Wall wall = city.getWalls().get(wallIndex);
        for (Brick brick : wall.getBricks()) {
            if ( brick.isVisible()) {
                System.out.println(brick.getMessage() + " dedicated to " + brick.getDedicationTo());
                for (String comment : brick.getComments()) {
                    System.out.println(" - Comment: " + comment);
                }
            }
        }
    }
}
