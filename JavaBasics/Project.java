package govindProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.File;


public class Project extends JFrame implements ActionListener,ComponentListener
{
	JLabel l1;
	ImageIcon icon1;
    Project() {
        super("National Institue of Technolgy Patna");
        this.setSize(1920, 1030);
       
        
        l1=new JLabel();
        l1.setSize(1920,1030);
        l1.addComponentListener(this);
       
        icon1=new ImageIcon("univ28.jpg");
        ImageIcon icon=new ImageIcon(icon1.getImage().getScaledInstance(1520,700,Image.SCALE_DEFAULT));
        l1.setIcon(icon);
        this.add(l1);
        
       
        JLabel l=new JLabel("NATIONAL INSTITUTE OF TECHNOLOGY PATNA");
        l.setFont(new Font("Monospaced",Font.BOLD,20));
        l1.add(l);
        l.setLocation(20,50);
        l.setVisible(true);
        
        
        
        
        final JMenuBar mb = new JMenuBar();
        final JMenu master = new JMenu("Master");
        final JMenuItem m1 = new JMenuItem("New Faculty");
        final JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        
        m1.setFont(new Font("monospaced", 1, 16));
     
        ImageIcon icon2=new ImageIcon("icon1.png");
        m1.setIcon(new ImageIcon(icon2.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
        
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(68, 2));
        m1.setBackground(Color.WHITE);
       
        
        m2.setFont(new Font("monospaced", 1, 16));
 
        ImageIcon icon3=new ImageIcon("st2.png");
        m2.setIcon(new ImageIcon(icon3.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
       
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(77, 2));
        m2.setBackground(Color.WHITE);
        m1.addActionListener(this);
        m2.addActionListener(this);
        
        
        final JMenu user = new JMenu("Details");
        final JMenuItem u1 = new JMenuItem("Student Details");
        final JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
        
        u1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon4=new ImageIcon("icon3.png");
        u1.setIcon(new ImageIcon(icon4.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
       
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(80, 2));
        u1.setBackground(Color.WHITE);
        
        
        u2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon5=new ImageIcon("st.jpg");
        u2.setIcon(new ImageIcon(icon5.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
        
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        u2.setBackground(Color.WHITE);
        
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        
        final JMenu attendance = new JMenu("Attendance");
        final JMenuItem a1 = new JMenuItem("Student Attendance");
        final JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLUE);
        
        
        a1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon6=new ImageIcon("icon8.png");
        a1.setIcon(new ImageIcon(icon6.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
 
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(80, 2));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        
        a2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon7=new ImageIcon("icon8.png");
        a2.setIcon(new ImageIcon(icon7.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);
        
        
        a1.addActionListener(this);
        a2.addActionListener(this);
       
        
        final JMenu attendance_detail = new JMenu("Attendance Detail");
        final JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        final JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.RED);
       
        
        b1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon8=new ImageIcon("icon9.png");
        b1.setIcon(new ImageIcon(icon8.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(80, 2));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
       
        
        b2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon9=new ImageIcon("icon8.png");
        b2.setIcon(new ImageIcon(icon9.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
         
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        b2.setBackground(Color.WHITE);
        attendance_detail.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        final JMenu exam = new JMenu("Examination");
        final JMenuItem c1 = new JMenuItem("Examination Details");
        final JMenuItem c2 = new JMenuItem("Enter Marks");
        exam.setForeground(Color.BLUE);
       
        
        c1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon10=new ImageIcon("icon16.png");
        c1.setIcon(new ImageIcon(icon10.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH)));
 
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(80, 2));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
       
        
        
        c2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon11=new ImageIcon("icon17.png");
        c2.setIcon(new ImageIcon(icon11.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
         
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(66, 2));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        
        
        final JMenu report = new JMenu("Update Details");
        final JMenuItem r1 = new JMenuItem("Update Students");
        final JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
       
        
        r1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon12=new ImageIcon("icon2-1.png");
        r1.setIcon(new ImageIcon(icon12.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(82, 2));
        r1.setBackground(Color.WHITE);
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon13=new ImageIcon("teacher.jpg");
        r2.setIcon(new ImageIcon(icon13.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
       
         r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(82, 2));
        r2.setBackground(Color.WHITE);
        r2.addActionListener(this);
       
        
        final JMenu fee = new JMenu("Fee Details");
        final JMenuItem s1 = new JMenuItem("Fee Structure");
        final JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        
        s1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon14=new ImageIcon("fees1.jpg");
        s1.setIcon(new ImageIcon(icon14.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
         
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(82, 2));
        s1.setBackground(Color.WHITE);
        s1.addActionListener(this);
        
        
        s2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon15=new ImageIcon("icon7.png");
        s2.setIcon(new ImageIcon(icon15.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 

        s2.setMnemonic('H');
        s2.setAccelerator(KeyStroke.getKeyStroke(82, 2));
        s2.setBackground(Color.WHITE);
        s2.addActionListener(this);
        
        
        final JMenu utility = new JMenu("Utility");
        final JMenuItem ut1 = new JMenuItem("Notepad");
        final JMenuItem ut2 = new JMenuItem("Calculator");
        final JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.RED);
        
        
        ut1.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon16=new ImageIcon("icon9.png");
        ut1.setIcon(new ImageIcon(icon16.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(67, 2));
        ut1.setBackground(Color.WHITE);
        
        
        ut2.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon17=new ImageIcon("icon10.png");
        ut2.setIcon(new ImageIcon(icon17.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
        ut2.setMnemonic('J');
        ut2.setAccelerator(KeyStroke.getKeyStroke(88, 2));
        ut2.setBackground(Color.WHITE);
        
        
        ut3.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon18=new ImageIcon("icon11.png");
        ut3.setIcon(new ImageIcon(icon18.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
        

        
        ut3.setMnemonic('K');
        ut3.setAccelerator(KeyStroke.getKeyStroke(87, 2));
        ut3.setBackground(Color.WHITE);
        
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        
        final JMenu about = new JMenu("About");
        final JMenuItem abt = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        
        
        abt.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon19=new ImageIcon("teacher1.jpg");
        abt.setIcon(new ImageIcon(icon19.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
 
        abt.setMnemonic('L');
        abt.setAccelerator(KeyStroke.getKeyStroke(67, 2));
        abt.setBackground(Color.WHITE);
        about.add(abt);
        abt.addActionListener(this);
        
        
        final JMenu exit = new JMenu("Exit");
        final JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        ex.setFont(new Font("monospaced", 1, 16));
        ImageIcon icon20=new ImageIcon("icon4.png");
        ex.setIcon(new ImageIcon(icon20.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH))); 
       
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(90, 2));
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
        fee.add(s2);
        
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
       
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);
        
        
        this.setJMenuBar(mb);
        this.setFont(new Font("Senserif", 1, 16));
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(final ActionEvent ae)  {
        final String msg = ae.getActionCommand();
        if (msg.equals("New Student Admission")) {
            new AddStudent().f.setVisible(true);
        }
        else if (msg.equals("New Faculty")) {
            new AddTeacher().f.setVisible(true);
        }
        else if (msg.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        }
        else if (msg.equals("Teacher Details")) {
            new TeacherDetails().setVisible(true);
        }
        else if (msg.equals("Update Students")) {
            new UpdateStudent().f.setVisible(true);
        }
        else if (msg.equals("Update Teachers")) {
            new UpdateTeacher().f.setVisible(true);
        }
        else if (msg.equals("Fee Structure")) {
            new FeeStructure().setVisible(true);
        }
        else if (msg.equals("Student Fee Form")) {
            new StudentFeeForm().setVisible(true);
        }
        else if (msg.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch (Exception ex) {}
        }
        else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch (Exception ex2) {}
        }
        else if (msg.equals("Web Browser")) {
            try {
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }
            catch (Exception ex3) {}
        }
        else if (msg.equals("Exit")) {
            System.exit(0);
        }
        else if (msg.equals("About Us")) {
        	try {
            new AboutUs().setVisible(true);
        	}
        	catch(Exception e)
        	{
        		JOptionPane.showMessageDialog(null, e);
        	}
        }
        else if (msg.equals("Student Attendance")) {
            new StudentAttendance().setVisible(true);
        }
        else if (msg.equals("Teacher Attendance")) {
            new TeacherAttendance().setVisible(true);
        }
        else if (msg.equals("Student Attendance Detail")) {
            new StudentAttendanceDetail().setVisible(true);
        }
        else if (msg.equals("Teacher Attendance Detail")) {
            new TeacherAttendanceDetail().setVisible(true);
        }
        else if (msg.equals("Examination Details")) {
            new ExaminationDetails().setVisible(true);
        }
        else if (msg.equals("Enter Marks")) {
            new EnterMarks().setVisible(true);
        }
    }
    
    public static void main(final String[] args) {
        new Project().setVisible(true);
    }

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		l1.setIcon(new ImageIcon(icon1.getImage().getScaledInstance(l1.getWidth(),l1.getHeight(),Image.SCALE_SMOOTH)));
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}