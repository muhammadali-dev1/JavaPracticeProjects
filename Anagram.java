// Muhammad Ali
// SBU ID: 115921494

package homework3;
import java.util.Scanner;
import java.util.Arrays;


public class Anagram {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        
        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams");
        }
        
        input.close();  // Close scanner
    }
    
    // Method to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
}



