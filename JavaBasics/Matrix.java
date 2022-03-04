package govindProject;

import java.util.Scanner;

public class Matrix {                          // this program is for multiplication and addition of  matrices;
    private int row;
    private int col;
    private  double arr2[][]; 
    public static Scanner sc = new Scanner(System.in);	  
 public Matrix(int r, int c ) {            //  parametrized constructor
	this.row=r;
	this.col=c;
	arr2=new double[r][c];
	
  }
 public Matrix() {                    // default constructor
	 row=0;
	 col=0;
	 arr2= new double[0][0];
 }
 
 public static void setMatrix(Matrix A,int r,int c) {     // set method;
 for(int i=0;i<r;i++) {
  for(int j=0;j<c;j++)
	  A.arr2[i][j]=sc.nextDouble();
  
}  
	  
 
}   
 


 public static void  Multi(Matrix mat1,Matrix mat2,Matrix mat3) {  // multiply matrices;
 int r1=mat1.row;
 int c1=mat1.col;
 int r2=mat2.row;
 int c2=mat2.col;
	 if (c1==r2) {
		 for(int i=0;i<r1;i++) {
		     for (int j=0;j<c2;j++) {
		    	 mat3.arr2[i][j]=0;
		    	for(int k=0;k<r2;k++)  
		    	   mat3.arr2[i][j]+=mat1.arr2[i][k]*mat2.arr2[k][j];
		     }
		     
		 }
	 display(mat3);
	 }
	 else
		 System.out.println("Multiplication is not possible due to dimension unmatching of matrices hj :");
	 
 }
 
 public static void Add(Matrix mat1,Matrix mat2,Matrix mat3) {    // addition method
	  
	 if (mat1.row==mat2.row&&mat1.col==mat2.col) {
		 for(int i=0;i<mat1.row;i++) 
			 for(int j=0;j<mat1.col;j++)
				 mat3.arr2[i][j]=mat1.arr2[i][j]+mat2.arr2[i][j];
	 display(mat3);
	 }
	 else
		 System.out.println("Addition not possible due to different dimension of matrices ");
	 
 }
 
 public static void display(Matrix A) {                   // display matrix 
	 System.out.println("the elements of matrix are : ");
		for(int i=0;i<A.row;i++)
		{
			for(int j=0;j<A.col;j++)
				System.out.print(A.arr2[i][j]+"   ");
		System.out.println("\n");	
      }
}

 public double [][] getMat(){
	return arr2;
	 
 }

 
 
public static void main(String args[]) {

		System.out.println("enter the number of row and coloumn  of first matrix :");
		int row1 = sc.nextInt();
		int col1=sc.nextInt();
		
		
		System.out.println("enter the number of row and column of second matrix :");
		int row2 = sc.nextInt();
		int col2=sc.nextInt();
		
		Matrix mat1=new Matrix(row1,col1);
		Matrix mat2=new Matrix(row2,col2);
		Matrix mat3=new Matrix(row1,col2);
		
		System.out.println("Enter the elements of first matrix :");
        mat1.setMatrix(mat1,row1, col1);
        System.out.println("Enter the elements of second matrix :");
        mat2.setMatrix(mat2,row2,col2);
        
        System.out.println("Enter Operation \n 1: for addition enter 1\n 2 : for multiplication enter 2");
        
        int response=sc.nextInt();
       
        if(response==1) 
         	Add(mat1, mat2,mat3);
        	 
       else if(response==2)
         	Multi(mat1, mat2,mat3);
      
       else
        	System.out.println("please enter valid operation type ");


	
		
	}

}
