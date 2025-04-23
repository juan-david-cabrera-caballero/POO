
<?php


class Square extends FigureGeometric {
    private ?float $side;
    private ?float $calculate = null;

    public function __construct(float $side) {
        parent::__construct("square", "cuadrado");
        $this->side = $side;
    }

    public function getSide(): ?float {
        return $this->side;
    }

    public function getCalculateArea(): ?float {
        $this->calculate = $this->getSide() * $this->getSide();
        return $this->calculate;
    }
}
?>
