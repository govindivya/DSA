package govindProject;

import java.util.Scanner;

public class firstRepeatingElement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);	 
		 System.out.println("Eneter n");
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 int idx[]=new int[1000000];
		 int min=Integer.MAX_VALUE;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<1000000;i++)
		{
			idx[i]=-1;
		}
		for(int i=0;i<n;i++)
		{
			if(idx[arr[i]]!=-1)
			{
				min=Math.min(min,idx[arr[i]]);
			}
			else{
				idx[arr[i]]=i;
			}
		}
		if(min==Integer.MAX_VALUE) {
			System.out.println("-1");
		}
		else {
			System.out.println(min+1);
			
		}

	}

}
