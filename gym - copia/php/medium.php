<?php

include_once "Plan.php";

class Medium extends plan {
    public function __construct() {
        parent::__construct("Medio", 40000, "Acceso general + Clases dirigidas");
    }

    public function getServices() {
        return "Acceso general + Clases dirigidas";
    }
}

?>
