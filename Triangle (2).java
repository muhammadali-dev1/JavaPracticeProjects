package lab25;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        // Check the triangle inequality rule
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side.");
        }

        // Assign values to the sides if the rule is satisfied
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter methods for the triangle sides
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
