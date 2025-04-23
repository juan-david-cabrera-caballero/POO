<?php

require_once 'Deductions.php';

class Health extends Deductions {
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