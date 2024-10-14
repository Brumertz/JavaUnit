/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberwithspaces;

/**
 *
 * @author 30085204
 */
import java.util.Scanner;

public class NumberWithSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Separate the digits using arithmetic operations
        int digit1 = number / 10000;          // Extracts the first digit
        int digit2 = (number / 1000) % 10;    // Extracts the second digit
        int digit3 = (number / 100) % 10;     // Extracts the third digit
        int digit4 = (number / 10) % 10;      // Extracts the fourth digit
        int digit5 = number % 10;             // Extracts the fifth digit
        
        // Print the digits separated by spaces
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
        
        scanner.close();
    }
}
