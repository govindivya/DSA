package govindProject;

import java.math.*;

public class Random {
	
	public static BigInteger rd=new BigInteger("568");
	
	public static void randomNumber(int num1 ,int num2)
	{
		if(num1>num2)
			return ;
		   
		String s1=Integer.toString(num1);
		String s2=Integer.toString(num2);
		
		int len1=s1.length();
		int len2=s2.length();
		int len3=len2-len1;
		
		
		
		BigInteger big=rd.multiply(rd.multiply(rd));
		
		String rda=rd.multiply(rd.multiply(rd)).toString();   // changing value of rd to generate diffrent random numbers each time
		rda=rda.substring(3,6);
		rd=BigInteger.valueOf(Long.valueOf(rda));
		
			
	}

	public static void main(String args[])
	{
		
	}
}
