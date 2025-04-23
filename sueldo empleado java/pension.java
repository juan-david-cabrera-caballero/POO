public class pension {
    private double baseSalary;
    private double percentage;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double calculatedDeductions() {
        return baseSalary * percentage;
    }
}
