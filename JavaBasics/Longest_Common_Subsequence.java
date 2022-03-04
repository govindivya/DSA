package govindProject;

public class Longest_Common_Subsequence {
 
	public static int LCS( char[] X ,char[] Y,int m,int n) {     //memoized solution 
		
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
					dp[i][j]=0;
				else if(X[i-1]==Y[j-1])
					dp[i][j]=dp[i-1][j-1]+1;
				else 
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				
			}
		}
		printSub(dp,X);
		return dp[m][n];
	}
	
	
	public static void printSub(int arr[][],char X[])                //To print subsequence
	{
		int row=arr.length;
		int col=arr[0].length;
		int num=0;
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<col;j++)
			{
				 if(arr[i][j]>num)
				 {
					System.out.print(X[arr[i][j]]);
					num=arr[i][j];
				 }
					
			}
		}

		System.out.println();
	}
	
	public static int LCS_Rec(char[] X ,char[] Y,int m,int n)          //Recursive solution 
	{
		if(m==0||n==0)
			return 0;
		if(X[m-1]==Y[n-1])
			return 1+LCS_Rec(X,Y,m-1,n-1);
		
		return 
				Math.max(LCS_Rec(X,Y,m-1,n),LCS_Rec(X,Y,m,n-1));
	}
	

	

	public static void main(String[] args) {
		char[]X= {'C','B','C','S','E','F','G','H','K','L'};
		char[]Y= {'C','N','C','S','E','F','G','H'};
	    System.out.println(LCS(X,Y,X.length,Y.length));
	   
	     
	}

}
