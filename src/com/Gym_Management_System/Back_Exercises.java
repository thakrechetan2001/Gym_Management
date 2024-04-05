package com.Gym_Management_System;
import java.awt.*;
import javax.swing.*;
public class Back_Exercises extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JPanel p1,p2;
    Font f1;
    Back_Exercises()
    {
        super("Cardio Exercise Images");
        setSize(1300,500);
        setLocation(50,50);

        f1=new Font("Lucida Fax",Font.BOLD,30);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/b1.jpg"));
        Image imag=img.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        l1=new JLabel(new ImageIcon(imag));

        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/b2.jpg"));
        Image imag1=img1.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        l2=new JLabel(new ImageIcon(imag1));

        ImageIcon img2=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/b3.jpg"));
        Image imag2=img2.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        l3=new JLabel(new ImageIcon(imag2));

        ImageIcon img3=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/b4.jpg"));
        Image imag3=img3.getImage().getScaledInstance(300,350,Image.SCALE_DEFAULT);
        l4=new JLabel(new ImageIcon(imag3));

        l5=new JLabel("Back Exercise");
        l5.setFont(f1);
        l5.setForeground(Color.YELLOW);
        l5.setHorizontalAlignment(JLabel.CENTER);

        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.BLACK);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);

        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.setBackground(Color.BLACK);
        p2.add(l5);

        setLayout(new BorderLayout(0,0));

        add(p1,"Center");
        add(p2,"North");
    }
    public static void main(String args[])
    {
        new Back_Exercises().setVisible(true);
    }
}

