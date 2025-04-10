package lab7;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
	public static void main(String[] args) {
		
		
		// Create a Scanner object for input
		Scanner stdin = new Scanner(System.in);
		
        // Array of choices for the game
        String[] choices = {"rock", "paper", "scissors"};

        // Prompt the user to choose rock, paper, or scissors
        System.out.print("Choose your weapon (rock, paper, or scissors): ");
        String userChoice = stdin.nextLine();

        // Computer randomly chooses rock, paper, or scissors
        Random rand = new Random();
        String computerChoice = choices[rand.nextInt(3)];

        // Repeat the user's choice
        System.out.println("The user (you) chose " + userChoice);
        // Reveal the computer's choice
        System.out.println("The comp (I) chose " + computerChoice);

        // Determine and report the result
        if (userChoice.equals(computerChoice)) {
            System.out.println("You tied!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        // Close the scanner
        stdin.close();
		
		
	}
	

}
