/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javastory;

/**
 *
 * @author 30085204
 */
import java.util.Scanner;

public class JavaStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduction
        System.out.println("Welcome to the Interactive Story Generator!");
        System.out.println("Please provide the following information to customize your story.\n");

        // Request user input
        System.out.print("Enter the name of the main character: ");
        String name = scanner.nextLine();

        System.out.print("Enter the place where the story takes place: ");
        String place = scanner.nextLine();

        System.out.print("Enter an activity that the main character does: ");
        String activity = scanner.nextLine();

        System.out.print("Enter an important object in the story: ");
        String object = scanner.nextLine();

        System.out.print("Enter an emotion that the main character feels: ");
        String feeling = scanner.nextLine();

        // Generate and display the story
        System.out.println("\nHere is your personalized story:\n");

        System.out.println("Once upon a time, there was a main character named " + name + ".");
        System.out.println("One day, " + name + " decided to go to " + place + ".");
        System.out.println("While there, " + name + " found a mysterious " + object + ".");
        System.out.println("Feeling very " + feeling + ", " + name + " decided to start " + activity + " with it.");
        System.out.println("This adventure turned out to be an unforgettable experience for " + name + ".");

        // Close the scanner
        scanner.close();
    }
}