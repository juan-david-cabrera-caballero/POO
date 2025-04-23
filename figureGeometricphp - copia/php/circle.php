<?php


class Circle extends FigureGeometric {
    private ?float $radius;
   
    private const PI = 3.1416;
    private ?float $calculate = null;

    public function __construct(float $radius) {
        parent::__construct("circle", "círculo");
        $this->radius = $radius;
    }

    public function getRadius(): ?float {
        return $this->radius;
    }

    
    public function getPi(): float {
        return self::PI;  
    }

    public function getCalculateArea(): ?float {
        $this->calculate = ($this->getRadius() * $this->getRadius() * self::PI);
        return $this->calculate;
    }
}
?>
