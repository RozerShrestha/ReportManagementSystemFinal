/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ReportManagementSystem.model;

import com.ReportManagementSystem.Db.DBConnection;
import com.ReportManagementSystem.entities.Users;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginModel {
    public static int insert(Users user) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="INSERT INTO login (username,position,password) VALUES(?,?,?)";
        PreparedStatement statement=connection.initStatement(sql);
        statement.setString(1, user.getUserName());
        statement.setString(2, user.getPosition());
        statement.setString(3, user.getPassword());
        int result=connection.executeUpdate();
        connection.close();
        return result;
    }
}
