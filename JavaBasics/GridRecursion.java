package govindProject;

public class GridRecursion {
	
	static int Total(int dp[][],int m,int n)
	{
		  
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-2;j>=0;j-- )
			{
			  dp[i][j]=dp[i][j+1]+dp[i+1][j];
			}
			System.out.println();
		}
		return dp[0][0];
	}


	static int TotalPath_Recur(int n ,int m)
	{
		if(n==0||m==0)
			return 1;

		else 
			return TotalPath_Recur(n-1,m)+TotalPath_Recur(n,m-1);
	}

	
	
	public static void main(String[] args) {
     int DP[][]=new int[10][10];
	
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(j==9||i==9)
			{
				DP[i][j]=1;
			}
		 
			else
				DP[i][j]=0;
		}
	}
	 
	 System.out.println(Total(DP,10,10));
	 System.out.println(TotalPath_Recur(10,10));
	
	}

}
