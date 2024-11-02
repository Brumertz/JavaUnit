/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author 30085204
 */
public class InternationalStudent extends Student {
    private String country;
    private int visaPeriod;

    public InternationalStudent(String name, int id, String country, int visaPeriod) {
        super(name, id);
        this.country = country;
        this.visaPeriod = visaPeriod;
    }

    // Getters and Setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVisaPeriod() {
        return visaPeriod;
    }

    public void setVisaPeriod(int visaPeriod) {
        this.visaPeriod = visaPeriod;
    }
}
