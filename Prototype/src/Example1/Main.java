package Example1;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:06 PM</p>
 */
public class Main {
    public static void main(String[] args) {
        Shape clientPrototype=new Circle("red");
        ShapeClient shapeClient=new ShapeClient(clientPrototype);
        Shape redCircle=shapeClient.createShape();
        redCircle.draw();
    }
}
