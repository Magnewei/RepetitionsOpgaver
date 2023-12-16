package CalculateArea;

import java.util.ArrayList;
import java.util.List;

public class Shapes {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double totalArea() {
        double totalArea = 0;
        for (Shape s : shapes) {
           totalArea += s.calculateArea();
        }
        return totalArea;
    }


}
