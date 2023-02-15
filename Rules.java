package quiz;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Rules extends JFrame implements ActionListener {
    String name;
    JButton button, button1;
    Rules(String name){
        this.name=name;
        
        setLayout(null);
        JLabel heading= new JLabel("welcome "+name+" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("viner hand itc", Font.BOLD, 28));
        heading.setForeground(new Color(30,144,25));
        add(heading);

        JLabel rules= new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(

            "<html>"+ 
            "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
            "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
            "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
            "4. Crying is allowed but please do so quietly." + "<br><br>" +
            "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
            "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
            "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
            "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
        "<html>"
            

        );
        add(rules);

        button = new JButton("start");
        button.setBounds(400,500,100,30);
        button.setBackground(new Color(30,144,254));
        button.setForeground(Color.white);
        button.addActionListener(this);
        add(button);

         button1 = new JButton("Back");
        button1.setBounds(250,500,100,30);
        button1.setBackground(new Color(30,144,254));
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        add(button1);

        
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setSize(800,650);
        setLocation(350,100);

        

    }
    public static void main(String[] args) {
        new Rules("user");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
        setVisible(false);
        new quiz(name);

       }
       else if(e.getSource()==button1){
        setVisible(false);
        new quizlogin();
       }
        
    }
    
}
