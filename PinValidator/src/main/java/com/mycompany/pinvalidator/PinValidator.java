/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pinvalidator;

/**
 * PinValidator.java
 * Author: Brandon Morales Cordoba
 * StudentID: 30085204
 * Date: 
 * Description: This program validates the user's bank PIN with a 4-attempt limit.
 *              If the correct PIN is not entered within 4 attempts, the account
 *              will be temporarily blocked.
 */
import java.util.Scanner;
public class PinValidator {

    public static void main(String[] args) {
        // Declaring the correct PIN
        final int VALID_PIN = 9416; // Example of a valid PIN
        final int MAX_ATTEMPTS = 4; // Maximum allowed attempts
        int userPin;
        int attempts = 0; // Number of attempts taken

        // Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        // Loop until the correct PIN is entered or maximum attempts are reached
        while (attempts < MAX_ATTEMPTS) {
            // Prompt user to enter PIN
            System.out.println("Please enter your 4-digit PIN:");
            userPin = scanner.nextInt();

            // Check if the entered PIN is correct
            if (userPin == VALID_PIN) {
                // Correct PIN entered, grant access and exit loop
                System.out.println("Correct PIN entered. Access granted to your account.");
                break;
            } else {
                // Incorrect PIN, increment attempts
                attempts++;
                System.out.println("Incorrect PIN. You have " + (MAX_ATTEMPTS - attempts) + " attempt(s) left.");
            }

            // Check if the user has used all attempts
            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Your card account is temporarily blocked due to multiple incorrect attempts.");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
