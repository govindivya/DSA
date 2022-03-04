package govindProject;

import java.util.Scanner;

public class Salary {
	public static int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			
		}
	
		return max;
	}

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int N[]=new int[T];
		int W[][]=new int[T][];
		for(int i=0;i<T;i++)
		{
			N[i]=sc.nextInt();
			W[i]=new int[N[i]];
			for(int j=0;j<N[i];j++)
			{
				W[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<T;i++)
		{
			int n=N[i];
		    int max=max(W[i]);
			boolean equal[]=new boolean[W[i].length];
			boolean AllEqual=true;
			for(int j=0;j<equal.length;j++)
			{
				if(W[i][j]<max)
				{
				equal[j]=false;
				AllEqual=false;
				
				}
				else {
					equal[j]=true;
					
				}
			}
 
			int count=0;
			while(!AllEqual) {
				int j=0;
				while(j<equal.length)
				{
					if(equal[j]==false)
					{
						W[i][j]++;
					}
					j++;
				}
				count++;
				int oldMax=max;
				max=max(W[i]);
				AllEqual=true;
				for(int k=0;k<equal.length;k++)
				{
					 
					if(W[i][k]<max)
					{
					 
						AllEqual=false;
					}
					
				}
				 
			    if(oldMax!=max)
			    {
			    	for(int k=0;k<equal.length;k++)
			    		if(W[i][k]<max)
			    			equal[k]=false;
			    		else
			    			equal[k]=true;
			    }
			    System.out.println("The numbers are");
			    for(int k=0;k<equal.length;k++)
			    {
			    	System.out.println(W[i][k]+"  ");
			    }
				 
			}
			 
		 System.out.println(count);
			
		}
	}

}
