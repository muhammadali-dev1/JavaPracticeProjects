// Muhammad Ali
// 115921494

package homework5;

public class Circle2DTest {
    public static void main(String[] args) {
        // Create a Circle2D object c1
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Display the area and perimeter of c1
        System.out.printf("Area of c1: %.2f%n", c1.getArea());
        System.out.printf("Perimeter of c1: %.2f%n", c1.getPerimeter());

        // Check if the point (3, 3) is inside c1
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));

        // Check if Circle2D(4, 5, 10.5) is inside c1
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));

        // Check if Circle2D(3, 5, 2.3) overlaps with c1
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
