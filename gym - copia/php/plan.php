<?php

abstract class plan {
    protected $name;
    protected $cost;
    private $service;

    public function __construct($name, $cost, $service) {
        $this->name = $name;
        $this->cost = $cost;
        $this->service = $service;
    }

    public function getName() {
        return $this->name;
    }

    public function getCost() {
        return $this->cost;
    }

    public abstract function getServices();
}

?>
