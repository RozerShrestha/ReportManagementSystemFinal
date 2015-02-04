/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ReportManagementSystem.model;

import com.ReportManagementSystem.Db.DBConnection;
import com.ReportManagementSystem.entities.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rozer
 */
public class Student_bim7th {
    
    public static int insert(Student students) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();//DBConnection class ko object banako
        connection.open();
        String sql="INSERT INTO student_bim7th(name,roll,subject,class,assignment,report,midterm,presentation,preboard,total) VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,students.getName());
         statement.setInt(2,students.getRoll());
        statement.setString(3,students.getSubject());
        statement.setString(4,students.getclass());
        statement.setInt(5,students.getAssignment());
        statement.setInt(6,students.getReport());
        statement.setInt(7,students.getMidterm());
        statement.setInt(8,students.getPresentation());
        statement.setInt(9,students.getPreboard());
        statement.setInt(10,students.getTotal());
                      
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static int Update(Student students) throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="Update student_bim7th set name=?,subject=?,class=?,roll=?,assignment=?,report=?, midterm=?, presentation=?, preboard=?, total=? WHERE id=?";
        System.out.println(students.toString());
        PreparedStatement statement= connection.initStatement(sql);
       
        statement.setString(1,students.getName());
        statement.setString(2, students.getSubject());
        statement.setString(3,students.getclass());
        statement.setInt(4,students.getRoll());
        statement.setInt(5,students.getAssignment());
        statement.setInt(6,students.getReport());
        statement.setInt(7,students.getMidterm());
        statement.setInt(8,students.getPresentation());
        statement.setInt(9,students.getPreboard());
        statement.setInt(10,students.getTotal());
        
        
        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
        public static int Delete(Integer id) throws ClassNotFoundException, SQLException
        {
        DBConnection connection=new DBConnection();
        connection.open();
        String sql="DELETE FROM student_bim7th WHERE id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setString(1,id.toString());

        int result=connection.executeUpdate();
        connection.close();
        return result;
        
    }
    
    public static ArrayList<Student> getIT_Enterpreneur() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='IT Enterpreneur'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    public static ArrayList<Student> getHIghSpeed() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='High Speed and Multimedia Networking'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    public static ArrayList<Student> getHRM() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='human resource management'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    
    public static ArrayList<Student> getMIS() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='management information system'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    
    public static ArrayList<Student> getOR() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='organization relation'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    
    public static ArrayList<Student> getCTDM() throws ClassNotFoundException, SQLException
    {
        DBConnection connection=new DBConnection();
        connection.open();
        ArrayList<Student> students=new ArrayList<Student>();
        String sql="SELECT * from student_bim7th WHERE subject='critical thinking and decision making'";
        PreparedStatement statement= connection.initStatement(sql);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            Student s=new Student();
            s.setName(rs.getString("name"));
            s.setSubject(rs.getString("subject"));
            s.setClass(rs.getString("class"));
            s.setRoll(Integer.parseInt(rs.getString("roll")));
            s.setAssignment(Integer.parseInt(rs.getString("assignment")));
            s.setReport(Integer.parseInt(rs.getString("report")));
           s.setMidterm(Integer.parseInt(rs.getString("midterm")));
           s.setPresentation(Integer.parseInt(rs.getString("presentation")));
           s.setPreboard(Integer.parseInt(rs.getString("preboard")));
           s.setTotal(Integer.parseInt(rs.getString("total")));
          students.add(s);   
        }
        connection.close();                
        return students;
    }
    public static Student getByPk(int id) throws ClassNotFoundException, SQLException{
        DBConnection connection=new DBConnection();
        connection.open();
        Student students=null;
        String sql="SELECT * from student_bim7th where students_id=?";
        PreparedStatement statement= connection.initStatement(sql);
        statement.setInt(1, id);
        ResultSet rs=connection.executeQuery();
       while(rs.next()){
            students=new Student();
            students.setId(Integer.parseInt(rs.getString("students_id")));
            students.setName(rs.getString("name"));
            students.setSubject(rs.getString("subject"));
            students.setClass(rs.getString("class"));
            students.setRoll(Integer.parseInt(rs.getString("roll")));
            students.setAssignment(Integer.parseInt(rs.getString("assignment")));
            students.setReport(Integer.parseInt(rs.getString("report")));
            students.setMidterm(Integer.parseInt(rs.getString("midterm")));
            students.setPresentation(Integer.parseInt(rs.getString("presentation")));
            students.setPreboard(Integer.parseInt(rs.getString("preboard")));
            students.setTotal(Integer.parseInt(rs.getString("total"))); 
        }
        connection.close();                
        return students;
    }
}
