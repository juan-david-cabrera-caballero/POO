<?php

require_once 'deductions.php';

class pension extends deductions {
    public function __construct(float $pensionRate = 0.16) {
        parent::__construct(0, $pensionRate, 0); // Salud y Arl en 0 para esta clase
    }

    public function discounts(float $salary): float {
        return $salary * $this->pensionRate;
    }
}

?>