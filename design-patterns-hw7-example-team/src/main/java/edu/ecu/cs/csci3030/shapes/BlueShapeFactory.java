package edu.ecu.cs.csci3030.shapes;

package edu.ecu.cs.csci3030.shapes;

import edu.ecu.cs.csci3030.colors.Color;

public class BlueShapeFactory extends ShapeFactory {
    protected BlueShapeFactory() {
        // Do nothing
    }

    public Circle getCircle(int x, int y) {
        return new Circle(Color.BLUE, x, y);
    }

    public Square getSquare(int x, int y) {
        return new Square(Color.BLUE, x, y);
    }

    public Triangle getTriangle(int x, int y) {
        return new Triangle(Color.BLUE, x, y);
    }

}

