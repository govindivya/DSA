package govindProject;

import java.util.Scanner;

public class BubbleShort {   
	
public static void sort(int []Arr,int size) {   // bubble short program
	  int i, j;
	  for(i=0;i<size;i++)
	  {
		  for(j=size-1;j>=i+1 ;j--)
		  {
			  if(Arr[j]<Arr[j-1])
			  {
				  Arr[j]=Arr[j-1]+Arr[j];
				  Arr[j-1]=Arr[j]-Arr[j-1];
				  Arr[j]=Arr[j]-Arr[j-1];
			  }
			  
		  }
	  }
}

public static void main(String[] args){
	
		 Scanner obj1= new Scanner(System.in);
		 System.out.println("Enter the size of the array ");
		 int size=obj1.nextInt();
		int Arr[];
		Arr=new int[size];
		int i=0;
	    System.out.println("enter aaray elements");
	    for(i=0;i<size;i++)
	         Arr[i]= obj1.nextInt();
	    sort(Arr,size);
	  
	    System.out.println("the sorted array is ");
	  	  for( i=0;i<size;i++)
	  	    System.out.print(Arr[i]+" ");
	     
      }

	  
		
	  
	}
