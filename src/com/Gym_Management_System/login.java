package com.Gym_Management_System;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5;
    JTextField tf;
    JPasswordField pf;
    JPanel p1,p2;
    JButton bt1,bt2;
    Font f,f1;

    login(){
        super("login");
        setLocation(50,50);
        setResizable(false);
        setSize(400,200);

        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);

        l1=new JLabel("Welcome to Fitness Point");
        l2=new JLabel("UserName");
        l3=new JLabel("Password");

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.RED);
        l2.setForeground(Color.BLUE);
        l3.setForeground(Color.BLUE);
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);

        tf=new JTextField();
        pf=new JPasswordField();

        tf.setFont(f1);
        pf.setFont(f1);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/login 2.png"));
        Image img2=img.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        l4=new JLabel(img3);


        bt1=new JButton("Login");
        bt2=new JButton("Cancel");

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt2.setForeground(Color.WHITE);
        bt1.setFont(f1);
        bt2.setFont(f1);

        p1=new JPanel();
        p1.setLayout(new GridLayout(3,2,10,10));
        p1.add(l2);
        p1.add(tf);
        p1.add(l3);
        p1.add(pf);
        p1.add(bt1);
        p1.add(bt2);

        setLayout(new BorderLayout(30,30));

        add(l1,"North");
        add(l4,"East");
        add(p1,"Center");
    }
    public void actionPerformed(ActionEvent e)
    {
        String name=tf.getText();
        String pass=pf.getText();
        if(e.getSource()==bt1)
        {
            try
            {
                Connection_Class obj=new Connection_Class();
                String q="select * from loginpage where username='"+name+"' and password='"+pass+"'";
                ResultSet rest=obj.stm.executeQuery(q);
                if(rest.next())
                {
                    new Home_page().setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Not Found any data :(");
                    this.setVisible(false);
                }
            }catch(Exception exp){}

        }
        if(e.getSource()==bt2)
        {
            JOptionPane.showMessageDialog(null,"Are you sure to cancle ?");
            this.setVisible(false);
        }
    }
    public static void main(String args[]){
        new login().setVisible(true);
    }
}
