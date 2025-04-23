<?php

require_once 'coach.php';
require_once 'supervisor.php';
require_once 'administrator.php';
require_once 'roster.php';

// Ejemplo de uso:
$coach1 = new coach(12345, "Entrenador de Fútbol", 50, 30, 20);
$coach1->addClient();
$coach1->addClient();
echo "Salario neto del entrenador: $" . $coach1->salary() . "\n";

$supervisor1 = new supervisor(67890, "Supervisor Deportivo", 100, 25, 20);
$supervisor1->setCoachComplete(true);
echo "Salario neto del supervisor: $" . $supervisor1->salary() . "\n";

$administrator1 = new administrator(13579, "Administrador de Gimnasio", 80, 22, 15); // Added $numDays argument
echo "Salario neto del administrador: $" . $administrator1->salary() . "\n";

?>