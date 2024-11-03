/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30085204
 */
public class Cat extends Pet {

    // Constructor
    public Cat(int id, String name, int age, Toy favouriteToy) {
        super(id, name, age, favouriteToy);
    }

    // Cat-specific behavior
    public void meow() {
        System.out.println("Meow Meow");
    }

    // Override speak method to demonstrate polymorphism
    @Override
    public void speak() {
        super.speak();
        meow();
    }
}
