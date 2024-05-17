package oops.cityWall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// user management adduser and find user, and find hottest User and coldest user

public class UserManagement {
    private List<User> users = new ArrayList<>();

    //adding user to the list of user
    public void addUser(User user) {
        users.add(user);
    }

    //find a perticuler user
    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    //find Hottestuser
    public void findHottestUser() {
        Map<User, Integer> dedicationCount = new HashMap<>();
        for (User user : users) {
                dedicationCount.put(user, dedicationCount.getOrDefault(user, 0) + 1);
        }
        User hottest = Collections.max(dedicationCount.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Hottest user is " + hottest.getName());
    }

    //find coldest user
    public void findColdestUser() {
        for (User user : users) {
            if (user.getBricksDedicatedTo().isEmpty()) {
                System.out.println("Coldest user is " + user.getName());
                return;
            }
        }
    }
}
