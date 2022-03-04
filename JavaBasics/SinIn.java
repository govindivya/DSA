package govindProject;
import javax.swing.*;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class SinIn implements ActionListener {

	private JFrame frame;
	private JTextField pin;
	private JPasswordField password;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinIn window = new SinIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SinIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 50, 800, 600);
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Syndicate Bank");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(274, 0, 251, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PIN NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(42, 120, 104, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(42, 184, 104, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		pin = new JTextField();
		pin.setBounds(231, 120, 403, 31);
		frame.getContentPane().add(pin);
		pin.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("WELCOME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblNewLabel_3.setBounds(338, 53, 104, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton SININ = new JButton("SIN-IN");
		SININ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SININ.setBackground(Color.blue);
		SININ.setForeground(Color.white);
		 
		SININ.setBounds(231, 270, 104, 47);
		SININ.addActionListener(this);
		frame.getContentPane().add(SININ);
	
		
		JButton CLEAR = new JButton("CLEAR");
		CLEAR.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CLEAR.setBackground(Color.blue);
		CLEAR.setForeground(Color.WHITE);
		CLEAR.setBounds(524, 270, 110, 47);
		CLEAR.addActionListener(this);
		frame.getContentPane().add(CLEAR);
		
		JButton SIN_UP = new JButton("SIN-UP");
		 
		SIN_UP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		SIN_UP.setBounds(377, 270, 110, 47);
		SIN_UP.setBackground(Color.blue);
		SIN_UP.setForeground(Color.white);
		SIN_UP.addActionListener(this);
		frame.getContentPane().add(SIN_UP);
		
		password = new JPasswordField();
		password.setBounds(231, 178, 403, 31);
		frame.getContentPane().add(password);
		
		
	}

	public void actionPerformed(ActionEvent e) {
          
		
	}
}
