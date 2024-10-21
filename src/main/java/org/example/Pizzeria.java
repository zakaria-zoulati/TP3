package org.example;

public class Pizzeria {
    public Pizza commanderPizza(String type) {
        Pizza pizza;
        if (type.equals("fromage")) {
            pizza = new PizzaFromage();
        } else if (type.equals("grecque")) {
            pizza = new PizzaGrecque();
        } else {
            pizza = new PizzaPoivron();
        }
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();
        return pizza;
    }
}