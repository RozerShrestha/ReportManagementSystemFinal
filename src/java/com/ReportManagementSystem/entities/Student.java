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
public class Student {
    private int Id;
    private String Name;
    private String Subject;
    private String Class;
    private int roll;
    private int assignment;
    private int report;
    private int midterm;
    private int presentation;
    private int preboard;
    private int total;

    public Student() {
    }

    public Student(int Id, String Name, String Subject, String Class, int roll, int assignment, int report, int midterm, int presentation, int preboard, int total) {
        this.Id = Id;
        this.Name = Name;
        this.Subject = Subject;
        this.Class = Class;
        this.roll = roll;
        this.assignment = assignment;
        this.report = report;
        this.midterm = midterm;
        this.presentation = presentation;
        this.preboard = preboard;
        this.total = total;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getSubject() {
        return Subject;
    }

    public String getclass() {
        return Class;
    }

    public int getRoll() {
        return roll;
    }

    public int getAssignment() {
        return assignment;
    }

    public int getReport() {
        return report;
    }

    public int getMidterm() {
        return midterm;
    }

    public int getPresentation() {
        return presentation;
    }

    public int getPreboard() {
        return preboard;
    }

    public int getTotal() {
        return total;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setAssignment(int assignment) {
        this.assignment = assignment;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public void setMidterm(int midterm) {
        this.midterm = midterm;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public void setPreboard(int preboard) {
        this.preboard = preboard;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", Subject=" + Subject + ", Class=" + Class + ", roll=" + roll + ", assignment=" + assignment + ", report=" + report + ", midterm=" + midterm + ", presentation=" + presentation + ", preboard=" + preboard + ", total=" + total + '}';
    }
    

}