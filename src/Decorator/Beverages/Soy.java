package Decorator.Beverages;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage b){
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + " with Soy";
    }

    public double cost() {
        return beverage.cost() + 0.50;
    }
}
