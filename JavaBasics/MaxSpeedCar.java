package govindProject;

import java.util.Scanner;

public class MaxSpeedCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int N[]=new int[T];
		int Speed[][]=new int[T][];
		for(int i=0;i<T;i++)
		{
			N[i]=sc.nextInt();
			Speed[i]=new int[N[i]];
			for(int j=0;j<N[i];j++)
				Speed[i][j]=sc.nextInt();
		}
		for(int i=0;i<T;i++)
		{
			int num=N[i];
			int count=0;
		    for(int j=0;j<num;j++)
		    {
		    	if(j==0)
		    	{
		    		count++;
		    	}
		    	else {
		    	  if(Speed[i][j]<Speed[i][j-1])	
		    		count++;
		    	}
		    }
		    System.out.println(count);
		}
	}

}
