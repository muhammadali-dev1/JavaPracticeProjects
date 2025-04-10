// Muhammad Ali 
// SBU ID: 115921494

package homework2;
import java.util.Scanner;

public class Pyramid {
	
	// Method to print the pyramid of powers of 2
    public static void printPyramid(int n) {
        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("    "); // Adjust spaces for alignment
            }

            // Print the increasing powers of 2
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // Print the decreasing powers of 2
            for (int j = i - 1; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // Move to the next line after printing one row of the pyramid
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of lines
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();

        // Call the printPyramid method to display the pyramid pattern
        printPyramid(n);

        // Close the scanner
        scanner.close();

    }
}
