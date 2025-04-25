package Example1.abstract_factory;

import Example1.abstract_product.Chair;
import Example1.abstract_product.Sofa;
import Example1.abstract_product.Table;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/25/2025<br>
 * Time:6:03 PM
 */
public interface AbstractFactory {
    Sofa createSofa();
    Table createTable();
    Chair createChair();
}
