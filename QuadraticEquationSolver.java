package lab5;
import java.util.Scanner;

public class QuadraticEquationSolver {
	public static void main(String[] args) {
		
		// Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);
        
     // Prompt the user to enter values for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Check the value of the discriminant and display the result
        if (discriminant > 0) {
            // Two real roots
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            // One real root
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root: " + r1);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        // Close the scanner
        stdin.close();
	}
	
	

}
