package example1;

import example1.concreteCreator.MargheritaPizzaFactory;
import example1.concreteCreator.PepperoniPizzaFactory;
import example1.creator.PizzaFactory;
import example1.product.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory=new MargheritaPizzaFactory();
        Pizza pizza= pizzaFactory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("=====================================================================================");
        PizzaFactory pizzaFactory1=new PepperoniPizzaFactory();
        Pizza pizza1=pizzaFactory1.createPizza();
        pizza1.prepare();
        pizza1.bake();
        pizza1.cut();
        pizza1.box();
    }
}