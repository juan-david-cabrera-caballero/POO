public class deductions {
    private double baseSalary; // Default value is 0.0
    private double percentage; // Default value is 0.0

    public deductions(double baseSalary, double percentage) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }

        if (percentage < 0 || percentage > 1) {
            throw new IllegalArgumentException("Percentage must be between 0 and 1.");
        }

        this.baseSalary = baseSalary;
        this.percentage = percentage;
    }

    public deductions() {
        this(0.0, 0.0); // Default constructor with default values
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setPercentage(double percentage) {
        if (percentage < 0 || percentage > 1) {
            throw new IllegalArgumentException("Percentage must be between 0 and 1.");
        }
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public double calculateDeductions() {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than 0.");
        }

        if (percentage <= 0 || percentage > 1) {
            throw new IllegalArgumentException("Percentage must be between 0 and 1.");
        }

        return baseSalary * percentage;
    }
}