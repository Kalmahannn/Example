package dom_3;

public class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Қате: нөлге бөлу.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Примеры использования метода
        System.out.println("10 / 2 = " + calculator.divide(10, 2));
        System.out.println("10 / 0 = " + calculator.divide(10, 0));
    }
}
