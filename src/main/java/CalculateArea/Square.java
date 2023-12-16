package CalculateArea;

public class Square implements Shape {
    private int height;
    private int length;
    public Square(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length*height;
    }
}
