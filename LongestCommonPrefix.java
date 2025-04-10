// Muhammad Ali 
// SBU ID: 115921494

package homework2;
import java.util.Scanner;

public class LongestCommonPrefix {
	

    // Method to find the largest common prefix between two strings
    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder commonPrefix = new StringBuilder();

        // Loop through both strings to find the common prefix
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break; // Stop if characters don't match
            }
        }

        // Return the common prefix as a string
        return commonPrefix.toString();
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner stdin = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = stdin.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = stdin.nextLine();

        // Find the common prefix between the two strings
        String commonPrefix = findCommonPrefix(str1, str2);

        // Check if there is a common prefix
        if (commonPrefix.length() > 0) {
            System.out.println("The common prefix is: " + commonPrefix);
        } else {
            System.out.println(str1 + " and " + str2 + " have no common prefix.");
        }

        // Close the scanner
        stdin.close();

    }
}
