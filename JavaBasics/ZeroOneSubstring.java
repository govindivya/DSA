package govindProject;

import java.util.Scanner;

public class ZeroOneSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter T");
		int T=sc.nextInt();
		int N[]=new int[T];
		String Value[]=new String[T];
		for(int i=0;i<T;i++)
		{
		     N[i]=sc.nextInt();
			 Value[i]=sc.next();
		}
		for(int i=0;i<T;i++)
		{
			int count=0;
			for(int j=0;j<Value[i].length();j++)
			{
				if(Value[i].charAt(j)=='0')
					continue;
				for(int k=j;k<Value[i].length();k++)
				{
					if(Value[i].charAt(j)=='1'&&Value[i].charAt(k)=='1')
					{
//						System.out.println(Value[i].substring(j,k+1));
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
