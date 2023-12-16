package CalculateArea;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(10, 5);
        Square sq2 = new Square(5, 8);
        Square sq3 = new Square(8, 8);
        Circle c1 = new Circle(9);
        Circle c2 = new Circle(7);


        Shapes shapes = new Shapes();
        shapes.addShape(sq1);
        shapes.addShape(sq2);
        shapes.addShape(sq3);
        shapes.addShape(c1);
        shapes.addShape(c2);
        System.out.println("Total area of all shapes is: " +shapes.totalArea());


    }
}
