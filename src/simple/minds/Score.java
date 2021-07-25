
package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    JButton pa,b2;
    
    Score(String username,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score.PNG"));
        Image img2 = img1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel l1 = new JLabel(img3);
        l1.setBounds(0,200,300,250);
        add(l1);
        
        JLabel l2 = new JLabel("Thankyou "+username+" for playing Simple minds ");
        l2.setBounds(45,30,700,30);
        l2.setFont(new Font("RALEWAY",Font.PLAIN,26));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is "+score);
        l3.setBounds(350,200,360,60);
        l3.setFont(new Font("Jokerman",Font.PLAIN,36));
        l3.setForeground(new Color(199,21,133));
        add(l3);
        
        pa = new JButton("Play Again");
        pa.setBackground(Color.blue);
        pa.setForeground(Color.white);
        pa.setBounds(350,300,120,30);
        pa.addActionListener(this);
        add(pa);
        
        JButton b2 = new JButton("Exit");
        b2.setBounds(500,300,120,30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource() == pa){
           this.setVisible(false);
         new SimpleMinds().setVisible(true);
       }else{
           System.exit(0);
           
       }
    }
    
    public static void main(String[] args) {
        new Score("",0).setVisible(true);
       
    }

    
}
