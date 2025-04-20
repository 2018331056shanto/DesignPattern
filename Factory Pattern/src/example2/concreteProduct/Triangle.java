package example2.concreteProduct;

import example2.product.Shape;

/**
 * Author: Ashraful Islam Shanto<br>
 * Date:4/20/2025<br>
 * Time:6:59 AM
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw the triangle");
    }

    @Override
    public void color() {
        System.out.println("Color the triangle with yellow");
    }

    @Override
    public void erase() {
        System.out.println("Erase the triangle");
    }
}
