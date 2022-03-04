package govindProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class myClock implements Runnable {
	public static int num=0;
    public static Thread t1;
	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myClock window = new myClock();
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
	public myClock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Yu Gothic UI Light", Font.BOLD | Font.ITALIC, 45));
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 0, 434, 137);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(" MyClock");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 44));
		lblNewLabel.setBounds(194, 140, 240, 82);
		panel.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("off\\on");
		rdbtnNewRadioButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			    myClock.t1 = new Thread(new myClock());
				myClock.t1.start();
			}
		});
		rdbtnNewRadioButton.setBackground(Color.GREEN);
		rdbtnNewRadioButton.setBounds(0, 140, 65, 23);
		panel.add(rdbtnNewRadioButton);
		
		 
	
	}

	
	public void run() {
	   while(num%2==0) {
		   try {
		   String s=String.valueOf(LocalTime.now());
		   textField.setText(s);
		    t1.wait(1000);
		   }
		   catch(Exception e) {
			   textField.setText(e.getMessage());
		   }
	   }	
		
	}
}
