/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eggsorder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author 30085204
 */
public class EggsOrder {
 // Method to calculate the total amount based on the number of eggs
    public static double calculateTotalAmount(int numberOfEggs) {
        int dozens = numberOfEggs / 12;
        int remainingEggs = numberOfEggs % 12;
        
        double totalCost = (dozens * 7.25) + (remainingEggs * 0.75);
        return totalCost;
    }

    public static void main(String[] args) {
        String inputFile = "eggs.txt";
        String outputFile = "total_amount.txt";
        
        try {
            // Read number of eggs from eggs.txt
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            int numberOfEggs = Integer.parseInt(reader.readLine());
            reader.close();
            
            // Calculate total amount
            double totalAmount = calculateTotalAmount(numberOfEggs);
            int dozens = numberOfEggs / 12;
            int remainingEggs = numberOfEggs % 12;

            // Create the explanatory message
            String message = "You ordered " + numberOfEggs + " eggs.\n" +
                             "That is " + dozens + " dozen eggs at $7.25 per dozen and " +
                             remainingEggs + " additional eggs at $0.75 each for a total of $" + String.format("%.2f", totalAmount) + ".";

            // Write the message to total_amount.txt
            FileWriter writer = new FileWriter(outputFile);
            writer.write(message);
            writer.close();

            System.out.println("Order processed successfully. Check total_amount.txt for details.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }
    }
}