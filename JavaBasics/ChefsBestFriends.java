package govindProject;

import java.util.Scanner;

public class ChefsBestFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int N[]=new int[T];
		int Total[][]=new int[T][];
		
		for(int i=0;i<T;i++)
		{
			N[i]=sc.nextInt();
			Total[i]=new int[N[i]];
			for(int j=0;j<N[i];j++)
				Total[i][j]=sc.nextInt();
			
		}
//    	if(Total[i][k-1]==0&&Total[i][k]==1)
//    	{
//    		Total[i][k-1]=1;
//    		Total[i][k]=0;
//    		k=0;
//    		count++;
//    	}
		for(int i=0;i<T;i++) 
		{
			int count=0;
			int num=N[i];
			for(int j=0;j<num;j++)
			{
				boolean found=false;
				for(int k=j+1;k<num;k++)
				{
			    	if(Total[i][k-1]==0&&Total[i][k]==1)
			    	{
			    		Total[i][k-1]=1;
			    		found=true;
			    		Total[i][k]=0;
			    	}
				}
				if(found)
				{
					count++;
				}
			}
		   
//		 
			
			System.out.println(count);
		}
	}

}
