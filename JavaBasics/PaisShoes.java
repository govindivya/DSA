package govindProject;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class PaisShoes {
	
	
	public static boolean check_Constraints(double k1[],double k2[],double k3[],double vel[]) {
		for(int i=0;i<k1.length;i++) 
		{
			if((k1[i]<=0||k1[i]>=2)||(k2[i]<=0||k2[i]>=2||(k3[i]<=0||k3[i]>1))||(vel[i]<=9||vel[i]>=11))
			{
				return false;
			}
			if((Double.toString(k1[i]).length()!=3)||
			  (Double.toString(k2[i]).length()!=3)||
			  (Double.toString(k3[i]).length()!=3)||
			  (Double.toString(vel[i]).length()!=4&&(Double.toString(vel[i]).length()!=5))) 
			{
				return false;
			}
			
		}
		
		
		return true;
	}
	
 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_DOWN);
		double rec_time=9.58;
		double k1[],k2[],k3[],vel[];
		int T;
		System.out.println("Enter t avlues");
		T=sc.nextInt();
	    if(T>0&&T<=100000) 
		  {
			
			
			k1=new double[T];
			k2=new double[T];
			k3=new double[T];
			vel=new double[T];
			
			for(int i=0;i<T;i++) 
			{
				k1[i]=sc.nextDouble();
				k2[i]=sc.nextDouble();
				k3[i]=sc.nextDouble();
				vel[i]=sc.nextDouble();
			}
			if(check_Constraints(k1,k2,k3,vel)==true) 
		    {
		    	for(int i=0;i<T;i++)
		    	{
		    		double newVel=(k1[i]*k2[i]*k3[i]*vel[i]);
		    		double newTime=Double.parseDouble(df.format(100/newVel));
		    		if(newTime<rec_time)
		    			System.out.println("Yes");
		    		else
		    			System.out.println("No");
		    			
		    	}
		    	
		    }
			else
				System.out.println("Invalid Inputs");
			
			
		
		  }
	    
	    
		
	}	
	  
	
}
