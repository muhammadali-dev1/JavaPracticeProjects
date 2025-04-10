package lab23;

import java.util.ArrayList;

public class GradeConverter {

    // Method to convert integer grades to letter grades
    public static ArrayList<Character> convertToLetterGrades(ArrayList<Integer> grades) {
        ArrayList<Character> letterGrades = new ArrayList<>();

        for (int grade : grades) {
            if (grade >= 90) {
                letterGrades.add('A');
            } else if (grade >= 80) {
                letterGrades.add('B');
            } else if (grade >= 70) {
                letterGrades.add('C');
            } else if (grade >= 60) {
                letterGrades.add('D');
            } else {
                letterGrades.add('F');
            }
        }

        return letterGrades;
    }

    // Main method to test the conversion method
    public static void main(String[] args) {
        // Create a test list of grades
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(95);
        grades.add(82);
        grades.add(74);
        grades.add(65);
        grades.add(50);

        // Convert grades to letter grades
        ArrayList<Character> letterGrades = convertToLetterGrades(grades);

        // Display the results
        System.out.println("Integer grades: " + grades);
        System.out.println("Letter grades: " + letterGrades);
    }
}
