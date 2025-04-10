package lab6;
import java.util.Scanner;

public class AirlineRewards {
	public static void main(String[] args) {
       
		// Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		
		// Prompt the user for their membership type
        System.out.print("Please enter membership (Diamond/Platinum/Regular): ");
        String membership = stdin.nextLine();

        // Check if the membership is valid
        if (!membership.equals("Diamond") && !membership.equals("Platinum") && !membership.equals("Regular")) {
            System.out.println("Invalid input!");
            stdin.close();
            return; // Exit the program if invalid input is entered
        }

        // Prompt the user for the ticket price
        System.out.print("Please enter ticket price: ");
        int price = stdin.nextInt();

        // Prompt the user for the current points
        System.out.print("Please enter current points: ");
        int points = stdin.nextInt();

        // Initialize points to be added
        int pointsAwarded = 0;

        // Apply the rules based on membership, price, and current points
        if (membership.equals("Diamond")) {
            if (price >= 5000) {
                pointsAwarded = 35;
            } else if (price >= 2000 && points > 300) {
                pointsAwarded = 30;
            } else if (price >= 500 && points >= 100) {
                pointsAwarded = 10;
            } else if (points >= 25) {
                pointsAwarded = 2;
            }
        } else if (membership.equals("Platinum")) {
            if (price >= 5000) {
                pointsAwarded = 35;
            } else if (price >= 2000) {
                pointsAwarded = 20;
            }
        } else if (membership.equals("Regular")) {
            if (price >= 5000) {
                pointsAwarded = 5;
            }
        }

        // Calculate the total points
        int totalPoints = points + pointsAwarded;

        // Output the total points
        System.out.println(totalPoints);

        // Close the scanner
        stdin.close();
		
		
		
	}

	
}
