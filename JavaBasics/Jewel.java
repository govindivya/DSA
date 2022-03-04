package govindProject;

import java.util.Scanner;

public class Jewel {
 
	public static boolean isContain(String str,char c)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
				System.out.println("true");
				return true;
			}
			
		}
		System.out.println("false");
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		String Arr[][]=new String[T][2];
		for(int i=0;i<T;i++)
		{
			Arr[i][0]=sc.next();
			Arr[i][1]=sc.next();
			
		}
		for(int i=0;i<T;i++)
		{
			String J=Arr[i][0];
			String S=Arr[i][1];
			int count=0;
			String str="";
			for(int j=0;j<J.length();j++)
			{
				 	 
				for(int k=0;k<S.length();k++)
				{
					if(J.charAt(j)==S.charAt(k))
					{
					 if(!str.contains(""+S.charAt(k)+""))
					 {
						count++;
						str+=S.charAt(k);
					 }
					}
				}
			}
			System.out.println(count);
		}
      
  	 
	}

}
