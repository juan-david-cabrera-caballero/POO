public class licenseC extends license {

    public licenseC() {
        super("LICENSE C", "90 HORAS", 2000000); 
    }

    @Override
    public double CalculateCost() {
        return getCost(); 
    }
}