package org.example;

public class PizzaGFactory extends PizzaFactory {

    public Pizza createPizza() {
        return new PizzaGrecque() ;
    }

}
