package Decorator.Beverages;

public class Drip extends Beverage {

    public Drip(){
        description = "Drip coffee";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
