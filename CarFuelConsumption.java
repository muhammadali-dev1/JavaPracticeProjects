// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class CarFuelConsumption {
	public static void main(String[] args) {
		
		// Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		
		// Prompt user for the number of minutes the car is driven
        System.out.print("Input the number of minutes a car is driven on a long track: ");
        double minutes = stdin.nextDouble();

        // Prompt user for the constant speed of the car in miles per hour
        System.out.print("Input the constant speed of the car in miles per hour: ");
        double mph = stdin.nextDouble();

        // Prompt user for the fuel efficiency of the car in miles per gallon
        System.out.print("Input the fuel efficiency of the car in miles per gallon: ");
        double mpg = stdin.nextDouble();

        // Calculate fuel consumption: minutes / 60 * mph * 1/mpg
        double gallonsConsumed = (minutes / 60) * (mph / mpg);

        // Print the result
        System.out.println(gallonsConsumed);

        // Close the scanner
        stdin.close();
		
	}

}
