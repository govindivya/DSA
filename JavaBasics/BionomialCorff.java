package govindProject;

public class BionomialCorff {

	public static int find_n_C_k(int dp[][],int n,int k)
	{
		if(k>n)
			return 0;
		if(k==0||k==n) 
		{
			dp[n][k]=1;
			return 1;
		}
		else if(dp[n][k]!=-1)
		{
			return dp[n][k];
		}
		else {
			dp[n][k]=find_n_C_k(dp,n-1,k-1)+find_n_C_k(dp,n-1,k);
			return dp[n][k];
		}
		
		
	 
	}
	
	public static void main(String[] args) {
		int dp[][]=new int[10][5];
		for(int i=0;i<10;i++)
			for(int j=0;j<5;j++)
				dp[i][j]=-1;
		System.out.println(find_n_C_k(dp,9,4));
	}

}
