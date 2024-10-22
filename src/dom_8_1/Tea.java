package dom_8_1;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Завариваем чай.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Добавляем лимон.");
    }
}
