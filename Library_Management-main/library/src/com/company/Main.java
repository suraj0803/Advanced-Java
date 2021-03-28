package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class HomePage implements ActionListener {
    JFrame load = new JFrame();
    String s;
    JLabel label;
    BufferedImage img;
    JButton login;
    Container c;

    public HomePage() {
        load.setTitle("Amity Central Library");
        load.setBounds(400, 90, 500, 500);
        load.setResizable(false);
        c = load.getContentPane();
        c.setLayout(null);

        s = "<html><strong>   WELCOME TO AMITY" +
                                      " CENTRAL LIBRARY<br>";
        s += " Login to access the e-Library</strong></html>";
        try {
            img = ImageIO.read((new File("C:\\Users\\User\\Desktop\\amityCentralLib.jpg")));
            JLabel picLabel = new JLabel(new ImageIcon(img));
            picLabel.setSize(300, 300);
            picLabel.setLocation(100, 80);
            c.add(picLabel);
        } catch (Exception e) {
            System.out.println("File not found!!");
        }

        label = new JLabel(s);
        label.setForeground(Color.RED);
        label.setSize(200, 50);
        label.setLocation(200, 30);
        c.add(label);


        login = new JButton("LOGIN");
        login.addActionListener(this);
        login.setSize(100, 20);
        login.setLocation(200, 300);
        c.add(login);

        load.setDefaultCloseOperation(EXIT_ON_CLOSE);
        load.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        HomePage hp = new HomePage();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            load.setVisible(false);
            new LoginPage();
        }
    }
}

class LoginPage implements ActionListener{
    JFrame loginPage;
    JLabel username;
    JLabel password;
    JTextField user;
    JTextField key;
    JButton signin;

    JLabel title = new JLabel("Amity eLibrary Login");
    Container cont;
    public LoginPage()
    {
        username = new JLabel("Username");
        password = new JLabel("Password");

        user = new JTextField(15);
        key = new JTextField(15);

        loginPage = new JFrame();
        loginPage.setTitle("Login page");
        loginPage.setBounds(400,90,500,500);
        loginPage.setDefaultCloseOperation(EXIT_ON_CLOSE);
        loginPage.setResizable(false);

        cont = loginPage.getContentPane();
        cont.setLayout(null);

        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.BLUE);
        title.setSize(300,30);
        title.setLocation(200, 30);
        cont.add(title);

        username.setSize(100, 20);
        username.setLocation(150, 100);
        cont.add(username);
        user.setSize(190, 20);
        user.setLocation(250, 100);
        cont.add(user);

        password.setSize(190, 20);
        password.setLocation(150, 150);
        cont.add(password);
        key.setSize(190, 20);
        key.setLocation(250, 150);
        cont.add(key);

        signin = new JButton("Sign In");
        signin.setSize(100,20);
        signin.setLocation(200, 200);
        signin.addActionListener(this);
        cont.add(signin);

        loginPage.setLocationRelativeTo(null);
        loginPage.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == signin)
        {
            if(user.getText().equals("kuldeep") && key.getText().equals("abcde"))
            {
                loginPage.setVisible(false);
                new Catalogue();
            }
            else
            {
                JLabel access = new JLabel("Access Denied!!!");
                access.setForeground(Color.RED);
                access.setFont(new Font("Arial", Font.BOLD, 20));
                access.setSize(190, 20);
                access.setLocation(175,250);
                cont.add(access);
                loginPage.repaint();
            }
        }
    }
}

class Catalogue extends JFrame{
    JFrame frame = new JFrame();
    String data[][] = new String[][]{{"1001","C Programming","Dennis Ritchie"},
            {"1002", "Learn C the Hard way.","Pearson"},
            {"1003", "Digital Logic","R.P. Jain"}};
    String column[] = new String[]{"Book ID", "Book Title","Author"};

    Container layout;
    public Catalogue()
    {
        JTable cat = new JTable(data,column);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.add(new JScrollPane(cat));
        frame.setTitle("CATALOGUE");
        frame.pack();
        frame.setVisible(true);
    }
}
