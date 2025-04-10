package lab5;
import java.util.Scanner;

public class ShippingCostCalculator {
	public static void main(String[] args) {
		 // Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);

        // Prompt the user to enter the weight of the package
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = stdin.nextDouble();

        // Determine the shipping cost based on the weight
        if (weight <= 0) {
            System.out.println("Invalid input.");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weight > 0 && weight <= 1) {
            System.out.println("The shipping cost is $3.5");
        } else if (weight > 1 && weight <= 3) {
            System.out.println("The shipping cost is $5.5");
        } else if (weight > 3 && weight <= 10) {
            System.out.println("The shipping cost is $8.5");
        } else if (weight > 10 && weight <= 20) {
            System.out.println("The shipping cost is $10.5");
        }

        // Close the scanner
        stdin.close();
	}

}
