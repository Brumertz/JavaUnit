/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author BrumertzTafe
 */
public class Pet {
        protected int id;
        protected String name;
        protected int age;
        protected Toy favouriteToy;

    // Constructor
    public Pet(int id, String name, int age, Toy favouriteToy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favouriteToy = favouriteToy;
    }

    // Method to make the pet speak
    public void speak() {
        System.out.println("Pet speaks");
    }

}
