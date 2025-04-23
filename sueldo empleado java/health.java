public class health {
    private double baseSalary;
    private double percentage;

    /**
     * Establece el salario base.
     * 
     * @param baseSalary El salario base del empleado.
     * @throws IllegalArgumentException Si el salario base es menor o igual a 0.
     */
    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("El salario base debe ser mayor a 0.");
        }
        this.baseSalary = baseSalary;
    }

    /**
     * Establece el porcentaje de deducción.
     * 
     * @param percentage El porcentaje de deducción (entre 0 y 1).
     * @throws IllegalArgumentException Si el porcentaje no está en el rango válido.
     */
    public void setPercentage(double percentage) {
        if (percentage <= 0 || percentage > 1) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 1.");
        }
        this.percentage = percentage;
    }

    /**
     * Calcula las deducciones de salud basadas en el salario base y el porcentaje.
     * 
     * @return El monto de las deducciones.
     */
    public double calculatedDeductions() {
        return baseSalary * percentage;
    }
}