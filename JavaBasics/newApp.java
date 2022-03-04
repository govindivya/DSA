package govindProject;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

   public class newApp implements ChangeListener{

	private JFrame frame;
	JLabel l1;
	JSlider slider;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newApp window = new newApp();
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
	public newApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 384, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		 slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setBounds(10, 11, 49, 239);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setForeground(Color.BLUE);
		slider.addChangeListener( this);
		panel.add(slider);
		
		 l1 = new JLabel(" The temprature is 50  \u00B0C");
		l1.setBounds(91, 87, 283, 31);
		panel.add(l1);
		
		 
		
		 
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		l1.setText("The temprature is "+ slider.getValue()+"°C" );
		
	}
}
