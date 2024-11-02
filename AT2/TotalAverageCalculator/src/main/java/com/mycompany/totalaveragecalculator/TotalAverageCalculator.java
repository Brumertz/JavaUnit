/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalaveragecalculator;

/**
 *
 * @author 30085204
 */
public class TotalAverageCalculator {
    // Method to calculate the total of an array of integers
     // Method to calculate the total of the given numbers in the array
    public int getTotal(int[] nos) {
        int total = 0;
        for (int number : nos) {
            total += number; // Add each number to the total
        }
        return total; // Return the total
    }

    // Method to calculate the average of the given numbers in the array
    public double getAverage(int[] nos) {
        if (nos.length == 0) {
            return 0; // Prevent division by zero
        }
        int total = getTotal(nos); // Call getTotal to get the total
        return (double) total / nos.length; // Calculate and return average
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        TotalAverageCalculator tac = new TotalAverageCalculator();
        int[] numbers = {10, 5, 6, 7, 89}; // Sample array of integers

        // Calculate total and average
        int total = tac.getTotal(numbers);
        double average = tac.getAverage(numbers);

        // Display the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
