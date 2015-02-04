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
public class Users {
    private int loginId;
    private String userName;
    private String position;
    private String password;

    public Users() {
    }

    public Users(int loginId, String userName, String position, String password) {
        this.loginId = loginId;
        this.userName = userName;
        this.position = position;
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPosition() {
        return position;
    }

    public String getPassword() {
        return password;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" + "loginId=" + loginId + ", userName=" + userName + ", position=" + position + ", password=" + password + '}';
    }
    
    
}
