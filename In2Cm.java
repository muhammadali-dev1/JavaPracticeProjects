package lab10;
import java.util.Scanner;

public class In2Cm {
	
    // Method to convert inches to centimeters
	public static double inToCm(double in) {
		return 2.54*in;
}
	
	public static void main (String args[]) {
       
		// Create a scanner object to take user input
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter the value in inches: ");
		double in = stdin.nextDouble();
		
		double cm = inToCm(in);
		
		
		System.out.println(in + " inches are " + cm + " cm");
		
		stdin.close();
		
		
		
		
		
		
	}

}
