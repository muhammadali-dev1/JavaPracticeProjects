package Lab2;
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		// Prompt the user to enter v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
        Scanner stdin = new Scanner(System.in);
        double v0 = stdin.nextDouble();        
        double v1 = stdin.nextDouble();
        double t = stdin.nextDouble();	
        double acceleration;
        acceleration = (v1 - v0)/t; // Calculate average acceleration
	    System.out.println("The average acceleration is " + acceleration);// Display results
	    
}
}



	
