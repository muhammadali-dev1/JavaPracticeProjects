package lab9;
import java.util.Scanner;

public class CharacterCount {

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = stdin.nextLine();

        System.out.print("Enter a character to search for: ");
        char character = stdin.next().charAt(0);

        System.out.println("The character '" + character + "' appears " + count(inputString, character) + " times.");

        stdin.close();
    }
}

