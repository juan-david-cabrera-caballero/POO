public class circle extends figureGeometric {
    private final double radius;
    private final double pi;
    private double calculate;

    public circle(double radius) {
        super("circle", "circulo");
        this.radius = radius;
        this.pi = 3.1416;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getPi() {
        return this.pi;
    }

    @Override
    public double calculateArea() {
        this.calculate= this.getRadius()*this.getRadius()*this.getPi();
        return this.calculate;
    }
}
