package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

class biodata extends JFrame {

    JFrame f;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,td;
    JTextArea ta1,ta2;
    JComboBox c1;
    JButton b1,b2;
    JRadioButton rb1,rb2;
    ButtonGroup bg1;
    JCheckBox ch1,ch2,ch3;
    JTable tb1;
    TableColumn sc,tc;
    DefaultTableModel model,dtm;

    public biodata() {
        f=new JFrame("BIODATA --> kuldeep dwivedi");
        l=new JLabel("BIODATA");
        l.setFont(new Font("Algerian",Font.BOLD,35));
        l1=new JLabel("Name                 :-");
        l2=new JLabel("Address              :-");
        l3=new JLabel("Contact Number       :-");
        l4=new JLabel("E-Mail Address       :-");
        l5=new JLabel("Date OF Birth        :-");
        l6=new JLabel("Marital Status       :-");
        l7=new JLabel("Gender               :-");
        l8=new JLabel("Nationality          :-");
        l9=new JLabel("Known Language       :-");
        l10=new JLabel("Qualification       :-");
        l11=new JLabel("Other Qualification :-");
        t1=new JTextField(20);
        ta1=new JTextArea(20,20);
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane s=new JScrollPane(ta1,v,h);
        t2=new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        c1=new JComboBox();
        c1.addItem("Married");
        c1.addItem("Unmarried");
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        bg1=new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        t5=new JTextField(20);
        ch1=new JCheckBox("French");
        ch2=new JCheckBox("Hindi");
        ch3=new JCheckBox("English");
        ta2=new JTextArea(20,20);

        String col[]={"Sr No.","Exam Detail","University/Boards","Year Of     Passing","Grade/Class","Percentage"};
        String row[][]=new String[4][6];
        model = new DefaultTableModel(row, col);
        tb1 = new JTable(model);



        JScrollPane s1=new JScrollPane(tb1,v,h);
        JScrollPane s2=new JScrollPane(ta2,v,h);
        b1=new JButton("Submit");
        b2=new JButton("Cancel");
        JPanel p=new JPanel();
        p.setLayout(null);

        l.setBounds(200,30,200,50);
        l1.setBounds(80,80,150,30);
        l2.setBounds(80,130,150,30);
        l3.setBounds(80,180,150,30);
        l4.setBounds(80,220,150,30);
        l5.setBounds(80,260,150,30);
        l6.setBounds(80,300,150,30);
        l7.setBounds(80,340,150,30);
        l8.setBounds(80,380,150,30);
        l9.setBounds(80,420,150,30);
        l10.setBounds(80,460,150,30);
        l11.setBounds(80,600,150,30);

        t1.setBounds(250,80,200,25);
        s.setBounds(250,120,200,50);
        t2.setBounds(250,180,200,25);
        t3.setBounds(250,220,200,25);
        t4.setBounds(250,260,200,25);
        c1.setBounds(250,300,200,25);
        rb1.setBounds(250,340,100,25);
        rb2.setBounds(350,340,200,25);
        t5.setBounds(250,380,200,25);
        ch1.setBounds(250,420,80,20);
        ch2.setBounds(330,420,60,20);
        ch3.setBounds(400,420,80,20);
        s1.setBounds(20,500,600,100);
        s2.setBounds(250,610,300,70);
        b1.setBounds(200,700,100,30);
        b2.setBounds(350,700,100,30);

        p.add(l);
        p.add(l1);p.add(l2);
        p.add(l3);p.add(l4);
        p.add(l5);p.add(l6);
        p.add(l7);p.add(l8);
        p.add(l9);p.add(l10);
        p.add(l11);p.add(t1);
        p.add(s);p.add(t2);
        p.add(t3);p.add(t4);
        p.add(c1);p.add(rb1);
        p.add(rb2);p.add(t5);
        p.add(ch1);p.add(ch2);
        p.add(ch3);
        p.add(s1);p.add(s2);
        p.add(b1);p.add(b2);

        f.add(p,BorderLayout.CENTER);
        f.add(p);

        f.setSize(650,780);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        b1.addActionListener(new ActionListener()
        {

            public void actionPerformed(ActionEvent ae)
            {
                try{
                    int l3 = Integer.parseInt(t4.getText());
                }
                catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Only Numbers are allowed");
                }
                JOptionPane.showMessageDialog(null, "Data added Successfully ");

            }
        });

    }
    public static void main(String args[]){
        biodata b=new biodata();
    }
}