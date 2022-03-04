package govindProject;

public class Knapsack {
	
	public static int knapsack(int weight[],int values[],int dp[],int w,int n)
	{
		if(w==0||n==0) 
		{
			dp[n]=0;
			return 0;
		}
		else if(dp[n]!=-1)
		{
			return dp[n];
		}
		else
		{
			 if(weight[n-1]<=w)
			 {
				 dp[n]= Math.max(values[n-1]+ knapsack(weight,values,dp,w-weight[n-1],n-1),
						 knapsack(weight,values,dp,w,n-1));
			 }
			 else
			 {
				 dp[n]= knapsack(weight,values,dp,w,n-1);
			 }
		}
		return dp[n];
	}

	public static void main(String[] args) {
		 int weight[]= {10,20,30};
		 int price[]= {60,100,120};
		 int dp[]= {-1,-1,-1,-1};
		 System.out.println(knapsack(weight,price,dp,50,3));

	}

}
