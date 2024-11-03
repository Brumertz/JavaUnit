/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lotteryapp;

/**
 *
 * @author BrumertzTafe
 */
public class LotteryApp {

        public static void main(String[] args) { Lotto lot1 = new Lotto();
        
        Lotto lot2 = new Lotto("WA Lottery"); int[] winningNumbers = {3, 5, 4, 3, 7, 1};

            String playResult = "";

            playResult += lot1.playLotto(winningNumbers); playResult += lot2.playLotto(winningNumbers);

                System.out.println(playResult);
        }
}
