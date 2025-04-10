// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class IsLeapYear {
	public static void main(String[] args) {
		
		// Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		
		// Prompt the user to enter a year
        System.out.print("Enter in a year: ");
        int year = stdin.nextInt();

        // Determine if the year is a leap year
        boolean isLeapYear;

        if (year % 400 == 0) {
            isLeapYear = true; // Divisible by 400
        } else if (year % 100 == 0) {
            isLeapYear = false; // Divisible by 100 but not 400
        } else if (year % 4 == 0) {
            isLeapYear = true; // Divisible by 4 but not 100
        } else {
            isLeapYear = false; // Not divisible by 4
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // Close the scanner
        stdin.close();
		
		
	}

}
