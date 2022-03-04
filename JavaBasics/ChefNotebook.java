package govindProject;

import java.util.Scanner;

public class ChefNotebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int xyz[][]=new int[T][4];
		int pc[][][]=new int[T][][];
		for(int i=0;i<T;i++)
		{
			for(int j=0;j<4;j++)
				xyz[i][j]=sc.nextInt();
	        pc[i]=new int[xyz[i][3]][2];
			for(int j=0;j<xyz[i][3];j++)
				for(int k=0;k<2;k++)
					pc[i][j][k]=sc.nextInt();
		}
		for(int i=0;i<T;i++)
		{
			 int X=xyz[i][0];
			 int Y=xyz[i][1];
			 int K=xyz[i][2];
			 int N=xyz[i][3];
			 boolean lucky=false;
			 int diff=X-Y;
			 for(int j=0;j<N;j++)
			 {
				  
				if(pc[i][j][0]>=diff && pc[i][j][1]<=K)
				{
					lucky=true;
					break;
				}
				 
			 }
			 if(lucky==true)
			 {
				System.out.println("LuckyChef");
			 }
			 else {
				 System.out.println("UnluckyChef");	 
			 }
			 
		}
		

	}

}
