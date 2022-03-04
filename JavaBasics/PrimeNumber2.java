package govindProject;


public class PrimeNumber2 {
 public static void main(String args[]) {    // print prime number b/w 0 and given number through command line ;
 	
	 int num1=Integer.parseInt(args[0]);
	 System.out.println("The prime numbers between 0 and  given number are : ");
	 for(int i =1;i<=num1;i++)
	 { 
		 int k=0;
		  for(int j=2;j<=i/2;j++)
		 
		  {
			 if(i%j==0)
				 k=1;
		 }
		 if(k==0)
			 System.out.print(i+ " ");
	 }
	 
	 
 }
 
}
