<?php

include_once "license.php";

class Student {
    private string $name;
    private string $lastName;
    private string $identification;
    private string $direction;
    private string $phone;
    private string $rh;
    private License $license;

    public function __construct(
        string $name,
        string $lastName,
        string $identification,
        string $direction,
        string $phone,
        string $rh,
        License $license
    ) {
        $this->name = $name;
        $this->lastName = $lastName;
        $this->identification = $identification;
        $this->direction = $direction;
        $this->phone = $phone;
        $this->rh = $rh;
        $this->license = $license;
    }

    public function getName(): string {
        return $this->name;
    }

    public function setName(string $name): void {
        $this->name = $name;
    }

    public function getLastName(): string {
        return $this->lastName;
    }

    public function setLastName(string $lastName): void {
        $this->lastName = $lastName;
    }

    public function getIdentification(): string {
        return $this->identification;
    }

    public function setIdentification(string $identification): void {
        $this->identification = $identification;
    }

    public function getDirection(): string {
        return $this->direction;
    }

    public function setDirection(string $direction): void {
        $this->direction = $direction;
    }

    public function getPhone(): string {
        return $this->phone;
    }

    public function setPhone(string $phone): void {
        $this->phone = $phone;
    }

    public function getRh(): string {
        return $this->rh;
    }

    public function setRh(string $rh): void {
        $this->rh = $rh;
    }

    public function getLicense(): License {
        return $this->license;
    }

    public function setLicense(License $license): void {
        $this->license = $license;
    }

    public function calculateCost(): float {
        return $this->license->calculateCost();
    }

    public function __toString(): string {
        return "Name: " . $this->name . "\n" .
               "Last Name: " . $this->lastName . "\n" .
               "Identification: " . $this->identification . "\n" .
               "Direction: " . $this->direction . "\n" .
               "Phone: " . $this->phone . "\n" .
               "RH: " . $this->rh . "\n" .
               "License: " . $this->license->getName() . "\n" .
               "Cost: " . $this->calculateCost() . "\n";
    }
}

?>