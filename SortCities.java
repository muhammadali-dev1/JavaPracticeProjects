package lab6;

import java.util.Scanner;
import java.util.Arrays;

public class SortCities {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner stdin = new Scanner(System.in);

        // Prompt the user to enter three cities
        System.out.print("Enter the first city: ");
        String city1 = stdin.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = stdin.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = stdin.nextLine();

        // Store the cities in an array
        String[] cities = {city1, city2, city3};

        // Sort the array in ascending order
        Arrays.sort(cities);

        // Display the cities in ascending order
        System.out.print("The three cities in alphabetical order are: ");
        System.out.println(String.join(" ", cities)); // Join the sorted cities with space

        // Close the scanner
        stdin.close();
    }
}
