package org.example;

public abstract class Pizza {
    public String name = "Pizza" ;

    public void preparer(){
        System.out.println("la preparation du pizza") ;
    }

    public void cuire(){
        System.out.println("la cuisson du pizza") ;
    }

    public void couper(){
        System.out.println("la coupure du pizza") ;
    }

    public void emballer(){
        System.out.println("l'emballage du pizza") ;
    }

}
