/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagement;

/**
 *
 * @author 30085204
 */
public class StudentManagement {

    public static void main(String[] args) {
        Student student1 = new InternationalStudent("Alice", 123, "Colombia", 3);
        Student student2 = new OnlineStudent("Bob", 456, new OnlineTool("Zoom"), 2);

        // Polymorphic behavior demonstration
        System.out.println("Student 1 is an International Student: " + student1.getName());
        System.out.println("Student 2 is an Online Student: " + student2.getName());
    }
}
