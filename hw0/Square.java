class Square implements Figure {
    final private double side;

    public Square(double side) {
        if(side <= 0) {
            throw new IllegalArgumentException("Side should be positive");
        }
        this.side = side;
    }

    public void displayInfo() {
        System.out.printf("Square side is %.2f\n", side);
    }

    public double computeArea() {
        return side * side;
    }
}
