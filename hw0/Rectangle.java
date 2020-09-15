class Rectangle implements Figure {
    final private double height, width;

    public Rectangle(double height, double width) {
        if (height <= 0 || width <= 0) {
            throw new IllegalArgumentException("Height and width should be positive");
        }
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