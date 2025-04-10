package lab10;
import java.util.Scanner;


public class PatternDisplay {
	
	// Method to display the pattern with right alignment
    public static void displayPattern(int n) {
        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int k = 1; k <= n - i; k++) {
                System.out.print("  "); // Two spaces for each leading space
            }
            // Inner loop for printing numbers in each row in reverse order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer value for n
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Call the displayPattern method to print the pattern
        displayPattern(n);

        // Close the scanner
        scanner.close();
    }

	}


