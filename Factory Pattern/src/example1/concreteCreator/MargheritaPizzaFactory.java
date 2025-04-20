package example1.concreteCreator;

import example1.concreteProduct.MargheritaPizza;
import example1.creator.PizzaFactory;
import example1.product.Pizza;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:6:44 AM
 */
public class MargheritaPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
