package govindProject;

import java.util.Scanner;

public class ElephantCoins {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int G[]=new int[T];
		int Arr[][][]=new int[T][][];
        for(int i=0;i<T;i++) 
        {
          G[i]=sc.nextInt();
          Arr[i]=new int[G[i]][3];
          for(int j=0;j<G[i];j++)
          {
        	  for(int k=0;k<3;k++)
        	  {
        		  Arr[i][j][k]=sc.nextInt();
        	  }
          }
   
        }
      
        for(int i=0;i<T;i++) 
        {
         int Num=G[i];
          for(int j=0;j<G[i];j++)
          { 
        	  int face=Arr[i][j][0];
        	  int N=Arr[i][j][1];
        	  int Q=Arr[i][j][2];
        	  int newArr[]=new int[N];
        	  for(int l=0;l<N;l++)
        	  {
        		 newArr[l]=face; 
        	  }
        	  for(int k=0;k<N;k++)
        	  {
        		  for(int l=0;l<=k;l++)
        		  {
        			 if(newArr[l]==1)
        				 newArr[l]=2;
        			 else
        				 newArr[l]=1;
        		  }
        	  }
        	  int count=0;
        	  for(int k=0;k<N;k++)
        	  {
        		 if(newArr[k]==Q)
        		   count++;
        	  }
        	  System.out.println(count);
          }
   
        }
      
        
	}

}
