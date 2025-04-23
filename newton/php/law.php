<?php

abstract class Law {
    private string $name;

    public function __construct(string $name) {
        $this->name = $name;
    }

    public function getName(): string {
        return $this->name;
    }

    abstract public function explain();
    abstract public function calculate();
}

?>
