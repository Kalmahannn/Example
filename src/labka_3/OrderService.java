package labka_3;

public class OrderService {

    private void printOrderDetails(String productName, int quantity, double price, String action) {
        double totalPrice = quantity * price;
        System.out.println("Order for " + productName + " " + action + ". Total: " + totalPrice);
    }

    public void createOrder(String productName, int quantity, double price) {
        printOrderDetails(productName, quantity, price, "created");
    }

    public void updateOrder(String productName, int quantity, double price) {
        printOrderDetails(productName, quantity, price, "updated");
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.createOrder("Laptop", 2, 1200.00);
        orderService.updateOrder("Laptop", 3, 1200.00);
    }
}

