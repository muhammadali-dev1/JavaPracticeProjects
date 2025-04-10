package lab25;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CitiesFileHandler {
    public static void main(String[] args) {
        // File names
        String inputFileName = "cities.txt";
        String outputFileName = "output.txt";

        try {
            // Step 1: Generate "cities.txt" with ten city names
            generateCitiesFile(inputFileName);

            // Step 2: Read the contents of "cities.txt" and reverse the order
            ArrayList<String> cities = readCitiesFile(inputFileName);

            // Reverse the list of cities
            Collections.reverse(cities);

            // Step 3: Write the reversed cities to "output.txt"
            writeReversedCities(outputFileName, cities);

            System.out.println("Program completed. Check the files: " + inputFileName + " and " + outputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to generate cities.txt
    public static void generateCitiesFile(String fileName) throws IOException {
        // List of cities
        String[] cities = {"Dallas", "Houston", "Chicago", "Denver", "Tampa", "Miami", "Charlotte", "Austin", "Detroit", "Seattle"};

        // Write cities to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String city : cities) {
                writer.write(city);
                writer.newLine();
            }
        }
        System.out.println("File " + fileName + " created with city names.");
    }

    // Method to read cities from cities.txt
    public static ArrayList<String> readCitiesFile(String fileName) throws IOException {
        ArrayList<String> cities = new ArrayList<>();

        // Read cities from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                cities.add(line);
            }
        }
        System.out.println("File " + fileName + " read successfully.");
        return cities;
    }

    // Method to write reversed cities to output.txt
    public static void writeReversedCities(String fileName, ArrayList<String> cities) throws IOException {
        // Write reversed cities to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String city : cities) {
                writer.write(city);
                writer.newLine();
            }
        }
        System.out.println("File " + fileName + " created with reversed city names.");
    }
}
