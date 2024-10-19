package labka_3;

public class MathOperations {

    public int add(int a, int b) {
        return a + b;
    }

    public void logResult(int result) {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(5, 10);
        mathOperations.logResult(result);
    }
}

