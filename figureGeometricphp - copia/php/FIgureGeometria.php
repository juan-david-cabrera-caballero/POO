<?php

abstract class FigureGeometric {
    private ?string $name;
    private ?string $nameSpanish;

    public function __construct(string $name, string $nameSpanish) {
        $this->name = $name;
        $this->nameSpanish = $nameSpanish;
    }

    public function getName(): ?string {
        return $this->name;
    }

    public function getNameSpanish(): ?string {
        return $this->nameSpanish;
    }
}
?>
