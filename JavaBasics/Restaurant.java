package govindProject;
import javax.swing.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Color;

public class Restaurant implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	 
  

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
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
	public Restaurant() {
		initialize();
		frame.setTitle("Restaurant");
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 11, 233, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Waiter Name");
		lblNewLabel.setBounds(10, 11, 142, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 55, 233, 31);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter meal charge");
		lblNewLabel_1.setBounds(10, 55, 112, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		Button button = new Button("Submit");
		button.setBounds(10, 232, 385, 21);
		button.setBackground(Color.green);
		frame.getContentPane().add(button);
		button.addActionListener(this);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String waiterName=this.textField.getText();
		double mealCharge=Double.parseDouble(this.textField_1.getText());
		double tax=mealCharge/100*6.75;
		double tip=(tax+mealCharge)/100*15;
		double bill=mealCharge+tax+tip;
	    JOptionPane.showConfirmDialog(this.frame, "The waiter is " + waiterName+ "\n The tax is "+ tax+ "\n The tip is "+ tip+ "\n The total bill is"+ bill);
	    System.exit(0);
	}
}
