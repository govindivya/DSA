package govindProject;

import java.util.Random;
import java.util.Scanner;

public class Randoms {
	public static  Scanner sc = new Scanner(System.in);
    Boolean arr1[];
    double arr2[];
    float arr3[];
    int arr4[];
    Random gen = new Random();

public Randoms(int m ,int n,int min,int max) {
	 arr1=new Boolean[m];
	 arr2=new double[m];
	 arr3=new float[m];
	 arr4=new int[m];
      switch(n) {
	case 1 :
	{  
	    for(int i=0;i<m;i++) {
	    	arr1[i]=gen.nextBoolean();
	    	System.out.print(arr1[i]+ " ");
	    }
	    break;
	    
	}
	case 2 : 
	{
		for(int i=0;i<m;i++) {
			arr2[i]=gen.nextDouble()*(max-min)+min;
			System.out.print(arr2[i]+" ");
		}
		break;
	}
	case 3 :
	{
	for(int i=0;i<m;i++) {
		 arr3[i]=gen.nextFloat()*(max-min)+min;	
	     System.out.print(arr3[i]+"  ");  
	}
	  break;
	}
	case 4 :
	{
		for(int i=0;i<m;i++) {
			arr4[i]=gen.nextInt(max-min)+min;
		   System.out.print(arr4[i]+ " ");
		} 
		break;
	}
	
	default :
	   System.out.println("Enter valid type ");
	   break;
     }
 }


public static void main(String args[]) {
	while(true) {
	System.out.println("\nEnter the type of sequence  you want to generate :");
	System.out.println(" 1 : for boolean\n 2 : for double \n 3 : for float \n 4 : for integers :");
	int type = sc.nextInt();
	System.out.println("Enter the  number of terms  :");
	int terms =sc.nextInt();
	int min=0;
	int max=0;
	if(type!=1) {
	System.out.println("enter the minimum and maximum values respectively : ");
	min = sc.nextInt();
    max=sc.nextInt();
	}
	Randoms obj1=new Randoms(terms,type,min,max);

	}
	  
	
}

}
