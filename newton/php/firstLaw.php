<?php

include_once "Law.php";

class FirstLaw extends Law {

    public function __construct() {
        parent::__construct("First Law of Motion");
    }

    public function explain(): void {
        echo "1st Law: An object will remain at rest or in uniform motion unless acted upon by an external force.\n";
    }

    public function calculate(): void {
        echo "No calculation is needed for the First Law.\n";
    }
}

?>

