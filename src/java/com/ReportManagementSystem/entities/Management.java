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
public class Management {
    private int mgmtId;
    private String mgmtName;
    private String mgmtPost;

    public Management() {
    }

    public Management(int mgmtId, String mgmtName, String mgmtPost) {
        this.mgmtId = mgmtId;
        this.mgmtName = mgmtName;
        this.mgmtPost = mgmtPost;
    }

    public int getMgmtId() {
        return mgmtId;
    }

    public String getMgmtName() {
        return mgmtName;
    }

    public String getMgmtPost() {
        return mgmtPost;
    }

    public void setMgmtId(int mgmtId) {
        this.mgmtId = mgmtId;
    }

    public void setMgmtName(String mgmtName) {
        this.mgmtName = mgmtName;
    }

    public void setMgmtPost(String mgmtPost) {
        this.mgmtPost = mgmtPost;
    }

    @Override
    public String toString() {
        return "ManagementInfo{" + "mgmtId=" + mgmtId + ", mgmtName=" + mgmtName + ", mgmtPost=" + mgmtPost + '}';
    }
    
    
}
