package govindProject;

import java.util.Scanner;




public class GaussSeidal {
 static Scanner sc=new Scanner(System.in);
	
public static void solveEquation(double A[][],double B[],double C[]) {
	   int order=C.length;
		double D[]=new double[C.length];

		 System.out.println("Enter elements of matrix of coefficient (A):");
		 for(int i=0;i<order;i++) {
			 System.out.println("Enter elements of "+(i+1)+"  row :");
			 for(int j=0;j<order;j++) {
				A[i][j]=sc.nextDouble(); 
			 }	 
		 }
		 
		 System.out.println("Enter elements of matrix b :");
		 for(int i=0;i<order;i++) {
			B[i]=sc.nextDouble();
		 }
		 
		 System.out.println("Enter initial solution values :");
		 for(int i=0;i<order;i++) {
			C[i]=sc.nextDouble();
		 }
		 
		 System.out.println("Enter no of iteration to be done  :");
		 int iter=sc.nextInt();
		 
		 while(iter>0) {
			 for(int i=0;i<order;i++) {
				 D[i]=(B[i]/A[i][i]);
				 for(int j=0;j<order;j++) {
					 if(j==i)
						 continue;
					 D[i]=D[i]-((A[i][j]/A[i][i]*C[j]));
					 C[i]=D[i];
				 }
			 }
			 System.out.println();;
			 iter--;
		 }
		 
		 for(int i=0;i<order;i++) {
			 System.out.println("x"+(i+1)+" = " + D[i]);; 
		 }
}
 public static void main(String args[]) {
	 System.out.println("Enter the number of variable in system of equation :");
	 int order=sc.nextInt();
	 double A[][]=new double[order][order]; //coefficient matrix A
	 double B[]=new double[order];  // matrix b
	 double C[]=new double[order];  //initial values of x
     solveEquation(A,B,C); 
  }
}
