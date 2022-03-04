package govindProject;

public class Longest_Palindrome {
	
	
	public static String Reverse(String str)
	{
		int li=str.length()-1;
		char []c= new char[str.length()];
	 
		for(int i=0;i<=li;i++)
		{
			c[i]=str.charAt(li-i);
        }
		return String.copyValueOf(c);
		
	}
	public static String Recu_LPS(String str)
	{
		String str1="";
		int l=str.length();
		for(int i=2;i<=l;i++)
		{
			 for(int j=0;j+i<=l;j++)
			 {
				 if(str.substring(j,j+i).equals(Reverse(str.substring(j,j+i))))
				 {
					if(str.substring(j,j+i).length()>str1.length())
						str1=str.substring(j,j+i);
				 }


			 }
		}
		return str1;
		
	}
	 
	public static int DP_LPS(String str)            // suppose lenth is 7 then if char at 0 and 6 are same then
	{                                             // LPS(0,6)=LPS(1,5)+2;
		                                          // else LPS(0,6)=max(LPS(0,5),LPS(1,6))
       int l=str.length();
       int dp[][]=new int[l][l];
       for(int i=0;i<l;i++)
    	   for(int j=0;j<l;j++)
    	   {   
    		   if(i==j)
    			   dp[i][j]=1;
    		   else 
    			   dp[i][j]=0;
    	   }
  
        for(int k=1;k<l;k++)
        {
        	for(int i=0,j=k;j<l;i++,j++)
        		if(str.charAt(j)==str.charAt(i))
        		{
        			dp[i][j]=dp[i+1][j-1]+2;
        			
        		}
        		else
        			dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
        }
        for(int i=0;i<l;i++)
        {
        	for(int j=0;j<l;j++)
     	       System.out.print(dp[i][j]+" "); 
        	System.out.println();
     		    
     	}
  
	 return dp[0][l-1];
	}
	

	public static void main(String[] args) {
	 System.out.println(DP_LPS("BABCBAB"));
	 System.out.println(("BABCBAB"));

	}

}
