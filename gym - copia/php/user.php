<?php

class User {
    private string $name;
    private string $lastName;
    private float $weight;
    private float $stature;
    private ?Plan $plan = null; 

    public function __construct(string $name, string $lastName, float $weight, float $stature) {
        $this->name = $name;
        $this->lastName = $lastName;
        $this->weight = $weight;
        $this->stature = $stature;
    }

    public function getName(): string {
        return $this->name;
    }

    public function getLastName(): string {
        return $this->lastName;
    }

    public function getWeight(): float {
        return $this->weight;
    }

    public function getStature(): float {
        return $this->stature;
    }

    public function getPlan(): ?Plan {
        return $this->plan;
    }

    public function setPlan(Plan $plan): void {
        $this->plan = $plan;
    }
}