<?php

require_once 'Persona.php';

class Employee extends Persona {
    private float $subsidy;

    public function __construct(string $name, float $baseSalary, float $subsidy) {
        parent::__construct($name, $baseSalary);
        $this->subsidy = $subsidy;
    }

    public function getSubsidy(): float {
        return $this->subsidy;
    }

    public function setSubsidy(float $subsidy): void {
        $this->subsidy = $subsidy;
    }

    public function calculatedSalary(): float {
        return $this->baseSalary + $this->subsidy;
    }
}

?>