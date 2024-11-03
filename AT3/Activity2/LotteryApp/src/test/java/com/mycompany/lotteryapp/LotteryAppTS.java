/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lotteryapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.lotteryapp.Lotto;

import java.lang.reflect.Field;


/**
 *
 * @author 30085204
 */
public class LotteryAppTS {

   private void setLottoNumbers(Lotto lotto, int[] testNumbers) throws NoSuchFieldException, IllegalAccessException {
        Field numbersField = Lotto.class.getDeclaredField("numbers");
        numbersField.setAccessible(true);
        numbersField.set(lotto, testNumbers.clone());
    }

    @Test
    public void testPlayLottoOneMatch() throws NoSuchFieldException, IllegalAccessException {
        Lotto lotto = new Lotto("Test Lotto");
        setLottoNumbers(lotto, new int[]{1, 2, 3, 4, 5, 6}); // Setting numbers using reflection
        int[] winningNumbers = {1, 7, 7, 7, 7, 7};
        String result = lotto.playLotto(winningNumbers);

        assertTrue(result.contains("Prize: $100.00"), "Prize should be $100.00 with one match.");
    }

    @Test
    public void testPlayLottoThreeMatches() throws NoSuchFieldException, IllegalAccessException {
        Lotto lotto = new Lotto("Test Lotto");
        setLottoNumbers(lotto, new int[]{1, 2, 3, 4, 5, 6}); // Setting numbers using reflection
        int[] winningNumbers = {1, 2, 3, 7, 7, 7};
        String result = lotto.playLotto(winningNumbers);

        assertTrue(result.contains("Prize: $400.00"), "Prize should be $400.00 with three matches.");
    }

    @Test
    public void testPlayLottoFiveMatches() throws NoSuchFieldException, IllegalAccessException {
        Lotto lotto = new Lotto("Test Lotto");
        setLottoNumbers(lotto, new int[]{1, 2, 3, 4, 5, 6}); // Setting numbers using reflection
        int[] winningNumbers = {1, 2, 3, 4, 5, 7};
        String result = lotto.playLotto(winningNumbers);

        assertTrue(result.contains("Prize: $1600.00"), "Prize should be $1600.00 with five matches.");
    }
}