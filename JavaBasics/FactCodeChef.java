package govindProject;

import java.util.Scanner;

public class FactCodeChef {

	public static int fact(int k)
	{
		 int sum=0;
		 int i=1;
		 int m=k;
		 while(m>1)
		 {
			m=(int) Math.floor(k/Math.pow(5,i)); 
			i++;
			sum+=m;
		 }
		 return sum;
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 int array[]=new int[T];
	 for(int i=0;i<T;i++)
	 {
		 array[i]=sc.nextInt();
	 }
	 for(int i=0;i<T;i++)
	 {
		System.out.println(fact(array[i])); 
	 }
    
	}

}
