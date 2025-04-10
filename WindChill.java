// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		
        // Create a Scanner object to read input
		 Scanner stdin = new Scanner(System.in);
		 
		 // Prompt user to enter the temperature in Fahrenheit
	        System.out.print("Enter the temperature in Fahrenheit (between -58 and 41): ");
	        double temperature = stdin.nextDouble();

	        // Prompt user to enter the wind speed in miles per hour
	        System.out.print("Enter the wind speed (must be greater than or equal to 2 mph): ");
	        double windSpeed = stdin.nextDouble();

	        // Check if the input values are within valid ranges
	        if (temperature < -58 || temperature > 41) {
	            System.out.println("Error: The temperature must be between -58 and 41 Fahrenheit.");
	        } else if (windSpeed < 2) {
	            System.out.println("Error: The wind speed must be greater than or equal to 2 mph.");
	        } else {
	            // Calculate the wind-chill temperature using the given formula
	            double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
	                               + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

	            // Display the result
	            System.out.println("The wind-chill temperature is: " + windChill);
	        }

	        // Close the scanner
	        stdin.close();

	}

}
