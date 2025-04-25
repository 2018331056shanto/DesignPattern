package Example2.concrete_product;

import Example2.abstract_product.CarSpecification;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:17 PM
 */
public class EuropeanSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");

    }
}
