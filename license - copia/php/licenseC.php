<?php

include_once "license.php";

class LicenseC extends License {
    public function __construct() {
        parent::__construct("LICENSE C", "90 HORAS", 2000000); 
    }

    public function calculateCost(): float {
        return $this->getCost(); 
    }
}

?>