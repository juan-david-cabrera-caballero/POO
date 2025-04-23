<?php

require_once 'Person.php';
require_once 'Health.php';
require_once 'Pension.php';
require_once 'Arl.php';

class Administrator extends Person {
    private $valueDays;
    private $numDays;
    private $healthDeduction;
    private $pensionDeduction;
    private $arlDeduction;

    public function __construct(int $identification, string $job, int $transport, int $valueDays, int $numDays) {
        parent::__construct($identification, $job, $transport);
        $this->valueDays = $valueDays;
        $this->numDays = $numDays;
        $this->healthDeduction = new Health();
        $this->pensionDeduction = new Pension();
        $this->arlDeduction = new Arl();
    }

    public function getValueDays(): int {
        return $this->valueDays;
    }

    public function setValueDays(int $valueDays): void {
        $this->valueDays = $valueDays;
    }

    public function getNumDays(): int {
        return $this->numDays;
    }

    public function setNumDays(int $numDays): void {
        $this->numDays = $numDays;
    }

    public function calculateBaseSalary(): float {
        return 1200 + ($this->valueDays * $this->numDays);
    }

    public function calculateDeductions(float $salary): float {
        return $this->healthDeduction->discounts($salary) +
               $this->pensionDeduction->discounts($salary) +
               $this->arlDeduction->discounts($salary);
    }
}

?>