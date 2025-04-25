package Example1.concrete_product;

import Example1.abstract_product.Table;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:00 PM
 */
public class ConcreteTableOld implements Table {
    @Override
    public void hasLags() {
        System.out.println("no lags in old design");
    }

    @Override
    public void putDishes() {
        System.out.println("we can put dishes in old design");
    }
}
