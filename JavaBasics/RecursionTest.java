package govindProject;

import java.util.ArrayList;
import java.util.Collections;

public class RecursionTest {
    
	public static void printPascal() {
		
	}
	public static int  makeOne(int n) {
		 
	    if(n==1)
			return 0;
	    int a1,a2,a3=Integer.MAX_VALUE;
	    a1=a2=a3;
	    a1=1+makeOne(n-1);
	    if(n%2==0)
	    	a2=1+makeOne(n/2);
	    if(n%3==0)
	    	a3=1+makeOne(n/3);
	    return Math.min(Math.min(a2, a1), a3);
	   
		 
		
	}
	public static void KnapSack(int value[],int weight[],int pos) {
	 
		
        
	}
	
	
	public static void main(String[] args) {
		int n=makeOne(10);
		System.out.println("least no of operation is  "+n);
	    int value[] ={15,20,50,34,76,34,50};
	    int weight[]={1,2,2,3,3,8,3};
	    KnapSack(value,weight,0);

	}

}
