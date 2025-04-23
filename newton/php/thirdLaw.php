<?php

include_once "Law.php";

class ThirdLaw extends Law {
    public function __construct() {
        parent::__construct("Third Law of Motion");
    }

    public function explain(): void {
        echo "3rd Law: For every action, there is an equal and opposite reaction.";
    }

    public function calculate(): void {
        echo "No calculation required. The principle applies directly.";
    }
}

?>