package govindProject;

import java.util.Scanner;

public class PrimeNumbers1 {

	public  static void main(String args[]) {   // print prime number b/w 0 and given number where input is from keyboard;
	
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the limit upto prime numbers has to be printed:");
		int num1= obj1.nextInt();
		int i;
		int j;
		for(i=1;i<=num1;i++)
		{ int k=0;
			for(j=2;j<=i/2;j++)
			{
					if(i%j==0)
						k=1;
				
			}
		   if(k==0)
			   System.out.print(i+" ");
		}
		
		
		
	}
	
}
