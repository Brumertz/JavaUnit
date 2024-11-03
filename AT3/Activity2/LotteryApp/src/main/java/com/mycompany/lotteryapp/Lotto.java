/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteryapp;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author BrumertzTafe
 */
public class Lotto {
    private String companyName;
    private int[] numbers = new int[6];

    // Default constructor
    public Lotto() {
        this.companyName = "ABC Lottery Co.";
        generateNumbers();
    }

    // Overloaded constructor
    public Lotto(String name) {
        this.companyName = name;
        generateNumbers();
    }

    // Private method to generate random numbers for the lotto
    private void generateNumbers() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(7) + 1; // Generates numbers between 1 and 7
        }
    }

    // Public method to play the lotto and calculate the prize
    public String playLotto(int[] winningNumbers) {
        if (winningNumbers.length != 6) {
            throw new IllegalArgumentException("Winning numbers array must contain exactly 6 numbers.");
        }

        // Compare the numbers and count matches
        int matches = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == winningNumbers[i]) {
                matches++;
            }
        }

        double prize = calculatePrize(matches);
        
        // Create a result message to display
        return "Company: " + companyName + "\n" +
               "Lotto Numbers: " + Arrays.toString(numbers) + "\n" +
               "Winning Numbers: " + Arrays.toString(winningNumbers) + "\n" +
               "Matches: " + matches + "\n" +
               "Prize: $" + String.format("%.2f", prize) + "\n";
    }

    // Private method to determine the prize based on the number of matches
    private double calculatePrize(int matches) {
        switch (matches) {
            case 1: return 100.00;
            case 2: return 200.00;
            case 3: return 400.00;
            case 4: return 800.00;
            case 5: return 1600.00;
            case 6: return 3200.00;
            default: return 0.00;
        }
    }


    // Getters for testing purposes
    public String getCompanyName() {
        return companyName;
    }

    public int[] getNumbers() {
        return numbers.clone();
    }
    void setNumbersForTesting(int[] testNumbers) {
    if (testNumbers.length != 6) {
        throw new IllegalArgumentException("The test numbers array must have exactly 6 elements.");
    }
    this.numbers = testNumbers.clone();  // Defensive copy to avoid external modification
    }
}