package lab15;

public class MyString1 {
    private char[] chars;

    // Constructor
    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    // Returns the character at the specified index
    public char charAt(int index) {
        return chars[index];
    }

    // Returns the length of the string
    public int length() {
        return chars.length;
    }

    // Returns a substring of the MyString1 object
    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subChars = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString1(subChars);
    }

    // Converts all characters to lowercase
    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = (chars[i] >= 'A' && chars[i] <= 'Z') ? (char)(chars[i] + 32) : chars[i];
        }
        return new MyString1(lowerChars);
    }

    // Checks if this MyString1 is equal to another MyString1
    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Converts an integer to a MyString1
    public static MyString1 valueOf(int i) {
        boolean isNegative = i < 0;
        int temp = Math.abs(i);
        int length = (i == 0) ? 1 : (int) Math.log10(temp) + 1;
        char[] intChars = new char[isNegative ? length + 1 : length];

        if (isNegative) {
            intChars[0] = '-';
        }

        for (int j = intChars.length - 1; j >= (isNegative ? 1 : 0); j--) {
            intChars[j] = (char) ('0' + (temp % 10));
            temp /= 10;
        }

        return new MyString1(intChars);
    }

    // Splits the MyString1 by a specified delimiter
    public MyString1[] split(String s) {
        char delimiter = s.charAt(0);
        int count = 1;

        for (char ch : chars) {
            if (ch == delimiter) count++;
        }

        MyString1[] result = new MyString1[count];
        int start = 0, index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == delimiter) {
                result[index++] = substring(start, i);
                start = i + 1;
            }
        }

        result[index] = substring(start, chars.length);
        return result;
    }

    // Converts the MyString1 object to a readable string
    @Override
    public String toString() {
        return new String(chars);
    }
}
