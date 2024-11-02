/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalaverage;

/**
 *
 * @author 30085204
 */
import java.util.Scanner;

public class TotalAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate total
        int total = num1 + num2 + num3;

        // Calculate average
        double average = total / 3.0;  // Use 3.0 to ensure decimal division

        // Display the results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        // Close the scanner
        scanner.close();
    }
}
