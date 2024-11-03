/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author BrumertzTafe
 */
public class Dog extends Pet {
    // Constructor
    public Dog(int id, String name, int age, Toy favouriteToy) {
        super(id, name, age, favouriteToy);
    }

    // Dog-specific behavior
    public void bark() {
        System.out.println("Woof Woof");
    }

    // Override speak method to demonstrate polymorphism
    @Override
    public void speak() {
        super.speak();
        bark();
    }

}
