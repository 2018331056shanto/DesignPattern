package Example2.concrete_product;

import Example2.abstract_product.Car;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:15 PM
 */
public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan Car");

    }
}
