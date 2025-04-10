package lab18;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // No-arg constructor creating a default triangle
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor with specified side lengths
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Constructor with specified sides, color, and filled state
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);  // Calling superclass constructor
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Accessor methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    // Method to calculate area using Heron's formula
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + 
               "\nColor: " + getColor() + ", Filled: " + isFilled();
    }

    // Main method to test Triangle class
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1.0, 1.5, 1.0, "yellow", true);
        
        System.out.println("Triangle Details:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
        System.out.println(triangle.toString());
    }
}


