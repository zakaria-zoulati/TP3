package org.example;

public class PizzaFFactory extends PizzaFactory {

    public Pizza createPizza() {
        return new PizzaFromage() ;
    }
}
