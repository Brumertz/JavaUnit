/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computemethodsapp;

/**
 *
 * @author 30085204
 */
public class ComputeMethods {
     public double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double hypotenuse(int width, int height) {
        return Math.sqrt((width * width) + (height * height));
    }

    public int roll() {
        int die1 = (int) (Math.random() * 6 + 1);
        int die2 = (int) (Math.random() * 6 + 1);
        return die1 + die2;
    }
}
