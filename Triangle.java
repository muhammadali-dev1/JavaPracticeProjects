// Muhammad Ali SBU ID: 115921494
package homework1;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
        // Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		
        // Prompt the user to input the three sides of the triangle
		
		System.out.print("Side1: ");
		double side1 = stdin.nextDouble();
		
		System.out.print("Side2: ");
		double side2 = stdin.nextDouble();
		
		System.out.print("Side3: ");
		double side3 = stdin.nextDouble();
		
		 // Check if the input is valid based on the triangle inequality theorem
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Determine the type of triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("Output: Equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Output: Isosceles");
            } else {
                System.out.println("Output: Scalene");
            }
        } else {
            System.out.println("Output: Invalid input!");
        }

        // Close the scanner
        stdin.close();
		


	}

}
