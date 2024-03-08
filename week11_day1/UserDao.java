package week11_day1;

import java.util.List;

public interface UserDao {
    // Interface defining CRUD operations for users
    void addUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(int id);
}

