package Example2;

import Example1.abstract_factory.AbstractFactory;
import Example2.abstract_factory.CarFactory;
import Example2.abstract_product.Car;
import Example2.abstract_product.CarSpecification;
import Example2.concrete_abstract_factory.EuropeanFactory;
import Example2.concrete_abstract_factory.NorthAmericanFactory;
import Example2.concrete_product.Sedan;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:13 PM
 */
public class Main {
    public static void main(String[] args) {

        CarFactory northAmericanFactory=new NorthAmericanFactory();

        factory(northAmericanFactory);

        System.out.println("===============================");

        CarFactory europeanFactory=new EuropeanFactory();
        factory(europeanFactory);

    }

    public static void factory(CarFactory factory) {

        Car car=factory.createCar();
        CarSpecification carSpecification=factory.createCarSpecification();
        car.assemble();
        carSpecification.display();


    }
}
