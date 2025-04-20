package example1.concreteProduct;

import example1.product.Pizza;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:6:39 AM
 */
public class MargheritaPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Addd extra Margherita Piza at this pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake thi MargheritaPizza pizza at 450 degree celcius");
    }

    @Override
    public void cut() {
        System.out.println("Cut this MargheritaPizza pizza at 9 slices");
    }

    @Override
    public void box() {
        System.out.println("Box this MargheritaPizza pizza at red box");
    }
}
