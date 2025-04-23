public class health extends deductions {
    @Override
    public double discounts(double salary) {
        // Example implementation
        return salary * 0.04; // 4% deduction  
    }
    public health(float healthRate) {
        super(healthRate, 0, 0); // Pension and ARL set to 0 for this class
        super.setHealthRate(healthRate); // Use setter from parent class
    }

    public health() {
        this(0.12f); // Default health rate is 12%
    }

    public float calculateDiscount(float salary) {
        return salary * super.getHealthRate(); // Use getter from parent class
    }
}