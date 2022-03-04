package govindProject;

public class Rod_Cut {
   
	 public static int Cut(int p[],int n) {
		 if(n==0)
			 return 0;
		 int q=Integer.MIN_VALUE;
		 for(int i=1;i<=n;i++)
			 q=Math.max(q,p[i] +Cut(p,n-i));
		 return q;
	 }
	public static int fibb(int dp[],int n) {
		if(n==0||n==1)
		{
			dp[n]=n;
			return n;
		}
		else if(dp[n]!=-1)
			return dp[n];
		else {
			dp[n]=fibb(dp,n-1)+fibb(dp,n-2);
			return dp[n];
		}
	}
	public static void main(String[] args) {
//	 int p[]=new int[11];
//	 p[1]=1;
//	 p[2]=5;
//	 p[3]=8;
//	 p[4]=9;
//	 p[5]=10;
//	 p[6]=17;
//	 p[7]=17;
//	 p[8]=20;
//	 p[9]=24;
//	 p[10]=30;
//	 p[0]=0;
//	  System.out.println(Cut(p,8));
	  int dp[]=new int[10];
		for(int i=0;i<10;i++)
			dp[i]=-1;
		System.out.println(fibb(dp,3));
	
		
	}
	
	
		

}
