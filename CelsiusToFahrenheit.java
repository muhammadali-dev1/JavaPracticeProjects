package wedlab;
import java.util.Scanner;


public class CelsiusToFahrenheit {
	 public static void main(String[] args) {
		// Prompt the user to enter a degree in Celsius
	        System.out.print("Enter a degree in Celsius: ");
	        Scanner stdin = new Scanner(System.in);
	        double celsius = stdin.nextDouble();

	        // Convert Celsius to Fahrenheit
	        double fahrenheit = (9.0 / 5) * celsius + 32;

	        // Display the result
	        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	        // Close the scanner
	        stdin.close();
	 }

}
