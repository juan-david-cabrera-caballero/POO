<?php


class rectangule extends FigureGeometric {
    private ?float $base;
    private ?float $height;
    private ?float $calculate = null;

    public function __construct(float $base ,float $height) {
        parent::__construct("rectangule", "rectangulo");
        $this->base = $base;
        $this->height =$height;
    }

    public function getBase(): ?float {
        return $this->base;
    }

    public function getHeight(): ?float {
        return $this->height;
    }

    public function getCalculateArea(): ?float {
        $this->calculate = $this->getBase() * $this->getHeight() ;
        return $this->calculate;
    }
}
?>
