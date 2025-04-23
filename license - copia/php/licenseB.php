<?php

include_once "license.php";

class LicenseB extends License {
    public function __construct() {
        parent::__construct("LICENSE B", "60 HORAS", 1500000); // Llama al constructor de la clase base
    }

    public function calculateCost(): float {
        return $this->getCost(); // Retorna el costo desde la clase base
    }
}

?><?php

