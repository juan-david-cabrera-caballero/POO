<?php

class Overtime {
    private float $dayTime = 0.0; // Inicializar con valor predeterminado
    private float $nightTime = 0.0; // Inicializar con valor predeterminado
    private float $holidayTime = 0.0; // Inicializar con valor predeterminado
    private float $dayRate = 0.0; // Inicializar con valor predeterminado
    private float $nightRate = 0.0; // Inicializar con valor predeterminado
    private float $holidayRate = 0.0; // Inicializar con valor predeterminado

    public function setDayTime(float $dayTime): void {
        $this->dayTime = $dayTime;
    }

    public function setNightTime(float $nightTime): void {
        $this->nightTime = $nightTime;
    }

    public function setHolidayTime(float $holidayTime): void {
        $this->holidayTime = $holidayTime;
    }

    public function setDayRate(float $dayRate): void {
        $this->dayRate = $dayRate;
    }

    public function setNightRate(float $nightRate): void {
        $this->nightRate = $nightRate;
    }

    public function setHolidayRate(float $holidayRate): void {
        $this->holidayRate = $holidayRate;
    }

    public function calculatedSalary(float $baseSalary): float {
        $hourlyRate = $baseSalary / 240; // Asumiendo 240 horas laborales al mes
        $dayOvertime = $this->dayTime * $hourlyRate * $this->dayRate;
        $nightOvertime = $this->nightTime * $hourlyRate * $this->nightRate;
        $holidayOvertime = $this->holidayTime * $hourlyRate * $this->holidayRate;

        return $dayOvertime + $nightOvertime + $holidayOvertime;
    }
}

?>