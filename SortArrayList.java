package lab23;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    // Method to sort an ArrayList of integers
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    // Swap elements
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    // Main method to test the sorting method
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Prompt user to enter five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            list.add(stdin.nextInt());
        }

        // Sort the list
        sort(list);

        // Display the sorted list
        System.out.println("The sorted numbers are: " + list);
        stdin.close();
        
    }
}
