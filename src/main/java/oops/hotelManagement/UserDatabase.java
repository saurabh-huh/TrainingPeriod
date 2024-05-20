package oops.hotelManagement;

import java.util.HashMap;
import java.util.Map;

public class UserDatabase implements Database<User> {
    private Map<String, User> users = new HashMap<>();

    @Override
    public void add(User user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public void delete(String username) {
        users.remove(username);
    }

    @Override
    public User get(String username) {
        return users.get(username);
    }
}
