/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eggsordertest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.mycompany.eggsorder.EggsOrder;
/**
 *
 * @author 30085204
 */
public class EggsOrderTest {
     // Test case: when ordering 26 eggs
    @Test
    public void testCalculateTotalAmount_TwentySixEggs() {
        assertEquals(16.00, EggsOrder.calculateTotalAmount(26), 0.01);
    }

    // Test case: when ordering exactly 12 eggs (one dozen)
    @Test
    public void testCalculateTotalAmount_OneDozenEggs() {
        assertEquals(7.25, EggsOrder.calculateTotalAmount(12), 0.01);
    }

    // Test case: when ordering 0 eggs (edge case)
    @Test
    public void testCalculateTotalAmount_ZeroEggs() {
        assertEquals(0.00, EggsOrder.calculateTotalAmount(0), 0.01);
    }

    // Test case: when ordering 1 egg (fewer than a dozen)
    @Test
    public void testCalculateTotalAmount_OneEgg() {
        assertEquals(0.75, EggsOrder.calculateTotalAmount(1), 0.01);
    }

    // Test case: when ordering 11 eggs (less than a dozen)
    @Test
    public void testCalculateTotalAmount_ElevenEggs() {
        assertEquals(8.25, EggsOrder.calculateTotalAmount(11), 0.01); // 1 dozen at $7.25, plus 11 eggs at $0.75
    }

    // Test case: when ordering 24 eggs (two dozen)
    @Test
    public void testCalculateTotalAmount_TwoDozenEggs() {
        assertEquals(14.50, EggsOrder.calculateTotalAmount(24), 0.01); // 2 dozen at $7.25 per dozen
    }

    // Test case: when ordering 30 eggs (more than two dozen, with remaining eggs)
    @Test
    public void testCalculateTotalAmount_ThirtyEggs() {
        assertEquals(18.50, EggsOrder.calculateTotalAmount(30), 0.01); // 2 dozen at $7.25 per dozen, 6 eggs at $0.75
    }

    // Test case: when ordering a large number of eggs (e.g., 100 eggs)
    @Test
    public void testCalculateTotalAmount_LargeOrder() {
        assertEquals(62.75, EggsOrder.calculateTotalAmount(100), 0.01); // 8 dozen at $7.25, 4 eggs at $0.75
    }

    // Test case: when ordering an odd number of eggs (e.g., 13 eggs, 1 more than a dozen)
    @Test
    public void testCalculateTotalAmount_ThirteenEggs() {
        assertEquals(8.00, EggsOrder.calculateTotalAmount(13), 0.01); // 1 dozen at $7.25, 1 egg at $0.75
    }

    // Test case: when ordering a negative number of eggs (invalid case, assuming function should handle gracefully)
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateTotalAmount_NegativeEggs() {
        EggsOrder.calculateTotalAmount(-5); // Should throw an exception
    }
}