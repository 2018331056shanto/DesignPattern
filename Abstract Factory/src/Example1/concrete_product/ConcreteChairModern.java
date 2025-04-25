package Example1.concrete_product;

import Example1.abstract_product.Chair;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:5:54 PM
 */
public class ConcreteChairModern implements Chair {
    @Override
    public void hasLags() {
        System.out.println("chair has 4 lags in modern design");
    }

    @Override
    public void sitOn() {
        System.out.println("in chair se can sit very nicely in modern design ");
    }

    @Override
    public void inPair() {
        System.out.println("it can be in pairs in modern design");

    }
}
