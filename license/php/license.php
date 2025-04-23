<?php

abstract class License {
    private string $name;
    private string $duration;
    private float $cost;

    public function __construct(string $name, string $duration, float $cost) {
        $this->name = $name;
        $this->duration = $duration;
        $this->cost = $cost;
    }

    public function getName(): string {
        return $this->name;
    }

    public function getDuration(): string {
        return $this->duration;
    }

    public function getCost(): float {
        return $this->cost;
    }

    public abstract function calculateCost(): float;
}

?>