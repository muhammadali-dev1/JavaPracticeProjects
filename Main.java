package lab25;

public class Main {
    public static void main(String[] args) {
        try {
            // Attempt to create a triangle with invalid sides
            Triangle triangle = new Triangle(1, 3, 1);
        } catch (IllegalTriangleException e) {
            // Handle the exception and print an error message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
