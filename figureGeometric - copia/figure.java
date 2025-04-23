public class figure {
    public static void main (String [] args){

    figureGeometric square = new square(3);
    figureGeometric circle = new circle(5);
    figureGeometric triangle = new triangle(5,8);
    figureGeometric rectangle = new rectangle(4, 5);

    System.out.println("Area of square: "+square.getNameSpanish()+"::"+square.calculateArea());
    System.out.println("Area of circle: "+circle.getNameSpanish()+"::"+circle.calculateArea());
    System.out.println("Area of triangle: "+triangle.getNameSpanish()+"::"+triangle.calculateArea());
    System.out.println("Area of rectangle: "+square.getNameSpanish()+"::"+rectangle.calculateArea());



    }
    
}
