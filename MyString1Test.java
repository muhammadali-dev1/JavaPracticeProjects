package lab15;

public class MyString1Test {
    public static void main(String[] args) {
        // Test the constructor
        char[] testChars = {'H', 'e', 'L', 'L', 'o'};
        MyString1 myString = new MyString1(testChars);
        System.out.println("Original string: " + myString.toString()); // Expected: "HeLLo"

        // Convert to lowercase
        MyString1 lowerCaseString = myString.toLowerCase();
        System.out.println("toLowerCase: " + lowerCaseString.toString()); // Expected: "hello"

        // Take substring after converting to lowercase
        MyString1 subString = lowerCaseString.substring(1, 4);
        System.out.println("substring(1, 4) after toLowerCase: " + subString.toString()); // Expected: "ell"

        // Other tests remain unchanged
        System.out.println("charAt(1): " + myString.charAt(1)); // Expected: 'e'
        System.out.println("length: " + myString.length()); // Expected: 5

        char[] equalChars = {'H', 'e', 'L', 'L', 'o'};
        MyString1 myString2 = new MyString1(equalChars);
        System.out.println("equals with same chars: " + myString.equals(myString2)); // Expected: true

        char[] differentChars = {'W', 'o', 'r', 'l', 'd'};
        MyString1 myString3 = new MyString1(differentChars);
        System.out.println("equals with different chars: " + myString.equals(myString3)); // Expected: false

        MyString1 intString = MyString1.valueOf(12345);
        System.out.println("valueOf(12345): " + intString.toString()); // Expected: "12345"

        char[] splitTestChars = {'h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd'};
        MyString1 splitString = new MyString1(splitTestChars);
        MyString1[] splitResult = splitString.split(",");
        System.out.println("split by ',' result:");
        for (MyString1 str : splitResult) {
            System.out.println(str.toString()); // Expected: "hello" and "world"
        }
    }
}
