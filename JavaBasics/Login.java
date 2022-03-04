package govindProject;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.JFrame;

public class Login extends JFrame implements ActionListener
{
    JFrame f;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1;
    JButton b2;
    
    Login() {
        super("Login");
        this.setBackground(Color.white);
        this.setLayout(null);
        (this.l1 = new JLabel("Username")).setBounds(40, 20, 100, 30);
         this.add(this.l1);
        
        (this.l2 = new JLabel("Password")).setBounds(40, 70, 100, 30);
        this.add(this.l2);
        (this.t1 = new JTextField()).setBounds(150, 20, 150, 30);
        this.add(this.t1);
        (this.t2 = new JPasswordField()).setBounds(150, 70, 150, 30);
        this.add(this.t2);
             

        final JLabel l3 = new JLabel(); 
        l3.setBounds(350, 20, 150, 150);
       try
       {
      	   BufferedImage img=ImageIO.read(new File("C:\\Users\\hp\\eclipse-workspace\\NIT_Patna\\icon2.jpg"));
  	       Image dimg=img.getScaledInstance(l3.getWidth(), l3.getHeight(), Image.SCALE_DEFAULT);	
  	       l3.setIcon(new ImageIcon(dimg));
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null,"Error");
         
       }
       this.add(l3);
       
        (this.b1 = new JButton("Login")).setBounds(40, 140, 120, 30);
        this.b1.setFont(new Font("serif", 1, 15));
        this.b1.addActionListener(this);
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.add(this.b1);
       
        (this.b2 = new JButton("Cancel")).setBounds(180, 140, 120, 30);
        this.b2.setFont(new Font("serif", 1, 15));
        this.b2.setBackground(Color.BLACK);
        this.b2.setForeground(Color.WHITE);
        this.add(this.b2);
        
        this.b2.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
        this.setVisible(true);
        this.setSize(600, 300);
        this.setLocation(500, 300);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        if(ae.getSource()==b1)
        {
        	try {
                final conn c1 = new conn();
                final String u = this.t1.getText();
                final String v = this.t2.getText();
                final String q = "select * from login where username='" + u + "' and password='" + v + "'";
                final ResultSet rs = c1.s.executeQuery(q);
                if (rs.next()) {
                    new Project().setVisible(true);
                    this.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    this.setVisible(false);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==b2)
        {
        	System.exit(0);
        }
        	
    }
    
    public static void main(final String[] arg) {
        final Login l = new Login();
    }
}



  