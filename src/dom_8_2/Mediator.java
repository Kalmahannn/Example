package dom_8_2;

public interface Mediator {
    void sendMessage(String message, User user);
    void registerUser(User user);
}
