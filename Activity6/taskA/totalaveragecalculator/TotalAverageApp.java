/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package totalaveragecalculator;

/**
 *
 * @author 30085204
 */
public class TotalAverageApp {
    
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
