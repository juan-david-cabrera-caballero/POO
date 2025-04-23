<?php

require_once 'Employee.php';
require_once 'Overtime.php';
require_once 'Health.php';
require_once 'Pension.php';
require_once 'Arl.php';
require_once 'SalaryCalculator.php';

$employee = new Employee("Juan Pérez", 1000, 100);
$overtime = new Overtime();
$overtime->setDayTime(5);
$overtime->setDayRate(0.02);
$healthDeduction = new Health();
$pensionDeduction = new Pension();
$arlDeduction = new Arl();
$arlDeduction->setRisk(3);

$finalSalary = SalaryCalculator::calculateEmployeeSalary($employee, $overtime, $healthDeduction, $pensionDeduction, $arlDeduction);

echo "Salario de " . $employee->getName() . ": $" . number_format($finalSalary, 2) . "\n";

?>