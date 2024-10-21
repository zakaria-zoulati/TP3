package org.example;

public class PizzaGrecque extends Pizza {
    public PizzaGrecque(){
        this.name = "Pizza Grecque" ;
    }

    @Override
    public void preparer(){
        System.out.println("La preparation du pizza Grecque") ;
    }

    @Override
    public void cuire(){
        System.out.println("la cuisson du pizza Grecque") ;
    }

    @Override
    public void couper(){
        System.out.println("la coupure du pizza Grecque") ;
    }

    @Override
    public void emballer(){
        System.out.println("l'emballage du pizza Grecque") ;
    }

}
