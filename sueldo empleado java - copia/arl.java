public class arl {
    private double baseSalary;
    private double percentage;

    public arl() {
        this.baseSalary = 0.0;
        this.percentage = 0.005; // Porcentaje predeterminado para ARL (0.5%)
    }

    /**
     * Establece el salario base.
     * 
     * @param baseSalary El salario base del empleado.
     * @throws IllegalArgumentException Si el salario base es negativo.
     */
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo.");
        }
        this.baseSalary = baseSalary;
    }

    /**
     * Obtiene el salario base.
     * 
     * @return El salario base.
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Establece el porcentaje de deducción.
     * 
     * @param percentage El porcentaje de deducción (entre 0 y 1).
     * @throws IllegalArgumentException Si el porcentaje no está en el rango válido.
     */
    public void setPercentage(double percentage) {
        if (percentage < 0 || percentage > 1) {
            throw new IllegalArgumentException("El porcentaje debe estar entre 0 y 1.");
        }
        this.percentage = percentage;
    }

    /**
     * Obtiene el porcentaje de deducción.
     * 
     * @return El porcentaje de deducción.
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * Calcula las deducciones de ARL basadas en el salario base y el porcentaje.
     * 
     * @return El monto de las deducciones.
     */
    public double calculatedDeductions() {
        return baseSalary * percentage;
    }
}