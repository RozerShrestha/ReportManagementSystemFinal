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
public class reportContent {
   private int rId;
   private String rName;
   private int rAssignment;
   private int rMidterm;
   private int rPresentation;
   private int rPreboard;
   private int rTotal;

    public reportContent() {
    }

    public reportContent(int rId, String rName, int rAssignment, int rMidterm, int rPresentation, int rPreboard, int rTotal) {
        this.rId = rId;
        this.rName = rName;
        this.rAssignment = rAssignment;
        this.rMidterm = rMidterm;
        this.rPresentation = rPresentation;
        this.rPreboard = rPreboard;
        this.rTotal = rTotal;
    }

    public int getrId() {
        return rId;
    }

    public String getrName() {
        return rName;
    }

    public int getrAssignment() {
        return rAssignment;
    }

    public int getrMidterm() {
        return rMidterm;
    }

    public int getrPresentation() {
        return rPresentation;
    }

    public int getrPreboard() {
        return rPreboard;
    }

    public int getrTotal() {
        return rTotal;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setrAssignment(int rAssignment) {
        this.rAssignment = rAssignment;
    }

    public void setrMidterm(int rMidterm) {
        this.rMidterm = rMidterm;
    }

    public void setrPresentation(int rPresentation) {
        this.rPresentation = rPresentation;
    }

    public void setrPreboard(int rPreboard) {
        this.rPreboard = rPreboard;
    }

    public void setrTotal(int rTotal) {
        this.rTotal = rTotal;
    }

    @Override
    public String toString() {
        return "reportContent{" + "rId=" + rId + ", rName=" + rName + ", rAssignment=" + rAssignment + ", rMidterm=" + rMidterm + ", rPresentation=" + rPresentation + ", rPreboard=" + rPreboard + ", rTotal=" + rTotal + '}';
    }
   
   
}
