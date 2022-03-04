package govindProject;

import java.util.Random;
import java.util.Scanner;
                                                 // generating OTP using integer array;
public class OTP {
	static Scanner sc= new Scanner(System.in);
	Random gen=new Random();
public  void otp(int n,int m) {
	int arr[]= new int [n];
	int j=0;
	while(j<m)
	{   System.out.println("the "+ (j+1) +" otp is : ");
	 	
		for(int i=0;i<n;i++) {
		   arr[i]=gen.nextInt(10);
		     System.out.print(arr[i]);
	   } 
		System.out.println("\n");
	    j++;
	}
	
}
	
	
     public static void main(String args[]) {
    	 System.out.println("enter the number of digits in the otp : ");
    	 int digit=sc.nextInt();
    	 System.out.println("enter the number of OTPs required : ");
    	 int num=sc.nextInt();
    	 while(num==0||num<0) {
    		 System.out.println("Enetr valid numbers  of OTPs required other than zero and non-negative :");
    		  num=sc.nextInt();
    	 }
    	   
    	 OTP obj1 = new OTP();
    	 obj1.otp(digit,num);
     }
}
