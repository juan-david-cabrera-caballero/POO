<?php

require_once 'person.php';
require_once 'health.php';
require_once 'pension.php';
require_once 'arl.php';

class coach extends person {
    private $valueDays;
    private $numDays;
    private $totalClients;
    private $healthDeduction;
    private $pensionDeduction;
    private $arlDeduction;

    public function __construct(int $identification, string $job, int $transport, int $valueDays, int $numDays) {
        parent::__construct($identification, $job, $transport);
        $this->valueDays = $valueDays;
        $this->numDays = $numDays;
        $this->totalClients = 0;
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

    public function getTotalClients(): int {
        return $this->totalClients;
    }

    public function setTotalClients(int $totalClients): void {
        $this->totalClients = $totalClients;
    }

    public function addClient(): void {
        $this->totalClients++;
    }

    public function calculateBaseSalary(): float {
        return ($this->valueDays * $this->numDays) + (100 * $this->totalClients);
    }

    public function calculateDeductions(float $salary): float {
        return $this->healthDeduction->discounts($salary) +
               $this->pensionDeduction->discounts($salary) +
               $this->arlDeduction->discounts($salary);
    }
}

?>