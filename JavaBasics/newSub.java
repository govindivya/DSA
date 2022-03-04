package govindProject;

import java.util.ArrayList;
import java.util.Scanner;

public class newSub {
	
	 
	public static   int subMatrix(int mat[][],int rowSize,int Subsize,int key) {
		int Count=0;
		  
		for (int i = 0; i < rowSize-Subsize+1; i++)
       {
			   int arr[][]=new int[Subsize][Subsize];
            
			   
           for (int j = 0; j < mat[0].length-Subsize+1; j++)
           {
                
               
               
               
               for (int p = i,s=0; p < Subsize+i ; p++,s++) 
                   for (int q = j,t=0; q < Subsize+j ; q++,t++) {
                   	  
                   	arr[s][t]=mat[p][q];
                   	 
                   }
                   if(check_Worthy(arr,key)==true)
                	   Count+=1;
               }
           }
		return Count;
   
      }


	

public static int getAll(int arr[][],int key) {
	int count=0;	
	for(int i=1;i<=arr.length;i++) {
			 count+=subMatrix(arr,arr.length,i,key);
		 }
	return count;
	 }	
	

public static boolean check_Worthy(int arr[][],int k) {
	int sum=0;
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=0;j<arr.length;j++) 
		{
			sum+=arr[i][j];
		}
	}
	if(sum/(arr.length*arr.length)>=k)
		return true;
	else 
		return false;
}
	
	
public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		    int T=sc.nextInt();
		    
		    for(int i=0;i<T;i++) 
		    {
		    	int N=sc.nextInt();
		        int M=sc.nextInt();
		        int K=sc.nextInt();
		    	int array[][]=new int[N][M];
		    	for(int j=0;j<N;j++)
		    	{
		    		for(int k=0;k<M;k++) 
		    		{
		    			array[j][k]=sc.nextInt();
		    			
		    		}
		    		
		       }
		       System.out.println(getAll(array,K));
		    	 
	    	}
		
 
		
	   }

}
