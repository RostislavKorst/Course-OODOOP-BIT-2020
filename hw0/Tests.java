import org.junit.Test;

public class Tests {
    @Test
    public void testComputeAreaSquare() {
        Square ex = new Square(9);
        assert ex.computeArea() == 81;
    }

    @Test
    public void testComputeAreaSquareZero() {
        Square ex = new Square();
        assert ex.computeArea() == 0;
    }

    @Test
    public void testComputeAreaRectangle() {
        Rectangle ex = new Rectangle(2, 3);
        assert ex.computeArea() == 6;
    }

    @Test
    public void testComputeAreaRectangleZero() {
        Rectangle ex = new Rectangle();
        assert ex.computeArea() == 0;
    }

    @Test
    public void testComputeAreaCircle() {
        Circle ex = new Circle(4);
        assert ex.computeArea() == 4 * 4 * Math.PI;
    }

    @Test
    public void testComputeAreaCircleZero() {
        Circle ex = new Circle();
        assert ex.computeArea() == 0;
    }
}
