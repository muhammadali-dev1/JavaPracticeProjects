// Muhammad Ali
// 115921494

package homework5;

public class Circle2D {
    private double x; // x-coordinate of the center
    private double y; // y-coordinate of the center
    private double radius; // radius of the circle

    // No-arg constructor (default circle at (0, 0) with radius 1)
    public Circle2D() {
        this(0, 0, 1);
    }

    // Constructor with specified x, y, and radius
    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Getter for x
    public double getX() {
        return x;
    }

    // Getter for y
    public double getY() {
        return y;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to check if a point is inside the circle
    public boolean contains(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance < radius;
    }

    // Method to check if a circle is inside this circle
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distance + circle.getRadius() <= this.radius;
    }

    // Method to check if a circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        return distance < this.radius + circle.getRadius() && distance > Math.abs(this.radius - circle.getRadius());
    }
}
