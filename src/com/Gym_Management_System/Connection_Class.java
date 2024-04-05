package com.Gym_Management_System;
import java.sql.*;
public class Connection_Class {
    Connection con;
    Statement stm;
    Connection_Class()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Gym_Management","root","aniket@21");
            stm=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String s[])
    {
        new Connection_Class();
    }

}
