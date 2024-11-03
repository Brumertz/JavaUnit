/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eggsorder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author BrumertzTafe
 */
public class EggsOrder {

    public static void main(String[] args) {
        // Check if the file exists
        File file = new File("eggs.txt");
        if (!file.exists()) {
            System.out.println("File not found: " + "eggs.txt");
            return;
        }
        
        int eggs = readEggsFromFile("eggs.txt");
        if (eggs != -1) {  // Ensure the file was read successfully
            String result = calTotalAmount(eggs);
            System.out.println("you got: " + result);
            writeResultToFile(result, "total_amount.txt");
        }
    }

    // Method to read the number of eggs from the file
    public static int readEggsFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            return scanner.nextInt();  // Read the integer from the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            return -1;
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return -1;
        }
    }

    // Method to calculate the total amount based on the number of eggs
    public static String calTotalAmount(int eggs) {
        int dozens = eggs / 12;
        int extraEggs = eggs % 12;
        double total = dozens * 7.25 + extraEggs * 0.75;

        return "You ordered " + eggs + " eggs.\n"
             + "That is " + dozens + " dozen eggs at $7.25 per dozen and "
             + extraEggs + " additional eggs at $0.75 each for a total of $"
             + String.format("%.2f", total) + ".";
    }

    // Method to write the result to the output file
    public static void writeResultToFile(String result, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(result);
            writer.close();
            System.out.println("Result written to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

}
