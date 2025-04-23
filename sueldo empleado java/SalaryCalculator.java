public class SalaryCalculator {

    public static double calculateEmployeeSalary(employee employee, overTime overTime, health healthDeduction, pension pensionDeduction, arl arlDeduction) {
        double baseSalary = employee.getBaseSalary();
        double totalSalary = employee.calculatedSalary();

        if (overTime != null) {
            totalSalary += overTime.calculatedSalary(baseSalary);
        }

        if (healthDeduction != null) {
            // Configure the base salary and percentage in the Health object
            healthDeduction.setBaseSalary(baseSalary);
            healthDeduction.setPercentage(0.04); // Set health percentage (4%)
            totalSalary -= healthDeduction.calculatedDeductions();
        }

        if (pensionDeduction != null) {
            // Configure the base salary and percentage in the Pension object
            pensionDeduction.setBaseSalary(baseSalary);
            pensionDeduction.setPercentage(0.04); // Set pension percentage (4%)
            totalSalary -= pensionDeduction.calculatedDeductions();
        }

        if (arlDeduction != null) {
            // Configure the base salary in the Arl object
            arlDeduction.setBaseSalary(baseSalary);
            totalSalary -= arlDeduction.calculatedDeductions();
        }

        return totalSalary;
    }
}