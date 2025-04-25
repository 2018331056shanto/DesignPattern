package Example2.abstract_factory;

import Example2.abstract_product.Car;
import Example2.abstract_product.CarSpecification;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:17 PM
 */
public interface CarFactory {
    Car createCar();
    CarSpecification createCarSpecification();
}
