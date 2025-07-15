package Example1;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:03 PM</p>
 */
public class Circle implements Shape {
    private String color;
    Circle(String color) {
        this.color = color;
    }
    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {

        System.out.println("Drawing Circle of "+color);
    }
}
