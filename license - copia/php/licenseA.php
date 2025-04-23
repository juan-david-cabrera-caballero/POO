<?php

include_once "license.php";

class LicenseA extends License {
    public function __construct() {
        parent::__construct("LICENSE A", "45 HORAS", 1000000); 
    }

    public function calculateCost(): float {
        return $this->getCost();
    }
}

?>