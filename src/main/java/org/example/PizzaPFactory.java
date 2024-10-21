package org.example;

public class PizzaPFactory extends PizzaFactory {

    public Pizza createPizza() {
        return new PizzaPoivron() ;
    }
}
