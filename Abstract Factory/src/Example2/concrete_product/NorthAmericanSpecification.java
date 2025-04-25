package Example2.concrete_product;

import Example2.abstract_product.CarSpecification;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:16 PM
 */
public class NorthAmericanSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");

    }
}
