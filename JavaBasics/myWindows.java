 package govindProject;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class myWindows implements ActionListener {

	private JFrame frmCalculator;
	private final JTextField textField = new JTextField();
	private JButton add;
	private JButton subtract;
	private JButton multi;
	private JButton divide;
	private JButton log;
	private JButton square;
	private JButton cube;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton zero;
	private JButton One;
	private JButton Two;
	private JButton inverse;
	private JButton three;
	private JButton four;
	private JButton five;
	Double first=null;                           // TO STORE PREVIOUS INFORMATION;
	Double second=null;                          // TO STORE CURRENT INFORMATION;
	Double result;
	String operator=null;
	 String answer;
	 private JButton percent;

	/**
	 * Launch the application.
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myWindows window = new myWindows();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		myWindows obj=new myWindows();
	}

	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public myWindows() throws Exception {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frmCalculator =new JFrame();
		frmCalculator.getContentPane().setBackground(new Color(0, 0, 255));
		frmCalculator.setBackground(new Color(219, 112, 147));
		frmCalculator.setTitle("MyCalculator");
		frmCalculator.setSize(250,400);
		frmCalculator.getContentPane().setLayout(null);
		textField.setBackground(new Color(0, 255, 255));
		textField.setBounds(0, 0, 234, 51);
		frmCalculator.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(5);
		
		add = new JButton("+");
		add.setBackground(Color.WHITE);
		add.setActionCommand("+");
		add.addActionListener(this);
		add.setBounds(117, 62, 48, 31);
		frmCalculator.getContentPane().add(add);
		
		subtract = new JButton("-");
		subtract.setBackground(Color.WHITE);
		subtract.setFont(new Font("Tahoma", Font.BOLD, 11));
		subtract.setActionCommand("-");
		subtract.addActionListener(this);
		subtract.setBounds(169, 62, 48, 31);
		frmCalculator.getContentPane().add(subtract);
		
		multi = new JButton("*");
		multi.setBackground(Color.WHITE);
		multi.setActionCommand("*");
		multi.addActionListener(this);
		multi.setBounds(10, 104, 48, 31);
		frmCalculator.getContentPane().add(multi);
		
		divide = new JButton("/");
		divide.setBackground(Color.WHITE);
		divide.setActionCommand("/");
		divide.addActionListener(this);
		divide.setBounds(63, 104, 48, 31);
		frmCalculator.getContentPane().add(divide);
		
		log = new JButton("loge");
		log.setFont(new Font("Tahoma", Font.PLAIN, 8));
		log.setBackground(Color.WHITE);
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Log");
				
			}
			
		});
		log.setBounds(117, 104, 48, 31);
		frmCalculator.getContentPane().add(log);
		
		square = new JButton("x^2");
		square.setBackground(Color.WHITE);
		square.setFont(new Font("Tahoma", Font.PLAIN, 8));
		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double d1=Double.parseDouble(textField.getText());
					double d2=d1*d1;
					textField.setText(String.valueOf(d2));
				}
				catch(Exception E) {
					textField.setText(E.getMessage());
				}
			}
		});
		square.setBounds(169, 104, 48, 31);
		frmCalculator.getContentPane().add(square);
		
		cube = new JButton("x^3");
		cube.setFont(new Font("Tahoma", Font.PLAIN, 8));
		cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String s=textField.getText();
				double num=Double.parseDouble(s);
				double num1=num*num*num;
				textField.setText(String.valueOf(num1));
			}
				catch(Exception E) {
					textField.setText(E.getMessage());
				}}
		});
		cube.setBounds(169, 146, 48, 31);
		frmCalculator.getContentPane().add(cube);
		
		sin = new JButton("sin");
		sin.setFont(new Font("Tahoma", Font.PLAIN, 8));
		sin.setBackground(UIManager.getColor("FormattedTextField.inactiveBackground"));
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		
					textField.setText("Sin");
					
				}
				catch(Exception E) {
					textField.setText(E.getMessage());
					
				}
			}
		});
		sin.setBounds(10, 146, 48, 31);
		frmCalculator.getContentPane().add(sin);
		
		cos = new JButton("cos");
		cos.setFont(new Font("Tahoma", Font.PLAIN, 8));
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					textField.setText("Cos");
					
			}
				catch(Exception E) {
					textField.setText(E.getMessage());
					
				}
			}
		});
		cos.setBounds(63, 146, 48, 31);
		frmCalculator.getContentPane().add(cos);
		
		tan = new JButton("tan");
		tan.setFont(new Font("Tahoma", Font.PLAIN, 8));
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	
					textField.setText("Tan");
			}
				catch(Exception E) {
					textField.setText(E.getMessage());
					
				}
			}
		});
		tan.setBounds(117, 146, 48, 31);
		frmCalculator.getContentPane().add(tan);
		
		zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.BOLD, 14));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+'0';
				textField.setText(number);
			}
		});
		zero.setBounds(10, 188, 48, 31);
		frmCalculator.getContentPane().add(zero);
		
		One = new JButton("1");
		One.setFont(new Font("Tahoma", Font.BOLD, 14));
		One.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   String number=textField.getText()+'1';
				textField.setText(number);
		} });
		One.setBounds(63, 190, 48, 31);
		frmCalculator.getContentPane().add(One);
		
		Two = new JButton(" 2");
		Two.setFont(new Font("Tahoma", Font.BOLD, 14));
		Two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'2';
					textField.setText(number);
			}
		});
		Two.setBounds(117, 190, 48, 31);
		frmCalculator.getContentPane().add(Two);
		
		inverse = new JButton("1/x");
		inverse.setFont(new Font("Tahoma", Font.PLAIN, 8));
		inverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double d1=Double.parseDouble(textField.getText());
				   double d2=1/d1;
				   textField.setText(String.valueOf(d2));
				}
				catch(Exception E) {
					textField.setText(E.getMessage());
				}
			}
		});
		inverse.setBounds(169, 188, 48, 31);
		frmCalculator.getContentPane().add(inverse);
		
		three = new JButton("3");
		three.setFont(new Font("Tahoma", Font.BOLD, 14));
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'3';
					textField.setText(number);
			}
		});
		three.setBounds(10, 234, 48, 31);
		frmCalculator.getContentPane().add(three);
		
		four = new JButton("4");
		four.setFont(new Font("Tahoma", Font.BOLD, 14));
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'4';
					textField.setText(number);
			}
		});
		four.setBounds(63, 232, 48, 31);
		frmCalculator.getContentPane().add(four);
		
		five = new JButton("5");
		five.setFont(new Font("Tahoma", Font.BOLD, 14));
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'5';
					textField.setText(number);
			}
		});
		five.setBounds(117, 234, 48, 31);
		frmCalculator.getContentPane().add(five);
		
		JButton pow = new JButton("x^y");
		pow.setFont(new Font("Tahoma", Font.PLAIN, 8));
		pow.setActionCommand("^");
		pow.addActionListener(this);
		pow.setBounds(169, 234, 48, 31);
		frmCalculator.getContentPane().add(pow);
		
		JButton six = new JButton("6");
		six.setFont(new Font("Tahoma", Font.BOLD, 14));
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'6';
					textField.setText(number);
			}
		});
		six.setBounds(10, 277, 48, 31);
		frmCalculator.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Tahoma", Font.BOLD, 14));
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'7';
					textField.setText(number);
			}
		});
		seven.setBounds(63, 277, 48, 31);
		frmCalculator.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'8';
					textField.setText(number);
			}
		});
		eight.setFont(new Font("Tahoma", Font.BOLD, 14));
		eight.setBounds(117, 277, 48, 31);
		frmCalculator.getContentPane().add(eight);
		
		JButton percentage = new JButton("delete\r\n");
		percentage.setFont(new Font("Tahoma", Font.PLAIN, 8));
		percentage.setActionCommand("%");
		percentage.addActionListener(this);
		percentage.setBounds(169, 276, 48, 31);
		frmCalculator.getContentPane().add(percentage);
		
		JButton nine = new JButton(" 9");
		nine.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'9';
					textField.setText(number);
			}
		});
		nine.setBounds(10, 319, 48, 30);
		frmCalculator.getContentPane().add(nine);
		
		JButton deci = new JButton(".");
		deci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String number=textField.getText()+'.';
					textField.setText(number);
			}
		});
		deci.setFont(new Font("Tahoma", Font.BOLD, 16));
		deci.setBounds(63, 319, 48, 30);
		frmCalculator.getContentPane().add(deci);
		
		JButton clear = new JButton(" C");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				first=null;
				operator=null;
				second=null;
			}
		});
		clear.setBackground(new Color(218, 165, 32));
		clear.setFont(new Font("Tahoma", Font.BOLD, 15));
		clear.setBounds(117, 319, 48, 30);
		frmCalculator.getContentPane().add(clear);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String str1=textField.getText();
					String str2=str1.substring(0,1);
					String str3=str1;
					if(str1.length()>3)
						str3=str1.substring(3,str1.length());
					if(operator!=null) {
					if(str2.equals("C")||str2.equals("S")||str2.equals("T")||str2.equals("L")) {
						if(str2.equals("S")) {
							if(operator.equals("+")) {
								first=first+Math.sin(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("-")) {
								first=first-Math.sin(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("*")) {
								first=first*Math.sin(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("/")) {
								first=first/Math.sin(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("^")) {
								first=Math.pow(first ,Math.sin(Double.valueOf(str3)));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("%")) {
								first=first*Math.sin(Double.valueOf(str3))/100;
								operator=null;
								textField.setText(String.valueOf(first));
						  }
						}
						if(str2.equals("C")) {
							if(operator.equals("+")) {
								first=first+Math.cos(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("-")) {
								first=first-Math.cos(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("*")) {
								first=first*Math.cos(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("/")) {
								first=first/Math.cos(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("^")) {
								first=Math.pow(first ,Math.cos(Double.valueOf(str3)));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("%")) {
								first=first*Math.cos(Double.valueOf(str3))/100;
								operator=null;
								textField.setText(String.valueOf(first));
								
							}
						}
						if(str2.equals("T")) {
							if(operator.equals("+")) {
								first=first+Math.tan(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("-")) {
								first=first-Math.tan(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("*")) {
								first=first*Math.tan(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("/")) {
								first=first/Math.tan(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("^")) {
								first=Math.pow(first ,Math.tan(Double.valueOf(str3)));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("%")) {
								first=first*Math.tan(Double.valueOf(str3))/100;
								operator=null;
								textField.setText(String.valueOf(first));
						}
				      }
						if(str2.equals("L")) {
							if(operator.equals("+")) {
								first=first+Math.log(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("-")) {
								first=first-Math.log(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("*")) {
								first=first*Math.log(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("/")) {
								first=first/Math.log(Double.valueOf(str3));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
							if(operator.equals("^")) {
								first=Math.pow(first ,Math.log(Double.valueOf(str3)));
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}

							if(operator.equals("%")) {
								first=first*Math.log(Double.valueOf(str3))/100;
								operator=null;
								textField.setText(String.valueOf(first));
								
								
							}
						}
					}
					else {
						if(operator.equals("+")) {
							first=first+Double.valueOf(str1);
							operator=null;
							textField.setText(String.valueOf(first));
						}
						if(operator.equals("-")) {
							first=first-Double.valueOf(str1);
							operator=null;
							textField.setText(String.valueOf(first));
						}
						if(operator.equals("*")) {
							first=first*Double.valueOf(str1);
							operator=null;
							textField.setText(String.valueOf(first));
						}
						if(operator.equals("/")) {
							first=first/Double.valueOf(str1);
							operator=null;
							textField.setText(String.valueOf(first));
						}
						if(operator.equals("^")) {
							first=Math.pow(first,Double.valueOf(str1));
							operator=null;
							textField.setText(String.valueOf(first));
						}
						if(operator.equals("%")) {
							first=first*Double.valueOf(str1)/100;
							operator=null;
							textField.setText(String.valueOf(first));
						}
						
					 }
					}
					else {
						if(str2.equals("S")) {
							textField.setText(String.valueOf(Math.sin(Double.valueOf(str3))));
					
						}
						if(str2.equals("C")) {
							textField.setText(String.valueOf(Math.cos(Double.valueOf(str3))));
					
						}
						if(str2.equals("T")) {
							textField.setText(String.valueOf(Math.tan(Double.valueOf(str3))));
					
						}
						if(str2.equals("L")) {
							textField.setText(String.valueOf(Math.log(Double.valueOf(str3))));
					
						}
					}
		          }
				catch(Exception P) {
					
				}
				 
		}});
		equal.setBackground(new Color(240, 240, 240));
		equal.setFont(new Font("Tahoma", Font.BOLD, 11));
		equal.setBounds(169, 317, 48, 31);
		frmCalculator.getContentPane().add(equal);
		
		JButton btnNewButton = new JButton("Root");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d=Double.parseDouble(textField.getText());
				double d2=Math.pow(d,0.5);
				textField.setText(String.valueOf(d2));
						
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton.setBounds(63, 62, 48, 31);
		frmCalculator.getContentPane().add(btnNewButton);
		
		percent = new JButton(" %");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				operator="%";
				textField.setText("");
			}
		});
		percent.setBounds(10, 62, 48, 31);
		frmCalculator.getContentPane().add(percent);
		
	}
	public void actionPerformed(ActionEvent e) {
	  String current=e.getActionCommand();
			try {
			     String str1=textField.getText();
			     String str2=str1.substring(0,1);
			     String str3=str1;
			     if(str1.length()>3)
			    	 str3=str1.substring(3,str1.length());
			     if(first==null&&operator==null) {
			    	 if(str2.equals("S")||str2.equals("C")|| str2.equals("T")|| str2.equals("L")) {
			    		 if(str2.equals("S")) {
			    			 first=Math.sin(Double.valueOf(str3));
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 else if(str2.equals("C")) {
			    			 first=Math.cos(Double.valueOf(str3));
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 else  if(str2.equals("T")) {
			    			 first=Math.tan(Double.valueOf(str3));
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(str2.equals("L")) {
			    			 first=Math.log(Double.valueOf(str3));
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 
			    	 }
			    	 else {
			    		 first=Double.valueOf(str1);
			    		 operator=current;
			    		 textField.setText("");
			    	 }
			     }
			     else if(first!=null&&operator==null) {
			    	 operator=current;
			    	 textField.setText("");
			     }
         		
			     else {
			    	 if(str2.equals("S")||str2.equals("C")||str2.equals("T")||str2.equals("L")) {
			    		 if(str2.equals("S")) {
			    			 if(operator.equals("+")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=first+d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("-")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=first-d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("*")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=first*d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("/")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=first/d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("^")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=Math.pow(first, d);
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("%")) {
			    				 double d=Math.sin(Double.valueOf(str3));
			    				 first=first*d/100;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    		 }
			    		 else if(str2.equals("C")) {
			    			 if(operator.equals("+")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=first+d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("-")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=first-d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("*")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=first*d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("/")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=first/d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("^")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=Math.pow(first, d);
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("%")) {
			    				 double d=Math.cos(Double.valueOf(str3));
			    				 first=first*d/100;
			    				 operator="%";
			    				 textField.setText("");
			    			 }
			    		 }


			    		 else if(str2.equals("T")) {
			    			 if(operator.equals("+")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=first+d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("-")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=first-d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("*")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=first*d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("/")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=first/d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("6")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=Math.pow(first, d);
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("5")) {
			    				 double d=Math.tan(Double.valueOf(str3));
			    				 first=first*d/100;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    		 }

			    		 else if(str2.equals("L")) {
			    			 if(operator.equals("+")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=first+d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("-")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=first-d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("*")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=first*d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("/")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=first/d;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("^")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=Math.pow(first, d);
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    			 if(operator.equals("%")) {
			    				 double d=Math.log(Double.valueOf(str3));
			    				 first=first*d/100;
			    				 operator=current;
			    				 textField.setText("");
			    			 }
			    		 }
			    	 }
			    	 else {
			    		 if(operator.equals("+")) {
			    			 first=first+Double.valueOf(str1);
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(operator.equals("-")) {
			    			 first=first-Double.valueOf(str1);
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(operator.equals("*")) {
			    			 first=first*Double.valueOf(str1);
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(operator.equals("/")) {
			    			 first=first/Double.valueOf(str1);
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(operator.equals("^")) {
			    			 first=Math.pow(first,Double.valueOf(str1));
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		 if(operator.equals("%")) {
			    			 first=first*Double.valueOf(str1)/100;
			    			 operator=current;
			    			 textField.setText("");
			    		 }
			    		
			    	 }
			     }
				
				
			}
			catch(Exception P) {
				textField.setText("Invalid Operation");
				
			}
		
	  }
	

}	


