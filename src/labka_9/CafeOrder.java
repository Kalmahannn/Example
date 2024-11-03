package labka_9;

public class CafeOrder {
    public static void main(String[] args) {
        IBeverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new SugarDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());

        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " : " + beverage.getCost());
    }
}
