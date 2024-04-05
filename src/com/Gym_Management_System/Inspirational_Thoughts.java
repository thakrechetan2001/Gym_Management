package com.Gym_Management_System;
import java.awt.*;
import javax.swing.*;
public class Inspirational_Thoughts extends JFrame
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JPanel p1,p2;
    Font f1,f2;
    Inspirational_Thoughts()
    {
            super("Exercises Images");
            setSize(900, 500);
            setLocation(50, 50);

            f1 = new Font("Lucida Fax", Font.BOLD, 30);

            l1 = new JLabel("Some Motivational Thoughts");
            l1.setHorizontalAlignment(JLabel.CENTER);
            l1.setFont(f1);

            f2 = new Font("MS UI Gothic", Font.BOLD, 18);

            l2 = new JLabel("Do Work Hard");
            l3 = new JLabel("One More Reps");
            l4 = new JLabel("Fuck they people who speek you can't do nothing");
            l5 = new JLabel("Eat, Work Hard, Sleep ");
            l6 = new JLabel("Bro trust me her love fuck you mentally");
            l7 = new JLabel("leve Alone and do Exercise");
            l8 = new JLabel("Bro any peopel not trust You");
            l9 = new JLabel("See you merror and Positive");

            l2.setHorizontalAlignment(JLabel.CENTER);
            l3.setHorizontalAlignment(JLabel.CENTER);
            l4.setHorizontalAlignment(JLabel.CENTER);
            l5.setHorizontalAlignment(JLabel.CENTER);
            l6.setHorizontalAlignment(JLabel.CENTER);
            l7.setHorizontalAlignment(JLabel.CENTER);
            l8.setHorizontalAlignment(JLabel.CENTER);
            l9.setHorizontalAlignment(JLabel.CENTER);

            ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/ch1.gif"));
            Image imag = img.getImage().getScaledInstance(300, 340, Image.SCALE_DEFAULT);
            l12 = new JLabel(new ImageIcon(imag));

            ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("com/Gym_Management_System/icons/ch2.jpg"));
            Image imag1 = img1.getImage().getScaledInstance(300, 340, Image.SCALE_DEFAULT);
            l13 = new JLabel(new ImageIcon(imag1));

            l2.setFont(f2);
            l3.setFont(f2);
            l4.setFont(f2);
            l5.setFont(f2);
            l6.setFont(f2);
            l7.setFont(f2);
            l8.setFont(f2);
            l9.setFont(f2);

        l1.setForeground(Color.YELLOW);
        l2.setForeground(Color.RED);
        l3.setForeground(Color.RED);
        l4.setForeground(Color.RED);
        l5.setForeground(Color.RED);
        l6.setForeground(Color.RED);
        l7.setForeground(Color.RED);
        l8.setForeground(Color.RED);
        l9.setForeground(Color.RED);

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

        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));

        p2.add(l1);

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.BLACK);

        setLayout(new BorderLayout(0,0));
        add(p2,"North");
        add(p1,"Center");


    }
        public static void main(String args[])
    {
        new Inspirational_Thoughts().setVisible(true);
    }
}

