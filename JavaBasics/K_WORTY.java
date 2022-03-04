package govindProject;
import java.util.*;;
public class K_WORTY {

	 
	public static void printAll(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		int t=sc.nextInt();
		while(t--!=0)
		{
			 
			int row=sc.nextInt();
		    int col=sc.nextInt();
		    int average=sc.nextInt();
			int array[][]=new int[row+1][col+1];
			for(int i=0;i<=row;i++)
			{
				for(int j=0;j<=col;j++)
				{
					if(i==0||j==0)
						array[i][j]=0;
					
					else
						array[i][j]=sc.nextInt();
				}
			}
			
			for(int i=1;i<=row;i++)
			{
			 
				for(int j=1;j<=col;j++)
				{
			 
				      array[i][j]+=array[i][j-1];
				}
			
			}
			for(int i=1;i<=col;i++)
			{
			 
				for(int j=1;j<=row;j++)
				{
				 array[j][i]+=array[j-1][i];
				}
			
			}
			 
			int kWorthy=0;
			for(int i=1;i<=row;i++)
			{
				 for(int j=i;j<=row;j++)
				 {
					 for(int k=i;k<=col;k++)
					 {
						if((array[j][k]-array[j-i][k]-array[j][k-i]+array[j-i][k-i])/(i*i)>=average)
						{
							kWorthy++;
						}
					 }
				 }
			}
			System.out.println(kWorthy);
			
		}
	}
	
}
