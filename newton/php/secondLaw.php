<?php

include_once "Law.php";

class SecondLaw extends Law {
    private float $mass;
    private float $acceleration;
    private float $force;

    public function __construct() {
        parent::__construct("Second Law of Motion");
    }

    public function explain(): void {
        echo "2nd Law: The force acting on an object is equal to its mass times its acceleration (F = m * a).<br>";
    }

    public function renderForm(): void {
        echo '<form method="POST" action="">
                <label for="mass">Mass (kg):</label>
                <input type="number" step="0.01" name="mass" id="mass" required><br><br>
                
                <label for="acceleration">Acceleration (m/s^2):</label>
                <input type="number" step="0.01" name="acceleration" id="acceleration" required><br><br>
                
                <button type="submit">Calculate Force</button>
              </form>';
    }

    public function calculate(): void {
        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            $mass = isset($_POST['mass']) ? (float) $_POST['mass'] : 0;
            $acceleration = isset($_POST['acceleration']) ? (float) $_POST['acceleration'] : 0;

            if ($mass > 0 && $acceleration > 0) {
                $this->mass = $mass;
                $this->acceleration = $acceleration;
                $this->force = $this->mass * $this->acceleration;

                echo "Force (F) = " . number_format($this->force, 2) . " N<br>";
            } else {
                echo "Both mass and acceleration must be positive numbers.<br>";
            }
        }
    }
}

// Uso de la clase
$secondLaw = new SecondLaw();
$secondLaw->explain();
$secondLaw->renderForm();
$secondLaw->calculate();

?>