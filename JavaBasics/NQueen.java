package govindProject;
import java.util.*;
 

public class NQueen {
	
	public static boolean is_Safe(int arr[][],int x,int y,int n)
	{
		for(int i=0;i<x;i++)
		{
			if(arr[i][y]==1)
				return false;
		}
		int row=x;
		int col=y;
		while(row>=0&&col>=0)
		{
			if(arr[row][col]==1)
				return false;
			row--;
			col--;

		}
		row=x;
		col=y;
		while(row>=0&&col<n)
		{
			if(arr[row][col]==1)
				return false;
			row--;
			col++;
		}
		return true;
	}
	
	public static boolean N_Queen(int array[][],int x,int n)
	{
		if(x>=n)
		{
			return true;
		}
		for(int col=0;col<n;col++)
		{
			if(is_Safe(array,x,col,n))
			{
				array[x][col]=1;
				if(N_Queen(array,x+1,n))
				{
		 
					return true;
				}
				array[x][col]=0;
			}
			 
			
		}
		return false;
		
		
	}
 
	public static void main(String[] args) {
		
		
		int array[][]=new int[20][20];
	    for(int i=0;i<20;i++)
	    	for(int j=0;j<20;j++)
	    		array[i][j]=0;
	    if(N_Queen(array,0,20))
	    {
	    	for(int i=0;i<20;i++) {
		    	for(int j=0;j<20;j++)
		    		System.out.print(array[i][j]+" ");
	    	System.out.println();
	    	}
	    }
	}

}
