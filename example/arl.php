<?php

require_once 'Deductions.php';

class arl extends Deductions {
    protected $arlRate;

    public function __construct(float $arlRate = 0.052) {
        parent::__construct(0, 0, $arlRate); // Salud y Pension en 0 para esta clase
        $this->arlRate = $arlRate;
    }

    public function discounts(float $salary): float {
        return $salary * $this->arlRate;
    }
}

?>