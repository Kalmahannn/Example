package dom_8_1;

import java.util.Scanner;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Завариваем кофе.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавляем молоко и сахар.");
    }

    @Override
    protected boolean customerWantsCondiments() {
        System.out.println("Хотите добавить молоко и сахар (y/n)?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.toLowerCase().startsWith("y");
    }
}

