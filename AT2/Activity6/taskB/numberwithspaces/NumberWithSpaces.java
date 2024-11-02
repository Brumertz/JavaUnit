/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package numberwithspaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumberWithSpaces {

    public static void main(String[] args) {
        String inputFile = "number.txt";
        String outputFile = "separated.txt";

        // Create number.txt with a default number if it doesn't exist
        createInputFile(inputFile);

        try {
            // Read the number from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String numberString = reader.readLine(); // Read the first line
            reader.close();

            // Convert the string number to an integer
            int number = Integer.parseInt(numberString.trim());

            // Separate the digits and prepare the output
            StringBuilder separatedDigits = new StringBuilder();
            char[] digits = String.valueOf(number).toCharArray();
            for (int i = 0; i < digits.length; i++) {
                separatedDigits.append(digits[i]); // Add each digit
                if (i < digits.length - 1) {
                    separatedDigits.append(" "); // Add space between digits
                }
            }

            // Write the separated digits to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(separatedDigits.toString());
            writer.close();
             // Display the contents of separated.txt
            displayOutputFile(outputFile);

            System.out.println("Separated digits written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error reading or writing files: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in " + inputFile + ": " + e.getMessage());
        }
    }

    private static void createInputFile(String fileName) {
        File file = new File(fileName);
        // Check if the file exists
        if (!file.exists()) {
            try {
                // Create the file and write a default number
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write("12345"); // Default number to write
                writer.close();
                System.out.println(fileName + " created with default number.");
            } catch (IOException e) {
                System.out.println("Error creating " + fileName + ": " + e.getMessage());
            }
        }
    }
    private static void displayOutputFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Contents of " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line in the file
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading " + fileName + ": " + e.getMessage());
        }
    }
}
