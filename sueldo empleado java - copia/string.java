class string {
    private String name;
    private double salary;

    public string(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", Monthly Salary: " + salary;
    }

    public static void main(String[] args) {
        string employee = new string("John Doe", 3000.0);
        System.out.println(employee);
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
    }
}
