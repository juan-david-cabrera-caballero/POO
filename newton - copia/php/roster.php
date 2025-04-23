<?php
include_once "FirstLaw.php";
include_once "SecondLaw.php";
include_once "ThirdLaw.php";

// Verificar si se envió el formulario
if (!isset($_POST['law'])) {
    echo "No option selected. Please go back and select a law.\n";
    exit;
}

// Obtener la opción seleccionada
$option = (int) $_POST['law'];

// Procesar la opción seleccionada
switch ($option) {
    case 1:
        $law = new FirstLaw();
        break;
    case 2:
        $law = new SecondLaw();
        break;
    case 3:
        $law = new ThirdLaw();
        break;
    default:
        echo "Invalid option.\n";
        exit;
}

// Ejecutar los métodos de la clase seleccionada
echo "<h1>Newton's Law Explanation</h1>";
$law->explain();
$law->calculate();

?>