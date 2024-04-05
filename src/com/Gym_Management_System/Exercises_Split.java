package com.Gym_Management_System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercises_Split extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    JPanel p1,p2,p3,p4;
    Font f1,f2;

    Exercises_Split()
    {
        super("Exercises Images");
        setSize(900,500);
        setLocation(50,50);

        f1=new Font("Lucida Fax",Font.BOLD,30);

        l1=new JLabel("Some Motivational Thoughts");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(f1);

        f2=new Font("MS UI Gothic",Font.BOLD,18);

        l2=new JLabel("Do Work Hard");
        l3=new JLabel("One More Reps");
        l4=new JLabel("Fuck they people who speek you can't do nothing");
        l5=new JLabel("Eat, Work Hard, Sleep ");
        l6=new JLabel("Bro trust me her love fuck you mentally");
        l7=new JLabel("leve Alone and do Exercise");
        l8=new JLabel("Bro any peopel not trust You");
        l9=new JLabel("See you merror and Positive");

        l2.setHorizontalAlignment(JLabel.CENTER);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l4.setHorizontalAlignment(JLabel.CENTER);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l6.setHorizontalAlignment(JLabel.CENTER);
        l7.setHorizontalAlignment(JLabel.CENTER);
        l8.setHorizontalAlignment(JLabel.CENTER);
        l9.setHorizontalAlignment(JLabel.CENTER);

        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/ch1.gif"));
        Image imag=img.getImage().getScaledInstance(300,340,Image.SCALE_DEFAULT);
        l12=new JLabel(new ImageIcon(imag));

        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/ch2.jpg"));
        Image imag1=img1.getImage().getScaledInstance(300,340,Image.SCALE_DEFAULT);
        l13=new JLabel(new ImageIcon(imag1));

        bt1=new JButton("CARDIO");
        bt2=new JButton("ABS");
        bt3=new JButton("CHEST");
        bt4=new JButton("SHOLDER");
        bt5=new JButton("LEGS");
        bt6=new JButton("BICEP & TRICEP");
        bt7=new JButton("BACK");
        bt8=new JButton("WARM UP");
        bt9=new JButton("Inspreation Images");
        bt10=new JButton("CANCEL");

        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);
        l8.setFont(f2);
        l9.setFont(f2);
        bt1.setFont(f2);
        bt2.setFont(f2);
        bt3.setFont(f2);
        bt4.setFont(f2);
        bt5.setFont(f2);
        bt6.setFont(f2);
        bt7.setFont(f2);
        bt8.setFont(f2);
        bt9.setFont(f2);
        bt10.setFont(f2);

        l1.setForeground(Color.YELLOW);
        l2.setForeground(Color.RED);
        l3.setForeground(Color.RED);
        l4.setForeground(Color.RED);
        l5.setForeground(Color.RED);
        l6.setForeground(Color.RED);
        l7.setForeground(Color.RED);
        l8.setForeground(Color.RED);
        l9.setForeground(Color.RED);

        bt1.setForeground(Color.CYAN);
        bt2.setForeground(Color.CYAN);
        bt3.setForeground(Color.CYAN);
        bt4.setForeground(Color.CYAN);
        bt4.setForeground(Color.CYAN);
        bt5.setForeground(Color.CYAN);
        bt6.setForeground(Color.CYAN);
        bt7.setForeground(Color.CYAN);
        bt8.setForeground(Color.CYAN);
        bt9.setForeground(Color.CYAN);
        bt10.setForeground(Color.CYAN);

        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.BLACK);
        bt3.setBackground(Color.BLACK);
        bt4.setBackground(Color.BLACK);
        bt5.setBackground(Color.BLACK);
        bt6.setBackground(Color.BLACK);
        bt7.setBackground(Color.BLACK);
        bt8.setBackground(Color.BLACK);
        bt9.setBackground(Color.BLACK);
        bt10.setBackground(Color.BLACK);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        bt10.addActionListener(this);

        p1=new JPanel();
        p1.setLayout(new GridLayout(9,2,10,10));

        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);

        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        p1.add(bt4);
        p1.add(bt5);
        p1.add(bt6);
        p1.add(bt7);
        p1.add(bt8);
        p1.add(bt9);
        p1.add(bt10);

        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));

        p2.add(l1);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);

        setLayout(new BorderLayout(0,0));
        add(p2,"North");
        add(p1,"Center");

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            new Cardio_Exercise().setVisible(true);
        }
        else if(e.getSource()==bt2)
        {
            new Abs_Exercises().setVisible(true);
        }
        else if(e.getSource()==bt3)
        {
            new Chest_Exercises().setVisible(true);
        }
        else if(e.getSource()==bt4)
        {
            new Shoulder_Exercises().setVisible(true);
        }
        else if(e.getSource()==bt5)
        {
            new legs_Exercises().setVisible(true);
        }
        else if(e.getSource()==bt6)
        {
            new Arms_Exercise().setVisible(true);
        }
        else if(e.getSource()==bt7)
        {
            new Back_Exercises().setVisible(true);
        }
        else if(e.getSource()==bt8)
        {
            new WarmUp().setVisible(true);
        }
        else if(e.getSource()==bt9)
        {
            new Inspirational_Thoughts().setVisible(true);
        }
        else if(e.getSource()==bt10)
        {
            JOptionPane.showMessageDialog(null,"Areyou sure?");
            this.setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new Exercises_Split().setVisible(true);
    }
}

