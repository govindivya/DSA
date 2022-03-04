package govindProject;

import java.util.Scanner;

public class InsertionSort {
	
public static void sort(int A[]) {
	int val ,  j;
	for(int i=1;i<A.length;i++) {
	val=A[i];
	 j=i-1;
	while(j>=0&&A[j]>val) {
		A[j+1]=A[j];
		j--;
	}
	A[j+1]=val;
	}
	
}
	

	public static void main(String[] args) {
      Scanner Sc=new Scanner(System.in);
      System.out.println("Enter the lenght");
      int l=Sc.nextInt();
      int Arr[]=new int[l];
      System.out.println("Enter the elements of the array ");
      for(int i=0;i<l;i++)
    	  Arr[i]=Sc.nextInt();
       sort(Arr);
      for(int i=0;i<l;i++)
    	  System.out.print(Arr[i]+" ");
    	  
      
	}

}
 