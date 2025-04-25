package Example1.concrete_product;

import Example1.abstract_product.Table;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:5:58 PM
 */
public class ConcreteTableModern implements Table {
    @Override
    public void hasLags() {
        System.out.println("It has lags in modern design");
    }

    @Override
    public void putDishes() {
        System.out.println("we can put dishes in modern design");
    }
}
