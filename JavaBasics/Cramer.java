  package govindProject;

import java.util.Scanner;

public class Cramer {                 // solving eqn of order two or three by cramers rule;
	 public static double Det(double mat[][]) {
		 double Det=mat[0][0]*(mat[1][1]*mat[2][2]-mat[2][1]*mat[1][2])
				 -mat[0][1]*(mat[1][0]*mat[2][2]-mat[1][2]*mat[2][0])
				 +mat[0][2]*(mat[1][0]*mat[2][1]-mat[1][1]*mat[2][0]);
		return Det;
		 
	 }
	public static void matsol(double mat[][]) {
		double d[][]= {   { mat[0][0],mat[0][1],mat[0][2] },
				          { mat[1][0],mat[1][1],mat[1][2] },
			           	  { mat[2][0],mat[2][1],mat[2][2] }    };
		
		
		double d1[][]= {   { mat[0][3],mat[0][1],mat[0][2]},
				           { mat[1][3],mat[1][1],mat[1][2]},
				           { mat[2][3],mat[2][1],mat[2][2]}   };
	
		double d2[][]= {   { mat[0][0],mat[0][3],mat[0][2]},
				           { mat[1][0],mat[1][3],mat[1][2]},
				           { mat[2][0],mat[2][3],mat[2][2]}   };
	 	
		double d3[][]= {   { mat[0][0],mat[0][1],mat[0][3]},
				           { mat[1][0],mat[1][1],mat[1][3]},
				           { mat[2][0],mat[2][1],mat[2][3] }   };
		
		double D=Det(d);
		double D1=Det(d1);
		double D2=Det(d2);
		double D3=Det(d3);
		  
		if (D!=0) {
			
			double x=D1/D;
			double y=D2/D;
			double z=D3/D;
			System.out.println("the value of x is :"+ x);
			System.out.println("the value of y is :"+ y);
			System.out.println("the value of z is :"+ z);      }
		else {
		
			if (D==0&& D1==0&&D2==0&&D3==0) 
			      System.out.println("the system has infinitely many solutions ");
			else if (D1!=0||D2!=0||D3!=0)
				System.out.println("the system has no solution ");	
		}
	
		
	}		                                                      
                                                                                                         	
	
	public static void matsol( double mat[][],int n) {
	
		double D  =mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
		double D1 =mat[0][2]*mat[1][1]-mat[0][1]*mat[1][2];
		double D2 = mat[0][0]*mat[1][2]-mat[1][0]*mat[0][2];
		
		if(D!=0) {
			double x=D1/D;
			double y = D2/D;
			System.out.println("the value of x is :"+ x);
			System.out.println("the value of y is :"+ y);      }
		
		else {
			
			if(D1==0&&D2==0)
				System.out.println("the system has infinitekly many solutions ");
			else if(D1!=0||D2!=0)
				System.out.println("ths system has no solution ");
			
		}
		
		
	} 
	public static void main(String [] args) {
		Scanner obj1=new Scanner(System.in);
		
		System.out.println("Enter the number of  variables : ");
		 int  size=obj1.nextInt();
		 
		double arr[][]=new double [size][size+1];
		
		System.out.println("enter the elements  of agumented  matrix of coefficients and constant : ");
		for(int i=0;i<size;i++)
		{   
			for(int j=0;j<=size;j++)
			     arr[i][j]=obj1.nextDouble();			

		}
		System.out.println("the given agumented matrix is :");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=size;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		  
		System.out.println();
		 if(size==3)
			 matsol(arr);
		 else if(size==2)
			 matsol(arr,2);
		 else 
			 System.out.println("please enter size 2 or 3 ");
			 
			 
	}

}
