package Example1.concrete_product;

import Example1.abstract_product.Sofa;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:5:55 PM
 */
public class ConcreteSofaModern implements Sofa {
    @Override
    public void hasLags() {
        System.out.println("it has more that 4 lags in modern design");
    }

    @Override
    public void sitOn() {
        System.out.println("we can sit on it in modern design");

    }

    @Override
    public void softCushion() {

        System.out.println("It has very soft cushion in modern design");
    }
}
