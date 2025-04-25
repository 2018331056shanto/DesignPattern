package Example1.concrete_product;

import Example1.abstract_product.Chair;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:00 PM
 */
public class ConcreteChairOld implements Chair {
    @Override
    public void hasLags() {
        System.out.println("It has 5 lags in old design");
    }

    @Override
    public void sitOn() {
        System.out.println("It is not comfortable in old design");
    }

    @Override
    public void inPair() {
        System.out.println("it is not in pair in old design");
    }
}
