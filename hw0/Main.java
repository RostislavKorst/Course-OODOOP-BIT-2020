public class Main {
    public static void main(String[] args) {
        Square ex1 = new Square(9);
        Rectangle ex2 = new Rectangle(3, 4);
        Circle ex3 = new Circle(5);
        ex1.displayInfo();
        ex2.displayInfo();
        ex3.displayInfo();
    }
}

interface Figure {
    void displayInfo();
    double computeArea();
}

class Rectangle implements Figure {
    final private double height, width;

    public Rectangle() {
        this.height = 0.;
        this.width = 0.;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void displayInfo() {
        System.out.printf("Rectangle height is %.2f\nRectangle width is %.2f\n", height, width);
    }

    public double computeArea() {
        return height * width;
    }
}

class Square implements Figure {
    final private double side;

    public Square() {
        this.side = 0.;
    }

    public Square(double side) {
        this.side = side;
    }

    public void displayInfo() {
        System.out.printf("Square side is %.2f\n", side);
    }

    public double computeArea() {
        return side * side;
    }
}

class Circle implements Figure {
    final private double radius;

    public Circle() {
        this.radius = 0.;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayInfo() {
        System.out.printf("Circle radius is %.2f", radius);
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
