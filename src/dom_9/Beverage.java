package dom_9;

public interface Beverage {
    String getDescription();
    double cost();
}

 class Espresso implements Beverage {
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

class Tea implements Beverage {
    public String getDescription() {
        return "Tea";
    }

    public double cost() {
        return 1.49;
    }
}

 abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription();
    }

    public double cost() {
        return beverage.cost();
    }
}

class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }
}


class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }
}
class CafeOrder {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}



