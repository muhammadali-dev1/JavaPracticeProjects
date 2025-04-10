package wedlab;
import java.util.Scanner;

public class SphereVolumeCalculator {
	public static void main(String[] args) {
	    
		// Create a Scanner object to read input from the console
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the radius of the sphere: ");
		double radius = stdin.nextDouble();
		double radiusCubed = radius * radius * radius;
		// Calculate the volume of te sphere using the formula V = (4/3) * π * r^3
        double volume = (4.0 / 3) * Math.PI * radiusCubed;
        
        // Display the volume of the sphere
        System.out.println("Volume of the sphere is: " + volume);

        // Close the scanner
        stdin.close();

	}

}
