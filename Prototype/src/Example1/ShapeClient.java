package Example1;

/**
 * @author: Ashraful Islam Shanto
 * <p>Date:7/15/25</p>
 * <p>Time:4:05 PM</p>
 */
public class ShapeClient {
    private Shape shapePrototype;
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }
    public Shape createShape() {
        return shapePrototype.clone();
    }
}
