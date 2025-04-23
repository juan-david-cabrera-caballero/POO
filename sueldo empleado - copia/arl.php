<?php

require_once 'Deductions.php';

class Arl extends Deductions {
    private int $risk = 0;
    private array $riskPercentages = [
        1 => 0.00522, // Riesgo 1: 0.522%
        2 => 0.01044, // Riesgo 2: 1.044%
        3 => 0.02436, // Riesgo 3: 2.436%
        4 => 0.04350, // Riesgo 4: 4.350%
        5 => 0.06960  // Riesgo 5: 6.960%
    ];

    public function setRisk(int $risk): void {
        if ($risk < 1 || $risk > 5) {
            throw new InvalidArgumentException("El nivel de riesgo debe estar entre 1 y 5.");
        }

        $this->risk = $risk;
        $this->setPercentage($this->riskPercentages[$risk]);
    }

    public function getRisk(): int {
        return $this->risk;
    }

    public function calculatedDeductions(): float {
        if ($this->getBaseSalary() <= 0) {
            throw new InvalidArgumentException("El salario base debe ser mayor a 0.");
        }

        if ($this->getPercentage() <= 0 || $this->getPercentage() > 1) {
            throw new InvalidArgumentException("El porcentaje debe estar entre 0 y 1.");
        }

        return $this->getBaseSalary() * $this->getPercentage();
    }
}

?>