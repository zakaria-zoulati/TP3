package org.example;

public class Client {

    public static void main(String[] args) {
//        PizzaFactory factory = new PizzaFactory();
        PizzaFactory pf = new PizzaFFactory() ; // The Pizza Fromage Factory
        PizzaFactory pg = new PizzaGFactory() ; // The Pizza Grecque Factory
        PizzaFactory pp = new PizzaPFactory() ; // The Pizza Poivron Factory

        Pizza p ;


        // The Pizza Fromage
        p = pf.createPizza() ;
        System.out.println(p.name);
        p.preparer();
        p.cuire();
        p.couper();
        p.emballer();


        // The Pizza Grecque
        p = pg.createPizza() ;
        System.out.println(p.name);
        p.preparer();
        p.cuire();
        p.couper();
        p.emballer();

        // The pizza Poivron
        p = pp.createPizza() ;
        System.out.println(p.name);
        p.preparer();
        p.cuire();
        p.couper();
        p.emballer();

    }

}
