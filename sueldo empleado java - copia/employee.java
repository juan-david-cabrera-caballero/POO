public class employee extends persona {
    private double subsidy;

    public employee(String name, double baseSalary, double subsidy) {
        super(name, baseSalary);
        this.subsidy = subsidy;
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        super.setBaseSalary(baseSalary);
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * Calcula el salario total del empleado sumando el salario base y el subsidio.
     * 
     * @return El salario total del empleado.
     */
    public double calculateSalary() {
        return super.getBaseSalary() + subsidy;
    }

    /**
     * Método sobrescrito para calcular el salario total.
     * 
     * @return El salario total calculado.
     */
    @Override
    public double calculatedSalary() {
        return calculateSalary();
    }

    /**
     * Método adicional para calcular el salario base directamente.
     * 
     * @return El salario base del empleado.
     */
    public double calculatedBaseSalary() {
        return getBaseSalary();
    }
}