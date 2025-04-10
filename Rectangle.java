package lab14;

public class Rectangle {
    // Data fields
    private double width = 1;
    private double height = 1;
    private static String color = "white";

    // No-arg constructor (default rectangle)
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // Constructor with width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter and setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter and setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Rectangle.color = color;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
