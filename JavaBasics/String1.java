package govindProject;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class String1 implements ActionListener 

{

	
	public void actionPerformed(ActionEvent arg0) {

		
	}

	public static void main(String[] args) throws Exception {
	 JFrame f=new JFrame("Calculator");
	 f.setSize(200, 200);
	 JPanel p= new JPanel();
	 JPanel p1=new JPanel();
	 f.add(p);
	 f.add(p1);
	 p.setBackground(Color.pink);
	 p.setSize(200,80);
	 
	 p1.setBackground(Color.blue);
	 p1.setSize(200,80);
	 f.setVisible(true);
	 Button b=new Button("Cliclk");
	 p.add(b);
	 b.setBackground(Color.cyan);
	 
	}


	
}

