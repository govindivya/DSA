package govindProject;

import java.math.BigInteger;
import java.util.Scanner;

public class Worthy {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println();
    int t=sc.nextInt();
    while(t--!=0) {
       int n,m,k;
       n=sc.nextInt();
       m=sc.nextInt();
       k=sc.nextInt();
       double mat[][]=new double[n][m];
       for(int i=0;i<n;i++) 
       {
    	   for(int j=0;j<m;j++) 
    	   {
    		   mat[i][j]=sc.nextDouble();
    		   
    	   }
       }
       for(int i=0;i<m;i++)
       {
    	  double prev=0; 
    	  for(int j=0;j<m;j++)
    	  {
    		  mat[i][j]+=prev;
    		  prev=mat[i][j];
    	  }
       }
       for(int i=0;i<m;i++) 
       {
    	   double prev=0;
    	   for(int j=0;j<n;j++)
    	   {
    		
    		   mat[j][i]+=prev;
    		   prev=mat[j][i];
    	  
    	   }
       }
      printMat(mat);
       int count=0;
       for(int len=1;len<=n;len++)
       {
    	
    	  for(int i=len-1;i<n;i++) 
    	  {
    		   for(int j=len-1;j<m;j++) 
    		   { 
                   if(i>0&&j>0) 
                   {
                	   if((mat[i][j]+mat[i-len+1][j-len+1]-mat[i-len+1][j]-mat[i][j-len+1])/(len*len)>=k)
                		   count++;
                   } 
                   else {
                	   if(i>0)
                		   if((mat[i][j]-mat[i-1][j])>=k)
                			   count++;
                	   if(j>0)
                		   if((mat[i][j]-mat[i][j-1])>=k)
                			   count++;
                	   if(i==0&&j==0)
                		   if(mat[i][j]>=k)
                			   count++;
                   }
    		   }
    	   }   
       }
     
       System.out.println(count);
    }
 
  }
	 
	public static void printMat(double[][] mat) {
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
			
		}
	}
}
