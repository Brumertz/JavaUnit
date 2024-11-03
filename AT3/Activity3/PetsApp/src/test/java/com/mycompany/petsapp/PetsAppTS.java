/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author 30085204
 */
public class PetsAppTS {
    
    @Test
    void testPetSpeak() {
        Toy toy = new Toy(1, "Generic Toy");
        Pet pet = new Pet(1, "Generic Pet", 3, toy);
        
        // Redirect output to capture speak method output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pet.speak();
        
        // Reset output
        System.setOut(System.out);
        
        String output = outContent.toString().trim();
        assertTrue(output.contains("Pet speaks"), "The pet should say 'Pet speaks'");
    }

    @Test
    void testDogSpeak() {
        Toy toy = new Toy(1, "Ball");
        Dog dog = new Dog(2, "Buddy", 5, toy);
        
        // Redirect output to capture speak method output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        dog.speak();
        
        // Reset output
        System.setOut(System.out);

        String output = outContent.toString().trim();
        assertTrue(output.contains("Pet speaks"), "The dog should say 'Pet speaks' first");
        assertTrue(output.contains("Woof Woof"), "The dog should also say 'Woof Woof'");
    }

    @Test
    void testCatSpeak() {
        Toy toy = new Toy(2, "Mouse Toy");
        Cat cat = new Cat(3, "Whiskers", 4, toy);
        
        // Redirect output to capture speak method output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        cat.speak();
        
        // Reset output
        System.setOut(System.out);

        String output = outContent.toString().trim();
        assertTrue(output.contains("Pet speaks"), "The cat should say 'Pet speaks' first");
        assertTrue(output.contains("Meow Meow"), "The cat should also say 'Meow Meow'");
    }
}