package dom_8_1;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Кипятим воду.");
    }

    private void pourInCup() {
        System.out.println("Наливаем в чашку.");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    // "Hook" метод
    protected boolean customerWantsCondiments() {
        return true;
    }
}

