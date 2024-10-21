package org.example;

public class PizzaPoivron extends Pizza {
    public PizzaPoivron(){
        this.name = "Pizza Poivron" ;
    }

    @Override
    public void preparer(){
        System.out.println("La preparation du pizza Poivron") ;
    }

    @Override
    public void cuire(){
        System.out.println("la cuisson du pizza Poivron") ;
    }

    @Override
    public void couper(){
        System.out.println("la coupure du pizza Poivron") ;
    }

    @Override
    public void emballer(){
        System.out.println("l'emballage du pizza Poivron") ;
    }

}
