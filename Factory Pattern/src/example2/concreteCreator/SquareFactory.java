package example2.concreteCreator;

import example2.Creator.ShapeFactory;
import example2.concreteProduct.Square;
import example2.product.Shape;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:7:04 AM
 */
public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
