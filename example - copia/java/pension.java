public class pension extends deductions {
    private final float localPensionRate;

    pension() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public double discounts(double salary) {
        // Example implementation
        return salary * 0.05; // 5% deduction
    }
    public pension(float pensionRate) {
        super(0, pensionRate, 0); // Salud y Arl en 0 para esta clase
        this.pensionRate = pensionRate;
        this.localPensionRate = pensionRate;
    }

    public float discounts(float salary) {
        return salary * this.localPensionRate;
    }

    public float getPensionRate() {
        return localPensionRate;
    }
}