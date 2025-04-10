package lab14;

public class TestRectangle {
    public static void main(String[] args) {
        // Create first rectangle with width 4 and height 40
        Rectangle rectangle1 = new Rectangle(4, 40);
        // Create second rectangle with width 3.5 and height 35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // Set the color to red for all rectangles
        Rectangle.setColor("red");

        // Display the properties of rectangle1
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Display the properties of rectangle2
        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Color: " + rectangle2.getColor());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
