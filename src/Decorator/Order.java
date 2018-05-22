package Decorator;

import Decorator.Beverages.Beverage;
import Decorator.Beverages.Drip;
import Decorator.Beverages.Espresso;
import Decorator.Beverages.Soy;

public class Order {
    public static void main(String[] args){
        Beverage drip = new Drip();
        Beverage es = new Espresso();
        Beverage dripSoy = new Soy(new Drip());

        System.out.println(drip.getDescription());
        System.out.println(drip.cost());

        System.out.println(es.getDescription());
        System.out.println(es.cost());

        System.out.println(dripSoy.getDescription());
        System.out.println(dripSoy.cost());
    }
}
