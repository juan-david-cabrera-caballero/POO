<?php

require_once 'Person.php';
require_once 'Health.php';
require_once 'Pension.php';
require_once 'Arl.php';

class Supervisor extends Person {
    private $valueDays;
    private $numDays;
    private $coachComplete;
    private $healthDeduction;
    private $pensionDeduction;
    private $arlDeduction;

    public function __construct(int $identification, string $job, int $transport, int $valueDays, int $numDays) {
        parent::__construct($identification, $job, $transport);
        $this->valueDays = $valueDays;
        $this->numDays = $numDays;
        $this->coachComplete = false;
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

    public function isCoachComplete(): bool {
        return $this->coachComplete;
    }

    public function setCoachComplete(bool $coachComplete): void {
        $this->coachComplete = $coachComplete;
    }

    public function calculateBaseSalary(): float {
        $baseSalary = 1500;
        return $baseSalary + ($this->valueDays * $this->numDays) + ($this->coachComplete ? 200 : 0);
    }

    public function calculateDeductions(float $salary): float {
        return $this->healthDeduction->discounts($salary) +
               $this->pensionDeduction->discounts($salary) +
               $this->arlDeduction->discounts($salary);
    }
}

?>