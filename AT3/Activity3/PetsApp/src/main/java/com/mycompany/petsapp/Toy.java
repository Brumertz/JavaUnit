/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author BrumertzTafe
 */
public class Toy {
    private int id;
    private String name;

    // Constructor
    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters for id and name
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toy ID: " + id + ", Name: " + name;
    }
   
}
