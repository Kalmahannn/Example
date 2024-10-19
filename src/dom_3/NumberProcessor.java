package dom_3;

public class NumberProcessor {

    public void processNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Массив бос немесе орнатылмаған.");
            return;
        }

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        int[] numbers = {3, -1, 4, -2, 5, 0};

        processor.processNumbers(numbers);
    }
}
