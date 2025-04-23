<?php

include_once "Plan.php";

class Premium extends plan {
    public function __construct() {
        parent::__construct("Premium", 120000, "Acceso general + Clases dirigidas + Entrenador personal + Zona húmeda");
    }

    public function getServices() {
        return "Acceso general + Clases dirigidas + Entrenador personal + Zona húmeda";
    }
}

?>
