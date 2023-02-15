package quiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class quizlogin extends JFrame implements ActionListener{

    JButton button, button1;
    JTextField fname;

    quizlogin(){
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading= new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("viner hand itc", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,25));
        add(heading);

        JLabel name= new JLabel("Enter your name:");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("mongolian", Font.BOLD, 20));
        name.setForeground(new Color(30,144,25));
        add(name);

         fname= new JTextField();
        fname.setBounds(735,200,300,25);
        fname.setFont(new Font("Times new Roman", Font.BOLD, 20));
        add(fname);

        button = new JButton("Rules");
        button.setBounds(735,270,120,25);
        button.setBackground(new Color(30,144,254));
        button.setForeground(Color.white);
        button.addActionListener(this);
        add(button);

         button1 = new JButton("Back");
        button1.setBounds(915,270,120,25);
        button1.setBackground(new Color(30,144,254));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        add(button1);




        getContentPane().setBackground(Color.white);
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);

    }
    public static void main(String[] args) {
        new quizlogin();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            
              if (e.getSource()== button ) {
             String name= fname.getText();
                setVisible(false);
                new Rules( name);
            
        }
    //fname.getText().equals(" ") ){
            //     JOptionPane.showMessageDialog(null, "fill name");
    
        
    
    
            
            // else if(e.getSource()== button1){
            //     setVisible(false);
            // }
            }
        
            
         catch (Exception ae) {
            System.out.println("quizlogin.actionPerformed()");
        }
    
    }
}

       
        
    
    
