package Example1.concrete_product;

import Example1.abstract_product.Sofa;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:01 PM
 */
public class ConcreteSofaOld implements Sofa {
    @Override
    public void hasLags() {
        System.out.println("it has no  lags in old design");
    }

    @Override
    public void sitOn() {
        System.out.println("it is sitOn in old design");
    }

    @Override
    public void softCushion() {
        System.out.println("no soft cushion in old design");
    }
}
