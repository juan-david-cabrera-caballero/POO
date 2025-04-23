<?php

abstract class Persona {
    protected string $name;
    protected float $baseSalary;

    public function __construct(string $name, float $baseSalary) {
        $this->name = $name;
        $this->baseSalary = $baseSalary;
    }

    public function getName(): string {
        return $this->name;
    }

    public function setName(string $name): void {
        $this->name = $name;
    }

    public function getBaseSalary(): float {
        return $this->baseSalary;
    }

    public function setBaseSalary(float $baseSalary): void {
        $this->baseSalary = $baseSalary;
    }

    abstract public function calculatedSalary(): float;
}

?>