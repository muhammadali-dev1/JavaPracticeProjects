package lab9;
import java.util.Scanner;

public class AreaOfTriangle {
	public static double areaOfTriangle(double base, double height) {
		return 0.5 * base * height;
    }

    // Main method to accept input and invoke the areaOfTriangle method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner stdin = new Scanner(System.in);
        
        // Prompt the user to enter the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = stdin.nextDouble();
        
        // Prompt the user to enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = stdin.nextDouble();
        
        // Invoke the areaOfTriangle method and store the result
        double area = areaOfTriangle(base, height);
        
        // Print the area of the triangle
        System.out.println("Area of this triangle with base " + base + " and height " + height + " is: " + area);
        
        // Close the scanner
        stdin.close();
		
		
	}

}
