<?php

class person {
    protected $identification;
    protected $job;
    protected $transport;

    public function __construct(int $identification, string $job, int $transport) {
        $this->identification = $identification;
        $this->job = $job;
        $this->transport = $transport;
    }

    public function getIdentification(): int {
        return $this->identification;
    }

    public function setIdentification(int $identification): void {
        $this->identification = $identification;
    }

    public function getJob(): string {
        return $this->job;
    }

    public function setJob(string $job): void {
        $this->job = $job;
    }

    public function getTransport(): int {
        return $this->transport;
    }

    public function setTransport(int $transport): void {
        $this->transport = $transport;
    }

    public function calculateBaseSalary(): float {
        return 1000; // Salario base genérico
    }

    public function calculateDeductions(float $salary): float {
        return 0; // Lógica de deducciones puede ser implementada en clases hijas
    }

    public function salary(): float {
        $baseSalary = $this->calculateBaseSalary();
        $deductions = $this->calculateDeductions($baseSalary);
        return $baseSalary - $deductions;
    }
}

?>