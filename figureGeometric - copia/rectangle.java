public class rectangle extends figureGeometric {
    private final double base;
    private final double height;
    private double calculate;

    
public rectangle(double base, double height) {
        super("rectangle", "rectangulo");
        this.base = base;
        this.height = height;
    }

    
    public double getBase() {
        
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public double calculateArea() {
        this.calculate= this.getBase()*this.getHeight();
        return this.calculate;
    }
}
