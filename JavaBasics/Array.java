package govindProject;

import java.util.Scanner;

public class Array {   // To print FIBBONACCI series using recursion

	public static void main(String args[]){
		
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the number of term in fibbonacci series");
		int num1=obj1.nextInt();
		int Arr[];
		Arr=new int[num1];
		Arr[0]=0;
		Arr[1]=1;
		for(int i=2;i<num1;i++)
		{
			Arr[i]=Arr[i-1]+Arr[i-2];
		}
		 
		for(int i =0;i<num1;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		
		
			}
}
