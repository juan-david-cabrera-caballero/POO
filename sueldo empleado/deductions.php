<?php

class Deductions {
    private float $baseSalary = 0.0; // Inicializar con valor predeterminado
    private float $percentage = 0.0; // Inicializar con valor predeterminado

    public function __construct(float $baseSalary = 0.0, float $percentage = 0.0) {
        if ($baseSalary < 0) {
            throw new InvalidArgumentException("El salario base no puede ser negativo.");
        }

        if ($percentage < 0 || $percentage > 1) {
            throw new InvalidArgumentException("El porcentaje debe estar entre 0 y 1.");
        }

        $this->baseSalary = $baseSalary;
        $this->percentage = $percentage;
    }

    public function setBaseSalary(float $baseSalary): void {
        if ($baseSalary < 0) {
            throw new InvalidArgumentException("El salario base no puede ser negativo.");
        }
        $this->baseSalary = $baseSalary;
    }

    public function getBaseSalary(): float {
        return $this->baseSalary;
    }

    public function setPercentage(float $percentage): void {
        if ($percentage < 0 || $percentage > 1) {
            throw new InvalidArgumentException("El porcentaje debe estar entre 0 y 1.");
        }
        $this->percentage = $percentage;
    }

    public function getPercentage(): float {
        return $this->percentage;
    }

    public function calculatedDeductions(): float {
        if ($this->baseSalary <= 0) {
            throw new InvalidArgumentException("El salario base debe ser mayor a 0.");
        }

        if ($this->percentage <= 0 || $this->percentage > 1) {
            throw new InvalidArgumentException("El porcentaje debe estar entre 0 y 1.");
        }

        return $this->baseSalary * $this->percentage;
    }
}

?>