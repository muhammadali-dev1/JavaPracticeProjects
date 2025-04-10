package lab7;
import java.util.Scanner;

public class FormatPhoneNumber {
	public static void main(String[] args) {
		
        // Create a Scanner object for input
		Scanner stdin = new Scanner(System.in);
		
        // Prompt the user to enter a phone number
		System.out.print("Enter the phone number: ");
		String phoneNumber = stdin.nextLine();
		// Check if the input is exactly 10 digits
        if (phoneNumber.length() == 10 && phoneNumber.matches("\\d+")) {
            // Format the phone number as (nnn)nnn-nnnn
            String formattedNumber = "(" + phoneNumber.substring(0, 3) + ")" 
                                    + phoneNumber.substring(3, 6) + "-" 
                                    + phoneNumber.substring(6);
            
            // Display the formatted phone number
            System.out.println("Formatted phone number: " + formattedNumber);
        } else {
            System.out.println("Invalid phone number. Please enter exactly 10 digits.");
        }

        // Close the scanner
        stdin.close();

		
		
		
		


	}

}
