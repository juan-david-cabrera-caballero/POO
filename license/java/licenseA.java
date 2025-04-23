public class licenseA extends license {

    public licenseA() {
        super("LICENSE A", "45 HORAS", 1000000); 
    }

    @Override
    public double CalculateCost() {
        return getCost(); 
    }
}