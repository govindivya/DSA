package govindProject;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 long t=sc.nextLong();
		 while(t-->0) {
			 long n=sc.nextLong();
			 long total=0;
			 if(n==0)
				 total=0;
			 if(n==1)
				 total=20;
			 if(n==2)
				 total=36;
			 if(n==3)
				 total=51;
			 if(n==4)
				 total=60;
			 if(n==5)
				 total=76;
			 if(n==6)
				 total=88;
			 if(n==7)
				 total=95;
			 if(n==8)
				 total=100;
			 
			    
			
			 
			 
		 }

	}

}
//
//if(N==0)
//	return 0;
//if(N==1)
//	return 20;
//if(N==2)
//	return 36;
//if(N==3)
//	return 51;
//if(N==4)
//	return 60;
//if(N==5)
//	return 76;
//if(N==6)
//	return 88;
//if(N==7)
//	return 95;
//if(N==8)
//	return 100;
//long factor=(int)Math.ceil(N/4.0);
//
//long newN=N-(factor-2)*4;
//return (factor-2)*44+calculatePill(newN);
//