// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class ShowMeTheMoney {
	public static void main (String[] args) {
		
		// Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		// Prompt the user for the number of farthings
        System.out.print("Enter in the number of farthings: ");
        int farthings = stdin.nextInt();

        // Conversion rates
        int farthingsPerPenny = 4;
        int pencePerShilling = 12;
        int shillingsPerPound = 20;

        // Convert farthings to pounds (sterling), shillings, pence, and farthings
        int sterling = farthings / (farthingsPerPenny * pencePerShilling * shillingsPerPound);
        farthings %= (farthingsPerPenny * pencePerShilling * shillingsPerPound);

        int shillings = farthings / (farthingsPerPenny * pencePerShilling);
        farthings %= (farthingsPerPenny * pencePerShilling);

        int pence = farthings / farthingsPerPenny;
        farthings %= farthingsPerPenny;

        // Print the result
        System.out.println("Sterling " + sterling);
        System.out.println("Shilling " + shillings);
        System.out.println("Penny " + pence);
        System.out.println("Farthings " + farthings);

        // Close the scanner
        stdin.close();
		
	}

}
