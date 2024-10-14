/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computemethodsapp;
import java.util.Scanner;
/**
 *
 * @author 30085204
 */
public class ComputeMethodsApp {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ComputeMethods methods = new ComputeMethods();

        System.out.print("Enter temperature Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Temp in celsius is: " + methods.fToC(fahrenheit));

        System.out.print("Enter width of the triangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter height of the triangle: ");
        int height = scanner.nextInt();
        System.out.println("Hypotenuse of the triangle is : " + methods.hypotenuse(width, height));

        System.out.println("The Sum of the tow dice value is: " + methods.roll());
    
    }
}
