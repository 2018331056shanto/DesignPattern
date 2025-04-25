package Example2.concrete_abstract_factory;

import Example2.abstract_factory.CarFactory;
import Example2.abstract_product.Car;
import Example2.abstract_product.CarSpecification;
import Example2.concrete_product.EuropeanSpecification;
import Example2.concrete_product.Hatback;
import Example2.concrete_product.NorthAmericanSpecification;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:18 PM
 */
public class NorthAmericanFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Hatback();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericanSpecification();
    }
}
