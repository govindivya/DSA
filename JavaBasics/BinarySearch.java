 package govindProject;

import java.util.Scanner;
                              // Binary Search Operation 
public class BinarySearch {
  public  static void  search(int  object [],int len,int num)  
	{
		int i=0;
     	int j=len-1;
	    int mid;
	while(i<=j)
	    {   mid=(i+j)/2;
	           if (num==object[mid])
	              {   
		           System.out.println("search successful ");
		             return;
	  }
	  else if(num>object[mid])
		  i=mid+1;
	  else if(num<object[mid])
		  j=mid-1;
	    }
      
	     System.out.println("the number does not exist in the array");
	
	}

	public static void main(String []args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=obj1.nextInt();
		int arr[];
		arr=new int[size];
		System.out.println("enter the elements of the array");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj1.nextInt();
			if(i==size-1)
				break;
		}
		int i=0;
		 int j;
		 for(i=0;i<size;i++)
		  {
			  for(j=size-1;j>=i+1 ;j--)
			  {
				  if(arr[j]<arr[j-1])
				  {
					  arr[j]=arr[j-1]+arr[j];
					  arr[j-1]=arr[j]-arr[j-1];
					  arr[j]=arr[j]-arr[j-1];
				  }
				  
			  }
			 
		  }
			  System.out.println("enter the search entery ");
				 int ent=obj1.nextInt();
		  search(arr,arr.length,ent);
	
}
}