/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petsapp;

/**
 *
 * @author BrumertzTafe
 */
public class PetsApp {

    public static void main(String[] args) {
        Toy ball = new Toy(1, "Ball");
        Toy mouseToy = new Toy(2, "Mouse Toy");

        Pet pet = new Pet(1, "Generic Pet", 3, ball);
        Dog dog = new Dog(2, "Buddy", 5, ball);
        Cat cat = new Cat(3, "Whiskers", 4, mouseToy);

        System.out.println("Pet:");
        pet.speak();

        System.out.println("\nDog:");
        dog.speak();

        System.out.println("\nCat:");
        cat.speak();
    }
}
