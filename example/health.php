<?php

require_once 'deductions.php';

class health extends deductions {
    public function __construct(float $healthRate = 0.12) {
        parent::__construct($healthRate, 0, 0); // Pension y Arl en 0 para esta clase
    }

    public function discounts(float $salary): float {
        return $salary * $this->healthRate;
    }
}

?>