package govindProject;

import java.util.Scanner;

public class AminuB {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int s=A-B;
		String str=Integer.toString(s);
		char c=str.charAt(0);
		if(c=='9')
		{
			c='8';
		}
		else {
			c=(char)((int)c+1);
		}
	   str=c+str.substring(1);
	   System.out.println(str);
				
	}

}
