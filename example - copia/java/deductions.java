public class deductions {
    protected double healthRate;
    protected double pensionRate;
    protected double arlRate;

    public deductions(double healthRate, double pensionRate, double arlRate) {
        this.healthRate = healthRate;
        this.pensionRate = pensionRate;
        this.arlRate = arlRate;
    }

    public deductions() {
        this(0.12, 0.16, 0.052); // Default values
    }

    public double discounts(double salary) {
        return 0; // This method will be overridden in child classes
    }

    float getHealthRate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void setHealthRate(float healthRate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}