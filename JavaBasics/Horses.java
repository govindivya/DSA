package govindProject;

import java.util.Scanner;

public class Horses {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println();
	int T=sc.nextInt();
	int N[]=new int[T];
    int H[][]=new int[T][];
	for(int i=0;i<T;i++)
	{
		N[i]=sc.nextInt();
		H[i]=new int[N[i]];
		for(int j=0;j<N[i];j++)
		{
			H[i][j]=sc.nextInt();
		}
	}
    
	for(int i=0;i<T;i++)
	{
		int min=Integer.MAX_VALUE;
		for(int j=0;j<H[i].length;j++)
		{
			for(int k=j;k<H[i].length;k++)
			{
				if(Math.abs(H[i][j]-H[i][k])<min && j!=k)
				{
					min=Math.abs(H[i][j]-H[i][k]);
				}
			}
		}
		System.out.println(min);
	}
	
	
	}


}
