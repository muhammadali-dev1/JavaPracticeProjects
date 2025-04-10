package lab5;
import java.util.Scanner;

public class InsurancePremiumCalculator {
	public static void main(String[] args) {
		 // Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);

        // Read the premium amount
        System.out.print("Please enter in the premium price of the auto insurance policy: ");
        double premium = stdin.nextDouble();

        // Read the person's age
        System.out.print("Please enter in the person's age: ");
        int age = stdin.nextInt();

        // Read the person's gender
        System.out.print("Please enter in either Male or Female for gender: ");
        String gender = stdin.next();

        // Calculate the final premium based on age and gender
        double finalPremium = -1.0; // Default value if no condition is met

        if (age >= 18 && age < 21) {
            if (gender.equalsIgnoreCase("Male")) {
                finalPremium = premium;
            } else if (gender.equalsIgnoreCase("Female")) {
                finalPremium = premium * 0.90;
            }
        } else if (age >= 21 && age < 30) {
            finalPremium = premium * 0.75;
        } else if (age >= 30 && age < 60) {
            if (gender.equalsIgnoreCase("Male")) {
                finalPremium = premium * 0.60;
            } else if (gender.equalsIgnoreCase("Female")) {
                finalPremium = premium * 0.70;
            }
        } else if (age >= 60) {
            finalPremium = premium;
        }

        // Print the final premium or -1.0 if no valid case was matched
        System.out.println(finalPremium);

        // Close the scanner
        stdin.close();
	}
}
