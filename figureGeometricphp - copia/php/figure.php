<?php

include('FigureGeometria.php');
include('square.php');
include('triangule.php');
include('circle.php');
include('rectangule.php'); 

class Figure {
    public function __construct() {
        
        $square = new Square(5); 
        $triangule = new Triangule(4, 6); 
        $circle = new Circle(7);
        $rectangule = new Rectangule(5, 8); 
        
        echo "Área del Cuadrado: " . $square->getNameSpanish() . " :: " . $square->getCalculateArea() . "<br>";
        echo "Área del Triángulo: " . $triangule->getNameSpanish() . " :: " . $triangule->getCalculateArea() . "<br>";
        echo "Área del Círculo: " . $circle->getNameSpanish() . " :: " . $circle->getCalculateArea() . "<br>";
        echo "Área del Rectángulo: " . $rectangule->getNameSpanish() . " :: " . $rectangule->getCalculateArea() . "<br>";
    }
}


new Figure();
?>

