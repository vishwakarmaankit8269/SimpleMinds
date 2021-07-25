
package simple.minds;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;



public class Rules extends JFrame implements ActionListener {
    JButton b1, b2;
    String username;
    Rules(String username){
        
        this.username=username;
        
        setBounds(600,200,800,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome "+username+" to Simple Minds");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN,16));
        l2.setBounds(20,90,600,350);
        l2.setText(
           "<html>"+
                   "1.You are tend to be a programmer and not a story teller, answer point to point."+"<br><br>"+
                   "2.Do not unnecessarily smile at the person sitting next to you ,they may also not know the answer. "+"<br><br>"+
                   "3.You may have lot of options in the life but here all the questions are compulsory."+"<br><br>"+
                   "4.Crying is allowed but please do so quitely."+"<br><br>"+
                   "5.Only a fool asks and wise answers(Be Wise, not otherwise)."+"<br><br>"+
                   "6.Do not get nervous if your friend is answering more questions , may be he/she is doing Jai Mata Dii. "+"<br><br>"+
                   "7.Brace Yourself, this paper is not for the faint hearted."+"<br><br>"+
                   "8.May you know more then what john Snow knows, good Luck."+"<br><br>"+
            "<html>"
         );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Rules("");
    }
    
}
