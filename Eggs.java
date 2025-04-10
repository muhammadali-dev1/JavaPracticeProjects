// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		// Prices
        double pricePerDozen = 3.25;
        double pricePerIndividualEgg = 0.45;

        // Create a Scanner object to read input
        Scanner stdin = new Scanner(System.in);

        // Prompt the user for the number of eggs
        System.out.print("Enter the number of eggs: ");
        int totalEggs = stdin.nextInt();

        // Calculate the number of dozens and loose eggs
        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        // Calculate the total cost
        double totalCost = (dozens * pricePerDozen) + (looseEggs * pricePerIndividualEgg);

        // Output the result with a full explanation
        System.out.println("You ordered " + totalEggs + " eggs.");
        System.out.println("That's " + dozens + " dozen at $" + pricePerDozen + " per dozen and " 
                + looseEggs + " loose eggs at " + (int)(pricePerIndividualEgg * 100) + 
                " cents each for a total of $" + totalCost);

        // Close the scanner
stdin.close();
	}

}
