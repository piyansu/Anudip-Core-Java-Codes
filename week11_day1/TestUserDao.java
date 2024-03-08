package week11_day1;

import java.util.List;

public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        // Adding users
        User user1 = new User(1, "Alice", "alice@example.com");
        User user2 = new User(2, "Bob", "bob@example.com");
        userDao.addUser(user1);
        userDao.addUser(user2);

        // Retrieving users
        User retrievedUser1 = userDao.getUserById(1);
        User retrievedUser2 = userDao.getUserById(2);
        System.out.println("Retrieved User 1: " + retrievedUser1);
        System.out.println("Retrieved User 2: " + retrievedUser2);

        // Updating user
        retrievedUser1.setEmail("alice_updated@example.com");
        userDao.updateUser(retrievedUser1);

        // Retrieving all users
        List<User> allUsers = userDao.getAllUsers();
        System.out.println("All Users: " + allUsers);

        // Deleting user
        userDao.deleteUser(2);

        // Retrieving all users after deletion
        List<User> allUsersAfterDeletion = userDao.getAllUsers();
        System.out.println("All Users after deletion: " + allUsersAfterDeletion);
    }
}
