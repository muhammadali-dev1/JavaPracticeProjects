package lab22;

import java.util.ArrayList;
import java.util.Scanner;

public class CharacterArrayList {
    public static void main(String[] args) {
        // Test method to prompt the user and call toCharacterArray
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String input = stdin.nextLine();

        ArrayList<Character> charList = toCharacterArray(input);

        System.out.print("Elements of the Character array list: ");
        for (Character ch : charList) {
            System.out.print(ch + " ");
            stdin.close();

        }
    }

    /**
     * Converts a string to an ArrayList of Characters.
     * @param s the input string
     * @return an ArrayList of characters from the string
     */
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        
               
        
        return charList;

    }
}
