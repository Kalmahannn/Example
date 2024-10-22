package dom_8_2;

public class Main {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Алексей");
        User user2 = new ChatUser(chatRoom, "Ольга");
        User user3 = new ChatUser(chatRoom, "Мария");

        chatRoom.registerUser(user1);
        chatRoom.registerUser(user2);
        chatRoom.registerUser(user3);

        user1.send("Барлығына сәлем!");
    }
}

