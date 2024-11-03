/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eggsorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author BrumertzTafe
 */
public class EggsOrderTS {
      @Test
    public void testCalTotalAmount() {
        int eggs = 35;
        String expected = "You ordered 35 eggs.\nThat is 2 dozen eggs at $7.25 per dozen and 11 additional eggs at $0.75 each for a total of $22.75.";
        String result = EggsOrder.calTotalAmount(eggs);
        assertEquals(expected, result, "The calculated total amount message is incorrect.");
    }
}
