public class square extends figureGeometric {
    private final double side;
    private double calculate;

    public square(double side) {
        super("Square", "Cuadrado");
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double calculateArea() {
        this.calculate= this.side*this.side;
        return this.calculate;
    }
}
