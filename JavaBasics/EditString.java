package govindProject;

public class EditString {
	
public static int countChanges(String str1,String str2){
	// find minimum changes to change  str1 to str2;
	// str1 has length m;
	// str2 has length of n;
	// three operation can be done to modify the string 
    // 1 >> insertion at any position then recur for m ,n-1;
    // 2>> deletion at any position then recur for m-1,n;
	// 3>> modify the char at any position then recur for m-1,n-1;
	// if last char matches we just take m-1,j-1 value to evaluate ;
	// if do not matches then take minimum  operation by three (delete ,insert , modify) 
	int m=str1.length();
	int n=str2.length();
	int dp[][]=new int[m+1][n+1]; 
	for(int i=0;i<=m;i++)
	{
		for(int j=0;j<=n;j++)
		{
			if(i==0)
				dp[i][j]=j;
			else if(j==0)
				dp[i][j]=i;
			else if(str1.charAt(i-1)==str2.charAt(j-1))   
				dp[i][j]=dp[i-1][j-1];
			else
				dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
		}
	}
	return dp[m][n];
	
}
public static void countChanges1(String str1,String str2)
{
 
     
    
}
public static void main(String[] args) {
     String str1="Rohan";
     String str2="Romya";
     System.out.println(countChanges(str1,str2));
//     System.out.println(countChanges1(str1,str2));
     


	}

}


