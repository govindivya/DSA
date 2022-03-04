package govindProject;

import java.util.Scanner;

public class ChefAndPairs {
 

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Test cases");
     int t=sc.nextInt();
     int N=sc.nextInt();
     int Q=sc.nextInt();
     int arr[][]=new int[N+1][N+1];
     
     for(int i=0;i<=N;i++)
    	 for(int j=0;j<=N;j++) {
    	   arr[i][j]=0;
    	   if(i==j)
    		   arr[i][j]=1;
    	 }
     for(int i=0;i<N-1;i++)
     {
    	 int r=sc.nextInt();
    	 int c=sc.nextInt();
    	 arr[r][c]=1;
    	 arr[c][r]=1;
     }
     for(int i=1;i<=N;i++)
     {
    	 for(int j=1;j<=N;j++)
    	 {
    		 System.out.print(arr[i][j]+" ");
    	 }
    	 System.out.println();
     }
     for(int i=0;i<Q;i++)
     {
    	 int K=sc.nextInt();
    	 int D=sc.nextInt();
    	 int Query[]=new int[K];
    	 for(int j=0;j<K;j++)
    	 {
    		Query[j]=sc.nextInt(); 
    	 }
    	 
     }
    	
 
	 
	}

}
