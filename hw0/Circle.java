class Circle implements Figure {
    final private double radius;

    public Circle(double radius) {
        if(radius <= 0) {
            throw new IllegalArgumentException("Radius should be positive");
        }
        this.radius = radius;
    }

    public void displayInfo() {
        System.out.printf("Circle radius is %.2f", radius);
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
