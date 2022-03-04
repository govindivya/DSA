package govindProject;

import java.util.ArrayList;
import java.util.Scanner;

public class RatMaze {
	public static int result=0;
	public static int visited[][];
	
	public static boolean isSafe(int i,int j,int n)
	{
	   return (i>=0 && i<n && j>=0 && j<n);	
	}

   public static void ratMaze(int arr[][],int n,int i,int j)
   {
	   if(arr[n-1][n-1]==1)
		   return ;
	   if(i==n-1&&j==n-1)
	   {
		   result++;
		   return;
	   }
	   if(!isSafe(i,j,n))
	   {
		  return; 
	   }
	   visited[i][j]=1;
	   if(isSafe(i-1,j,n) && arr[i-1][j]==0 && visited[i-1][j]==0)
	   {
		  ratMaze(arr,n,i-1,j); 
	   }
	   if(isSafe(i+1,j,n) && arr[i+1][j]==0 && visited[i+1][j]==0)
	   {
		  ratMaze(arr,n,i+1,j); 
	   }
	   if(isSafe(i,j-1,n) && arr[i][j-1]==0 && visited[i][j-1]==0)
	   {
		  ratMaze(arr,n,i,j-1); 
	   }
	   if(isSafe(i,j+1,n) && arr[i][j+1]==0 && visited[i][j+1]==0)
	   {
		  ratMaze(arr,n,i,j+1); 
	   }
	   visited[i][j]=0;
   }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    ArrayList<Integer> ls=new ArrayList<Integer>();
		System.out.println("Enter the size of grid");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		visited=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
				visited[i][j]=0;
				System.out.print(" ");
				
			}
			System.out.println();
		}
		ratMaze(arr,size,0,0);
		System.out.println(result);
	 
	    
	 

	}

}
