public class arl extends deductions {
    public static void main(String[] args) {
        // Example usage of the arl class
        arl exampleArl = new arl();
        exampleArl.setArlRate(0.052);
        System.out.println("ARL Rate: " + exampleArl.arlRateLocal);
    }
    private double arlRateLocal;

    public arl(double arlRate) {
        super(0.0, 0.0, 0.0); // Adjusted to match deductions constructor
        this.arlRateLocal = arlRate;
    }
    public arl() {
        this(0.052); // Default ARL rate
    }

    @Override
    public double discounts(double salary) {
        // Example implementation
        return salary * 0.01; // 1% deduction
    }


    public void setArlRate(double arlRate) {
        this.arlRate = arlRate;
    }
}