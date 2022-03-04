package govindProject;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class EnterMarks extends JFrame implements ActionListener
{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JButton b1;
    
    EnterMarks() {
        this.setSize(500, 550);
        this.setLocation(400, 200);
        this.setLayout(null);
        (this.l1 = new JLabel("Enter marks of Student")).setFont(new Font("serif", 1, 30));
        this.l1.setBounds(50, 0, 500, 80);
        this.add(this.l1);
        (this.l2 = new JLabel("Enter Roll Number")).setBounds(50, 70, 200, 40);
        this.add(this.l2);
        (this.t1 = new JTextField()).setBounds(180, 80, 200, 20);
        this.add(this.t1);
        (this.l3 = new JLabel("Enter Subject")).setBounds(50, 150, 200, 40);
        this.add(this.l3);
        (this.l4 = new JLabel("Enter Marks")).setBounds(250, 150, 200, 40);
        this.add(this.l4);
        (this.t2 = new JTextField()).setBounds(50, 200, 200, 20);
        this.add(this.t2);
        (this.t3 = new JTextField()).setBounds(250, 200, 200, 20);
        this.add(this.t3);
        (this.t4 = new JTextField()).setBounds(50, 230, 200, 20);
        this.add(this.t4);
        (this.t5 = new JTextField()).setBounds(250, 230, 200, 20);
        this.add(this.t5);
        (this.t6 = new JTextField()).setBounds(50, 260, 200, 20);
        this.add(this.t6);
        (this.t7 = new JTextField()).setBounds(250, 260, 200, 20);
        this.add(this.t7);
        (this.t8 = new JTextField()).setBounds(50, 290, 200, 20);
        this.add(this.t8);
        (this.t9 = new JTextField()).setBounds(250, 290, 200, 20);
        this.add(this.t9);
        (this.t10 = new JTextField()).setBounds(50, 320, 200, 20);
        this.add(this.t10);
        (this.t11 = new JTextField()).setBounds(250, 320, 200, 20);
        this.add(this.t11);
        (this.b1 = new JButton("Submit")).setBounds(50, 360, 100, 30);
        this.b1.setBackground(Color.BLACK);
        this.b1.setForeground(Color.WHITE);
        this.add(this.b1);
        this.b1.addActionListener(this);
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae) {
        try {
            if (ae.getSource() == this.b1) {
                final conn c1 = new conn();
                final String s1 = "insert into subject values('" + this.t1.getText() + "','" + this.t2.getText() + "','" + this.t4.getText() + "','" + this.t6.getText() + "','" + this.t8.getText() + "','" + this.t10.getText() + "')";
                final String s2 = "insert into marks values('" + this.t1.getText() + "','" + this.t3.getText() + "','" + this.t5.getText() + "','" + this.t7.getText() + "','" + this.t9.getText() + "','" + this.t11.getText() + "')";
                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                JOptionPane.showMessageDialog(null, "Marks Inserted Successfully");
                this.setVisible(false);
            }
        }
        catch (Exception ex) {}
    }
    
    public static void main(final String[] args) {
        new EnterMarks().setVisible(true);
    }
}
