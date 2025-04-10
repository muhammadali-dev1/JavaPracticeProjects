package lab1;

import java.util.Scanner;
public class lab1 {
		  public static void main(String[] args) {
		    double radius; // Declare radius
		    double area; // Declare area
		    System.out.print("Enter the radius:-->");
		    Scanner stdin = new Scanner(System.in);
		    radius = stdin.nextDouble(); // New value is radius
		    // Compute area
		    area = radius * radius * 3.14159;
		    // Display results
		    System.out.println("The area for the circle" + 
				  " of radius " + radius + " is " + area);
		    stdin.close();
		  }
	}
