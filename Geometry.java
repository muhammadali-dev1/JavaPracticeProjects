package lab13;
import java.util.Scanner;

public class Geometry {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[3][2];

        // Prompt the user to enter three points
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        for (int i = 0; i < 3; i++) {
            points[i][0] = input.nextDouble(); // x-coordinate
            points[i][1] = input.nextDouble(); // y-coordinate
        }

        double area = getTriangleArea(points);

        if (area == 0) {
            System.out.println("The three points are on the same line.");
        } else {
            System.out.printf("The area of the triangle is %.2f%n", area);
        }
        input.close();
    }

    public static double getTriangleArea(double[][] points) {
        // Calculate the length of each side using the distance formula
        double side1 = distance(points[0], points[1]);
        double side2 = distance(points[1], points[2]);
        double side3 = distance(points[2], points[0]);

        // Check if the three points are on the same line
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            return 0;
        }

        // Calculate the semi-perimeter
        double s = (side1 + side2 + side3) / 2;

        // Calculate and return the area using Heron's formula
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Helper method to calculate the distance between two points
    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));
    }
}



