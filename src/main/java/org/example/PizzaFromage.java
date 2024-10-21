package org.example;

public class PizzaFromage extends Pizza {
    public PizzaFromage(){
        this.name = "Pizza Fromage" ;
    }

    @Override
    public void preparer(){
        System.out.println("La preparation du pizza Fromage") ;
    }

    @Override
    public void cuire(){
        System.out.println("la cuisson du pizza Fromage") ;
    }

    @Override
    public void couper(){
        System.out.println("la coupure du pizza fromage") ;
    }

    @Override
    public void emballer(){
        System.out.println("l'emballage du pizza fromage") ;
    }

}
