<?php


class Triangule extends FigureGeometric {
    private ?float $base;
    private ?float $height;
    private ?float $calculate = null;


    public function __construct(float $base, float $height) {
        parent::__construct("triangule", "triángulo");
        $this->base = $base;
        $this->height = $height;
    }

    public function getBase(): ?float {
        return $this->base;
    }

    public function getHeight(): ?float {
        return $this->height;
    }

    public function getCalculateArea(): ?float {
        $this->calculate = ($this->getBase() * $this->getHeight()) / 2;
        return $this->calculate;
    }
}
?>

