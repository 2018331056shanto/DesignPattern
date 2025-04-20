package example2.concreteProduct;

import example2.product.Shape;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:7:00 AM
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw the Square");
    }

    @Override
    public void color() {
        System.out.println("Color the square with green");
    }

    @Override
    public void erase() {
        System.out.println("Erase the square");
    }
}
