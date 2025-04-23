public class overTime {
    private double hoursWorked;
    private double hourlyRate;

   
    public overTime(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    
    public double calculatedSalary(double baseSalary) {
        double overtimeSalary = hoursWorked * hourlyRate;

        double bonus = baseSalary * 0.1; 

        return overtimeSalary + bonus;
    }
}