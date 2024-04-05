package com.Gym_Management_System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Customer_Information extends JFrame implements ActionListener {
    String x[]={"Recipt Id","Name","Father's name","Email","Address","Contact no","Payments Plan","gender","Height","Weight","Remarks","Trainer name","catg."};
    JButton bt;
    String y[][]=new String[20][14];
    int i=0,j=0;
    JTable t;
    JLabel l1,l2;
    JTextField tf1;
    JPanel p1,p2,p3;
    Font f,f1;
    Customer_Information()
    {
        super("Customer information");
        setSize(1500,400);
        setLocation(1,1);
        f=new Font("MS UI Gothic",Font.BOLD,15);
        try
        {
            Connection_Class obj=new Connection_Class();
            String q="Select * from add_Customer";
            ResultSet rest=obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("recipt_no");
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("fname");
                y[i][j++]=rest.getString("email");
                y[i][j++]=rest.getString("address");
                y[i][j++]=rest.getString("contactNo");
                y[i][j++]=rest.getString("payments_plan");
                y[i][j++]=rest.getString("gender");
                y[i][j++]=rest.getString("height");
                y[i][j++]=rest.getString("weight");
                y[i][j++]=rest.getString("remarks");
                y[i][j++]=rest.getString("trainer_name");
                y[i][j++]=rest.getString("catogery");
                i++;
                j=0;
            }
            t=new JTable(y,x);
            t.setFont(f);
            t.setBackground(Color.BLACK);
            t.setForeground(Color.WHITE);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        JScrollPane sp=new JScrollPane(t);
        f1=new Font("Lucida Fax",Font.BOLD,25);

        l1=new JLabel("Delete any Students ?");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);
        l1.setForeground(Color.YELLOW);

        l2=new JLabel("Customer Recepit");
        l2.setFont(f1);
        l2.setForeground(Color.GRAY);

        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        tf1=new JTextField();
        bt=new JButton("Delete Trainer");
        tf1.setFont(f);
        bt.setFont(f);


        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.RED);
        bt.addActionListener(this);

        p2=new JPanel();
        p2.setLayout(new GridLayout(1,3,10,10));
        p2.add(l2);
        p2.add(tf1);
        p2.add(bt);

        p3=new JPanel();
        p3.setLayout(new GridLayout(2,1,10,10));
        p3.add(p1);
        p3.add(p2);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);
        p3.setBackground(Color.BLACK);

        add(p3,"South");
        add(sp);
    }
    public void actionPerformed(ActionEvent e)
    {
        int id=Integer.parseInt(tf1.getText());
        if(e.getSource()==bt)
        {
            try
            {
                Connection_Class obj1=new Connection_Class();
                String q="delete from add_Customer where recipt_no='"+id+"'";
                obj1.stm.executeUpdate(q);
                setVisible(false);
                new Customer_Information().setVisible(true);
            }
            catch(Exception evx)
            {
                evx.printStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new Customer_Information().setVisible(true);
    }
}

