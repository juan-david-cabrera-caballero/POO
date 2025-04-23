public class index {
    public index(String[] args) {
        Employee employee = new Employee("Juan Pérez", 1000, 100);
        Overtime overtime = new Overtime();
        overtime.setDayTime(5);
        overtime.setDayRate(0.02);
        Health healthDeduction = new Health();
        Pension pensionDeduction = new Pension();
        Arl arlDeduction = new Arl();
        arlDeduction.setRisk(3);

        double finalSalary = SalaryCalculator.calculateEmployeeSalary(
            employee, overtime, healthDeduction, pensionDeduction, arlDeduction
        );

        System.out.printf("Salario de %s: $%.2f%n", employee.getName(), finalSalary);
    }
}

class Employee {
    private final String name;
    private final double baseSalary;
    private final double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }
}

class Overtime {
    private int dayTime;
    private double dayRate;

    public void setDayTime(int dayTime) {
        this.dayTime = dayTime;
    }

    public void setDayRate(double dayRate) {
        this.dayRate = dayRate;
    }

    public double calculateOvertimePay() {
        return dayTime * dayRate;
    }
}

class Health {
    public double calculateDeduction(double baseSalary) {
        return baseSalary * 0.04; // Ejemplo: 4% de deducción
    }
}

class Pension {
    public double calculateDeduction(double baseSalary) {
        return baseSalary * 0.04; // Ejemplo: 4% de deducción
    }
}

class Arl {
    private int risk;

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public double calculateDeduction(double baseSalary) {
        return baseSalary * (0.005 * risk); // Ejemplo: deducción basada en el riesgo
    }
}

class SalaryCalculator {
    public static double calculateEmployeeSalary(
        Employee employee, Overtime overtime, Health health, Pension pension, Arl arl
    ) {
        double baseSalary = employee.getBaseSalary();
        double bonus = employee.getBonus();
        double overtimePay = overtime.calculateOvertimePay();
        double healthDeduction = health.calculateDeduction(baseSalary);
        double pensionDeduction = pension.calculateDeduction(baseSalary);
        double arlDeduction = arl.calculateDeduction(baseSalary);

        return baseSalary + bonus + overtimePay - healthDeduction - pensionDeduction - arlDeduction;
    }
}