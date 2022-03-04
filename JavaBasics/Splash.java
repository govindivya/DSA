package govindProject;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Splash implements Runnable{
	JFrame f;
	Splash()
	{
		f=new JFrame("National Institute of Technology Patna");
		f.setLayout(new FlowLayout());
		JLabel l=new JLabel();
		f.add(l);
		f.setVisible(true);
		try
		{
			
            	BufferedImage img=ImageIO.read(new File("C:\\Users\\hp\\eclipse-workspace\\NIT_Patna\\src\\govind\\t.jpg"));
    		    Image dimg=img.getScaledInstance(1200,650,Image.SCALE_DEFAULT);
    		    l.setIcon(new ImageIcon(dimg));
    		    
		}
		catch(Exception e)
		{
		  JOptionPane.showMessageDialog(null, "Error Occured");
		}
	 
		for (int x = 1, i = 2; i <= 600; i += 4, ++x) {
            f.setLocation(800 - (i + x) , 500 - 5*i / 6);
            f.setSize(i +  4* x, i + x/2 );
            try {
                Thread.sleep(5L);
            }
            catch (Exception ex) {
            	
            }
        }
		Thread t1=new Thread(this);
		t1.start();
	}
	
	 
	public void run() {
	    try
	    { 
			
			Thread.sleep(2000);
			f.setVisible(false);
			Login f1=new Login();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String args[])
	{
		Splash s=new Splash();
	}
}
