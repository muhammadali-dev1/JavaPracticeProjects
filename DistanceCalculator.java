package lab4;
import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);
        
     // Prompt the user to enter the coordinates of the first point (x1, y1)
        System.out.print("Enter x1 and y1: ");
        double x1 = stdin.nextDouble();
        double y1 = stdin.nextDouble();
        
        // Prompt the user to enter the coordinates of the second point (x2, y2)
        System.out.print("Enter x2 and y2: ");
        double x2 = stdin.nextDouble();
        double y2 = stdin.nextDouble();
        
        // Calculate the distance between the two points
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        
        // Display the distance
        System.out.println("The distance between the two points is " + distance);
        
        // Close the scanner
        stdin.close();
	}

}
