package dom_3;

public class NumberPrinter {
    public void printPositiveNumbers(int[] numbers) {
        if (numbers != null && numbers.length > 0) {
            for (int number : numbers) {
                if (number > 0) {
                    System.out.println(number);
                }
            }
        } else {
            System.out.println("Массив бос немесе орнатылмаған.");
        }
    }

    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        int[] numbers = {3, -1, 4, -2, 5, 0};

        printer.printPositiveNumbers(numbers);
    }
}
