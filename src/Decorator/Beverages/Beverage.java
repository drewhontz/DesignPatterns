package Decorator.Beverages;

public abstract class Beverage {

    String description = "Base beverage class";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
