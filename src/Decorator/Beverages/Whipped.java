package Decorator.Beverages;

public class Whipped extends CondimentDecorator {
    Beverage beverage;

    public Whipped(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + " with whipped cream";
    }

    public double cost(){
        return beverage.cost() + 0.65;
    }
}
