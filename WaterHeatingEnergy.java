package wedlab;
import java.util.Scanner;


public class WaterHeatingEnergy {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner stdin = new Scanner(System.in);

        // Prompt the user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double waterInKg = stdin.nextDouble();

        // Prompt the user to enter the initial temperature
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = stdin.nextDouble();

        // Prompt the user to enter the final temperature
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = stdin.nextDouble();

        // Calculate the energy needed using the formula Q = M * (finalTemperature - initialTemperature) * 4184
        double energy = waterInKg * (finalTemperature - initialTemperature) * 4184;

        // Display the result
        System.out.println("The energy needed is " + energy + " joules");

        // Close the scanner
        stdin.close();


}
}
