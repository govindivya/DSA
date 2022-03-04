package govindProject;

import java.util.Scanner;

public class CleanUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int M[][]=new int[T][2];
		int W[][]=new int[T][];
		for(int i=0;i<T;i++)
		{
	
			M[i][0]=sc.nextInt();
			M[i][1]=sc.nextInt();
			int Done=M[i][1];
			W[i]=new int[Done];
			for(int j=0;j<Done;j++)
			{
				W[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<T;i++)
		{
		 int target=M[i][0];
		 int done=M[i][1];
		 int doneIndex[]=new int[done];
		 for(int j=0;j<done;j++)
		 {
			 doneIndex[j]=W[i][j]-1;
		 } 
		 int chef[]=new int[(target-done)/2+1];
		 int ass[]=new int[(target-done)/2+1];
		 for(int s=0;s<chef.length;s++)
		 {
			 chef[s]=0;
			 ass[s]=0;
		 }
		 int chefCount=0;
		 int assCount=0;
		 for(int j=0;j<target;j++)
		 {
			 boolean found=false;
			 for(int k=0;k<done;k++)
			 {
				if(j==doneIndex[k])
					found=true;
			 }
			if(found==false)
			{
				if(chefCount>assCount)
			    {
				    ass[assCount]=j+1;
			    	assCount++;
				}
						
			    else
			    {
			    	chef[chefCount]=j+1;
					chefCount++;
				}
			}
		    
				
		 }
		 int t=0;
		 while(t<chef.length)
		 {
			 if(chef[t]!=0)
			 { 
				 System.out.print(chef[t]+" ");
			 }
			 t++;
		 }
		 t=0;
		 System.out.println();
		 while(t<ass.length)
		 {
			 if(ass[t]!=0)
			 { 
				 System.out.print(ass[t]+" ");
			 }
			 t++;
		 }
		 System.out.println();
		 
		 
		}

	}

}
