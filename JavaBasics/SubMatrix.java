package govindProject;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SubMatrix {
	public static int Count=0;
	 
	public static   void subMatrix(int mat[][],int rowSize,int Subsize,int key) {
		
		 ArrayList<int [][]>ls=new ArrayList<int [][]>();   //to store subMatrices
		for (int i = 0; i < rowSize-Subsize+1; i++)
        {
			   int arr[][]=new int[Subsize][Subsize];
            // column of first cell in current
            // sub-square of size k x k
			   
            for (int j = 0; j < mat[0].length-Subsize+1; j++)
            {
                 
                // Calculate and print sum of
                // current sub-square
             
                
                
                for (int p = i,s=0; p < Subsize+i ; p++,s++) {
                    for (int q = j,t=0; q < Subsize+j ; q++,t++) {
//                    	System.out.print(mat[p][q]+" "); 
                    	arr[s][t]=mat[p][q];
//                    	sum += mat[p][q];
                    }
//                    System.out.println();
                }
//                System.out.println("next");
//                System.out.println();
                  printMatrix(arr,key);
//                System.out.println();
                  ls.add(arr);;
                 
//                System.out.println();
//                System.out.print(sum+ " ");
            }
         
            // Line separator for sub-squares
            // starting with next row
//            System.out.println();
        }
      
//	  printMatrix(ls.getFirst());
	   
		
	}
 
 public static void getAll(int arr[][],int key) {
	 for(int i=1;i<=arr.length;i++) {
		 subMatrix(arr,arr.length,i,key);
	 }
 }
	

public static  void printMatrix(int arr[][],int k) {
    float sum=0;
    DecimalFormat df=new DecimalFormat("0.00");
   for(int i=0;i<arr.length;i++) {
	   for(int j=0;j<arr.length;j++) {
		   sum+=arr[i][j];
	   }
   }
    float average=Float.parseFloat(df.format(sum/(arr.length*arr.length)));
	if(average>=k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
    
	 
	System.out.println();
}
	
 
 public static void main(String args[]) {
//	  int arr[][]= {{1,2,3,4,5},
//			        {9,8,7,6,5}
//	               ,{12,3,4,5,7},
//	                {9,8,7,6,4}};
//   
//     getAll(arr,5); 
//     
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    
    for(int i=0;i<T;i++) {
    	int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
    	int array[][]=new int[N][M];
    	for(int j=0;j<N;j++) {
    		for(int k=0;k<M;k++) {
    			array[j][k]=sc.nextInt();
    			
    		}
    		
    	}
    	getAll(array,5);
    }
 }
  
}
