/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement;

/**
 *
 * @author 30085204
 */
public class OnlineStudent extends Student {
    private OnlineTool tool;
    private int studyPeriod;

    public OnlineStudent(String name, int id, OnlineTool tool, int studyPeriod) {
        super(name, id);
        this.tool = tool;
        this.studyPeriod = studyPeriod;
    }

    // Getters and Setters
    public OnlineTool getTool() {
        return tool;
    }

    public void setTool(OnlineTool tool) {
        this.tool = tool;
    }

    public int getStudyPeriod() {
        return studyPeriod;
    }

    public void setStudyPeriod(int studyPeriod) {
        this.studyPeriod = studyPeriod;
    }
}
