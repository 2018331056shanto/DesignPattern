package example2.concreteCreator;

import example2.Creator.ShapeFactory;
import example2.concreteProduct.Triangle;
import example2.product.Shape;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:7:04 AM
 */
public class TriangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
