package lab8;
import java.util.Scanner;

public class DateFormatConverter {
	public static void main(String[] args) {
		
        // Create a Scanner object for input
		Scanner stdin = new Scanner(System.in);
		
		// Prompt the user to enter the date in MM/DD/YYYY format
        System.out.print("Enter the date in MM/DD/YYYY format (e.g., 04/25/1995): ");
        String dateInput = stdin.nextLine();
        
        // Get the month, day, and year by splitting the string
        String month = dateInput.substring(0, 2);
        String day = dateInput.substring(3, 5);
        String year = dateInput.substring(6, 10);
        
        // Convert the month from a number to a month name using if statements
        String monthName = "";
        if (month.equals("01")) {
            monthName = "January";
        } else if (month.equals("02")) {
            monthName = "February";
        } else if (month.equals("03")) {
            monthName = "March";
        } else if (month.equals("04")) {
            monthName = "April";
        } else if (month.equals("05")) {
            monthName = "May";
        } else if (month.equals("06")) {
            monthName = "June";
        } else if (month.equals("07")) {
            monthName = "July";
        } else if (month.equals("08")) {
            monthName = "August";
        } else if (month.equals("09")) {
            monthName = "September";
        } else if (month.equals("10")) {
            monthName = "October";
        } else if (month.equals("11")) {
            monthName = "November";
        } else if (month.equals("12")) {
            monthName = "December";
        }
        
        // Print the date in the format "Month Day, Year"
        System.out.println(monthName + " " + (day) + ", " + year);
        
        // Close the scanner
        stdin.close();
			
	}
}
