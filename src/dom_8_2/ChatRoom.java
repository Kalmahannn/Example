package dom_8_2;

import java.util.List;
import java.util.ArrayList;

public class ChatRoom implements Mediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
