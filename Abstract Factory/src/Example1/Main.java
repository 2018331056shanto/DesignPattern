package Example1;

import Example1.abstract_factory.AbstractFactory;
import Example1.abstract_product.Chair;
import Example1.abstract_product.Sofa;
import Example1.abstract_product.Table;
import Example1.concrete_abstract_factory.ConcreteModernFactory;
import Example1.concrete_abstract_factory.ConcreteOldFactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory factoryModern=new ConcreteModernFactory();

        Hello(factoryModern);

        System.out.println("===================================");

        AbstractFactory factoryOld=new ConcreteOldFactory();

        Hello(factoryOld);


    }

    private static void Hello(AbstractFactory factoryOld) {
        Chair chairOld=factoryOld.createChair();
        chairOld.hasLags();
        chairOld.inPair();
        chairOld.sitOn();
        System.out.println("===================================");

        Sofa sofaOld=factoryOld.createSofa();
        sofaOld.hasLags();
        sofaOld.softCushion();
        sofaOld.sitOn();
        System.out.println("===================================");

        Table tableOld=factoryOld.createTable();
        tableOld.hasLags();
        tableOld.putDishes();
    }
}