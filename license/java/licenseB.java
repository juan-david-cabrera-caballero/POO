public class licenseB extends license {

    public licenseB() {
        super("LICENSE B", "60 HORAS", 1500000); 
    }

    @Override
    public double CalculateCost() {
        return getCost(); 
    }
}