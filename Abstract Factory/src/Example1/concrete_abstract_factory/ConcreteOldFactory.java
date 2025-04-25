package Example1.concrete_abstract_factory;

import Example1.abstract_factory.AbstractFactory;
import Example1.abstract_product.Chair;
import Example1.abstract_product.Sofa;
import Example1.abstract_product.Table;
import Example1.concrete_product.ConcreteChairOld;
import Example1.concrete_product.ConcreteSofaOld;
import Example1.concrete_product.ConcreteTableOld;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:05 PM
 */
public class ConcreteOldFactory implements AbstractFactory {
    @Override
    public Sofa createSofa() {
        return new ConcreteSofaOld();
    }

    @Override
    public Table createTable() {
        return new ConcreteTableOld();
    }

    @Override
    public Chair createChair() {
        return new ConcreteChairOld();
    }
}
