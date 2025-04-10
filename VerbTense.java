package lab8;
import java.util.Scanner;

public class VerbTense {
	public static void main(String[] args) {
        
		// Create a Scanner object for input
		Scanner stdin = new Scanner(System.in);
		
		
        // Prompt the user to enter a verb
		System.out.print("Enter a verb: ");
		String verb = stdin.nextLine();
		
		
        // Determine the third person singular form
		String thirdPersonForm;
		
		if (verb.endsWith("y")) {
            thirdPersonForm = verb.substring(0, verb.length() - 1) + "ies";
        } else if (verb.endsWith("o")) {
            thirdPersonForm = verb + "es";
        } else if (verb.endsWith("ch")) {
            thirdPersonForm = verb + "es";
        } else if (verb.endsWith("s")) {
            thirdPersonForm = verb + "es";
        } else if (verb.endsWith("sh")) {
            thirdPersonForm = verb + "es";
        } else if (verb.endsWith("x")) {
            thirdPersonForm = verb + "es";
        } else {
            thirdPersonForm = verb + "s";
        }

        
        // Print the third person form
        System.out.println(thirdPersonForm);
        
        // Close the scanner
        stdin.close();
		
		

	}

}
