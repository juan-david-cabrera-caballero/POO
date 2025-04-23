<?php

include_once "Plan.php";

class Basic extends plan {
    public function __construct() {
        parent::__construct("Básico", 20000, "Acceso general");
    }

    public function getServices() {
        return "Acceso general";
    }
}

?>
