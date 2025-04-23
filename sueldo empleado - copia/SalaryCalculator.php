<?php

class SalaryCalculator {
    public static function calculateEmployeeSalary(Employee $employee, Overtime $overtime = null, Health $healthDeduction = null, Pension $pensionDeduction = null, Arl $arlDeduction = null): float {
        $baseSalary = $employee->getBaseSalary();
        $totalSalary = $employee->calculatedSalary();

        if ($overtime) {
            $totalSalary += $overtime->calculatedSalary($baseSalary);
        }

        if ($healthDeduction) {
            // Configurar el salario base y el porcentaje en el objeto Health
            $healthDeduction->setBaseSalary($baseSalary);
            $healthDeduction->setPercentage(0.04); // Configurar el porcentaje de salud (4%)
            $totalSalary -= $healthDeduction->calculatedDeductions();
        }

        if ($pensionDeduction) {
            // Configurar el salario base y el porcentaje en el objeto Pension
            $pensionDeduction->setBaseSalary($baseSalary);
            $pensionDeduction->setPercentage(0.04); // Configurar el porcentaje de pensión (4%)
            $totalSalary -= $pensionDeduction->calculatedDeductions();
        }

        if ($arlDeduction) {
            // Configurar el salario base en el objeto Arl
            $arlDeduction->setBaseSalary($baseSalary);
            $totalSalary -= $arlDeduction->calculatedDeductions();
        }

        return $totalSalary;
    }
}

?>