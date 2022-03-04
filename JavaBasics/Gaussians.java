package govindProject;

import java.util.Scanner;

public class Gaussians {                     // this program is to solve eqn using Gaussian Elimination method;
private double [][]m;
private double constants[];
private double solution [];
private int numEqn;
public static  Scanner sc=new Scanner(System.in); 

public Gaussians(int eqns) {              // constructor;

	numEqn=eqns;
    m= new double [eqns][eqns];
    constants = new double [eqns];
    solution=new double[eqns];
}
public void InputMatrix() {           // to take input;
	for(int i=0;i<numEqn;i++) {
		System.out.println("Enter the coefficient of variables of " +(i+1)+ "" + " equation : ");
		for(int j=0;j<numEqn;j++) {
			m[i][j]=sc.nextDouble();
		}
		System.out.println("Enter the constant of " +(i+1)+ " row ");
				constants[i]=sc.nextDouble();
	}
}
public void printSolution() {                          // to print Solution;
	System.out.println("\nSolution  of x , y and z are respectively  : ");
	for(int i=0;i<numEqn;i++)
			System.out.println(constants[i]);
	
}
public void swapRows(int row1,int row2) {               // swapping rowsw;
	double value;
	for(int j=0;j<numEqn;j++)
	{
		value=m[row1][j];
		m[row1][j]=m[row2][j];
		m[row1][j]=value;
	}
	value=constants[row1];
	constants[row1]=constants[row2];
	constants[row2]=value;
}

public void eliminate() {                  // Gaussian elimination;
	  int i,j,k;
	  double var,fact;
  for( i=0;i<this.numEqn;i++) {
		boolean allzero=true;
		for( j=0;j<numEqn;j++) {
			if(m[i][j]!=0) {
				allzero=false;
			}
		}
		if(allzero)
		  swapRows(i,numEqn-1);
  }
	int n=constants.length;
	  for(i=0;i<n;i++) {
		var=m[i][i];
		for(j=0;j<n;j++) 
			m[i][j]=m[i][j]/var;
			constants[i]=constants[i]/var;
			for(k=0;k<n;k++) {
				if(k!=i) {
					fact=m[k][i];
					for(j=0;j<n;j++)
						m[k][j]=m[k][j]-fact*m[i][j];
					constants[k]=constants[k]-fact*constants[i];
				}
			}
	    }
	
}

public void eigenValues() {
	for(int i=0;i<this.m.length;i++)
		System.out.print(this.m[i][i]+ "  ");
}

public static void main(String args[]) {
	System.out.println("enter the number of terms : ");
	Gaussian obj=new Gaussian(sc.nextInt());
	obj.InputMatrix();
	obj.eliminate();
//	obj.printSolution();
//	System.out.print("Hiii");
	
	
 }
}