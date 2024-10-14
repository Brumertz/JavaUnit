/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computemethodsapp;
 


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * This class contains unit tests for the ComputeMethods class.
 * It tests temperature conversion, hypotenuse calculation, and dice roll functionality.
 * Debug messages are included to trace the test flow.
 *
 * Author: 30085204
 */
public class ComputeMethodsTest {

    // Create an instance of the ComputeMethods class
    ComputeMethods methods;
    public ComputeMethodsTest(){
    }

    /**
     * This method runs once before all test methods.
     * It's used to initialize any shared resources.
     */
    @BeforeAll
    public static void initAll() {
        System.out.println("Starting all tests...");
    }

    /**
     * This method runs before each test method.
     * It is used to set up the required objects or states before every test.
     */
    @BeforeEach
    public void init() {
        System.out.println("Setting up before test...");
        methods = new ComputeMethods();  // Initialize the ComputeMethods object
    }

    /**
     * Test method for fToC() - Fahrenheit to Celsius conversion.
     * It converts 100 degrees Fahrenheit to Celsius and checks if the result is correct.
     */
    @Test
    public void testFToC() {
        System.out.println("Running testFToC...");
        double fahrenheit = 100.0;
        double expectedCelsius = 37.7778; // Expected Celsius result
        double actualCelsius = methods.fToC(fahrenheit); // Call method

        // Check if the actual result matches the expected result (with a small margin of error)
        assertEquals(expectedCelsius, actualCelsius, 0.0001, "Fahrenheit to Celsius conversion failed");
    }

    /**
     * Test method for hypotenuse() - Hypotenuse calculation using Pythagoras' theorem.
     * It calculates the hypotenuse of a triangle with sides of length 3 and 4.
     */
    @Test
    public void testHypotenuse() {
        System.out.println("Running testHypotenuse...");
        int width = 3;
        int height = 4;
        double expectedHypotenuse = 5.0; // Expected hypotenuse result
        double actualHypotenuse = methods.hypotenuse(width, height); // Call method

        // Verify if the calculated hypotenuse matches the expected value
        assertEquals(expectedHypotenuse, actualHypotenuse, 0.0001, "Hypotenuse calculation failed");
    }

    /**
     * Test method for roll() - Dice rolling simulation.
     * It checks if the sum of two dice is within the expected range (2 to 12).
     */
    @Test
    public void testRoll() {
        System.out.println("Running testRoll...");
        int rollResult = methods.roll(); // Simulate rolling two dice

        // Verify that the dice roll result is between 2 and 12
        assertTrue(rollResult >= 2 && rollResult <= 12, "Dice roll result is out of expected range");
    }

    /**
     * This method runs after each test method.
     * It is used to clean up resources after every test.
     */
    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        methods = null;  // Clean up the methods object
    }

    /**
     * This method runs once after all test methods have been executed.
     * It's used for final cleanup or reporting.
     */
    @AfterAll
    public static void tearDownAll() {
        System.out.println("All tests completed.");
    }
}