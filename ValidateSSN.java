package lab7;
import java.util.Scanner;

public class ValidateSSN {
	public static void main(String[] args) {
		
        // Create a Scanner object for input
		Scanner stdin = new Scanner(System.in);
		
        // Prompt the user to enter a Social Security Number
		System.out.print("Enter a SSN: ");
		String ssn = stdin.nextLine();
		
		// Regular expression to validate SSN format DDD-DD-DDDD
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";

        // Check if the entered SSN matches the pattern
        if (ssn.matches(ssnPattern)) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }

        // Close the scanner
        stdin.close();


	}

}
