package Example1.concrete_abstract_factory;

import Example1.abstract_factory.AbstractFactory;
import Example1.abstract_product.Chair;
import Example1.abstract_product.Sofa;
import Example1.abstract_product.Table;
import Example1.concrete_product.ConcreteChairModern;
import Example1.concrete_product.ConcreteSofaModern;
import Example1.concrete_product.ConcreteTableModern;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:04 PM
 */
public class ConcreteModernFactory implements AbstractFactory {
    @Override
    public Sofa createSofa() {
        return new ConcreteSofaModern();
    }

    @Override
    public Table createTable() {
        return new ConcreteTableModern();
    }

    @Override
    public Chair createChair() {
        return new ConcreteChairModern();
    }
}
