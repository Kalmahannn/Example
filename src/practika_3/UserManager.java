package practika_3;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user);
    }

    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
        System.out.println("User with email " + email + " removed.");
    }

    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                user.setRole(newRole);
                System.out.println("User updated: " + user);
                break;
            }
        }
    }

    public void printAllUsers() {
        users.forEach(System.out::println);
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Добавляем пользователей
        User user1 = new User("Kalmahan", "kalmahan@example.com", "Admin");
        User user2 = new User("Ermahan", "ermahan@example.com", "User");
        userManager.addUser(user1);
        userManager.addUser(user2);

        // Обновляем пользователя
        userManager.updateUser("ermahan@example.com", "Robert", "Admin");

        // Удаляем пользователя
        userManager.removeUser("kalmahan@example.com");

        // Печать всех пользователей
        userManager.printAllUsers();
    }
}

