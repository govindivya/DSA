package govindProject;
import java.math.BigInteger;
import java.util.*;

public class Combination {
	
	 public static BigInteger Fact(int n)
	 {
			 if(n==1||n==0)
				 return new BigInteger("1");
			 BigInteger fact=new BigInteger("1");
			 for(int i=2;i<=n;i++)
				 fact=fact.multiply(new BigInteger(String.valueOf(i)));
			 return fact;
	  }
	 public static BigInteger Fact(int n,int m)
	 {
			 if(m==1||m==1)
				 return new BigInteger("1");
			 BigInteger fact=new BigInteger("1");
			 for(int i=n;i<=m;i++)
				 fact=fact.multiply(new BigInteger(String.valueOf(i)));
			 return fact;
	  }
	 
		 
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println();
	   
	   int T=sc.nextInt();
       int array[][]=new int[T][2];
       for(int i=0;i<T;i++)
       {
    	   array[i][0]=sc.nextInt();
    	   array[i][1]=sc.nextInt();
       
       }
       for(int i=0;i<T;i++)
       {

           int n=array[i][0];
           int k=array[i][1];
           
           
       }

	   }
}
