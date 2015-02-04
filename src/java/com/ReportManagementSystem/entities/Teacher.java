/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ReportManagementSystem.entities;

/**
 *
 * @author Rozer
 */
public class Teacher {
    private int teacherId;
    private String teacherName;
    private String teacherFaculty;
    private String teacherSubject;
    
    public Teacher()
    {
        
    }

    public Teacher(int teacherId, String teacherName, String teacherFaculty, String techerSubject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherFaculty = teacherFaculty;
        this.teacherSubject=teacherSubject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherFaculty() {
        return teacherFaculty;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }
    

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherFaculty(String teacherFaculty) {
        this.teacherFaculty = teacherFaculty;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return "TeacherInfo{" + "teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherFaculty=" + teacherFaculty + ", teacherSubject=" + teacherSubject + '}';
    }
    

    
    
    
    
}
