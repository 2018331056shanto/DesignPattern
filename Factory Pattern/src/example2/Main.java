package example2;

import example2.Creator.ShapeFactory;
import example2.concreteCreator.CircleFactory;
import example2.concreteCreator.SquareFactory;
import example2.concreteCreator.TriangleFactory;
import example2.product.Shape;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:6:58 AM
 */
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory=new CircleFactory();
        Shape circle=shapeFactory.createShape();
        circle.draw();
        circle.color();
        circle.erase();

        System.out.println("======================================");

        ShapeFactory shapeFactory1=new TriangleFactory();
        Shape triangle=shapeFactory1.createShape();
        triangle.draw();
        triangle.color();
        triangle.erase();

        System.out.println("==========================================");


        ShapeFactory shapeFactory2=new SquareFactory();
        Shape square=shapeFactory2.createShape();
        square.draw();
        square.color();
        square.erase();

    }
}
