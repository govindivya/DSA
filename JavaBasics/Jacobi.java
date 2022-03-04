package govindProject;

import java.util.*;

public class Jacobi {
	
    static Scanner sc=new Scanner(System.in);
    public static int N=0;

    static int determinantOfMatrix(int mat[][], int n)
    {
    	double Cofactor[][]=new double[N][N];
        int num1, num2, det = 1, index,
                        total = 1; // Initialize result
 
        // temporary array for storing row
        int[] temp = new int[n + 1];
 
        // loop for traversing the diagonal elements
        for (int i = 0; i < n; i++)
        {
            index = i; // initialize the index
 
            // finding the index which has non zero value
            while (mat[index][i] == 0 && index < n)
            {
                index++;
            }
            if (index == n) // if there is non zero element
            {
                
                continue;
            }
            if (index != i)
            {
                // loop for swaping the diagonal element row
                // and index row
                for (int j = 0; j < n; j++)
                {
                    swap(mat, index, j, i, j);
                }
                // determinant sign changes when we shift
                // rows go through determinant properties
                det = (int)(det * Math.pow(-1, index - i));
            }
 
            // storing the values of diagonal row elements
            for (int j = 0; j < n; j++)
            {
                temp[j] = mat[i][j];
            }
 
            // traversing every row below the diagonal
            // element
            for (int j = i + 1; j < n; j++)
            {
                num1 = temp[i]; // value of diagonal element
                num2 = mat[j]
                          [i]; // value of next row element
 
                // traversing every column of row
                // and multiplying to every row
                for (int k = 0; k < n; k++)
                {
                    // multiplying to make the diagonal
                    // element and next row element equal
                    mat[j][k] = (num1 * mat[j][k])
                                - (num2 * temp[k]);
                }
                total = total * num1; // Det(kA)=kDet(A);
            }
        }
 
        // multiplying the diagonal elements to get
        // determinant
        for (int i = 0; i < n; i++)
        {
            det = det * mat[i][i];
        }
        return (det / total); // Det(kA)/k=Det(A);
    }
 
    static int[][] swap(int[][] arr, int i1, int j1, int i2,
                        int j2)
    {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
        return arr;
    }
    
    public static void findInverse(double A[][]) {
    	int n=A.length;
    }
    
    
    public static void swapRows() {
    	
    }
    
    public static  int compare(double a,double b) {
    	if(a>b)
    		return 1;
    	if(b>a)
    		return -1;
    	else return 0;
    }
    


    public static double [][] sumMatrix(double A[][],double B[][]){
    	
    	int n=A.length;
    	double C[][]=new double[n][n];
    	
    	   for(int i=0;i<n;i++) {
   	    	for(int j=0;j<n;j++) {
   	    		C[i][j]=A[i][j]+B[i][j];
   	    	}
    	 }
    	   return C;
    }
   	    	
    
    public static void solveEquation(double A[][],double B[]) {
    	 
    	int n=A.length;
    	double D[][]=new double[n][n];
	    double U[][]=new double[n][n];
	    double L[][]=new double[n][n];
	    
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<n;j++) {
	    		L[i][j]=0;
	    		D[i][j]=0;
	    		U[i][j]=0;
	    		if(i==j) 
	    			D[i][j]=A[i][j];
	    		if(i>j) 
	    			L[i][j]=A[i][j];
	    		
	    		if(j>i) 
	    			U[i][j]=A[i][j];
	    		 	
	     }
	     
	   double LU[][]=sumMatrix(L,U);
	  
	    
	   	
    }    
 }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		System.out.println("Enter number of variables in the system :");
		int n=sc.nextInt();
		N=n;
		double A[][]=new double[n][n];
		double B[]=new double[n];
	    
		System.out.println("Enter the elements of matrix A of system Ax=b ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the elements of "+(i+1)+ " row");
			for(int j=0;j<n;j++) {
				A[i][j]=sc.nextDouble();
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of matrix b of system Ax=b ");
        for(int i=0;i<n;i++) {
        	B[i]=sc.nextDouble();
        }
  
        
	}

}
