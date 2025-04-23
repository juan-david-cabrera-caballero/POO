<?php

include_once "licenseA.php";
include_once "licenseB.php";
include_once "licenseC.php";
include_once "student.php";

// Simular los datos del estudiante
$studentName = "John";
$lastName = "Doe";
$identification = "123456789";
$direction = "123 Main Street";
$phone = "555-1234";
$rh = "O+";

// Simular la selección de licencia
$choice = 1; // Cambia este valor a 1, 2 o 3 para probar diferentes licencias

// Crear la licencia seleccionada
$selectedLicense = null;
if ($choice === 1) {
    $selectedLicense = new LicenseA();
} elseif ($choice === 2) {
    $selectedLicense = new LicenseB();
} elseif ($choice === 3) {
    $selectedLicense = new LicenseC();
} else {
    echo "Invalid choice. Exiting program.\n";
    exit;
}

// Crear el objeto Student con los datos ingresados
$student = new Student($studentName, $lastName, $identification, $direction, $phone, $rh, $selectedLicense);

// Mostrar los datos del estudiante registrado
echo "\n--- Student Registered ---\n";
echo "Name: " . $student->getName() . "\n";
echo "Last Name: " . $student->getLastName() . "\n";
echo "Identification: " . $student->getIdentification() . "\n";
echo "Direction: " . $student->getDirection() . "\n";
echo "Phone: " . $student->getPhone() . "\n";
echo "RH: " . $student->getRh() . "\n";
echo "License: " . $selectedLicense->getName() . "\n";
echo "Duration: " . $selectedLicense->getDuration() . "\n";
echo "Cost: $" . $selectedLicense->getCost() . "\n";

?>