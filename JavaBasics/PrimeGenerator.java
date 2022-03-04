package govindProject;

import java.util.Scanner;
import java.math.*;

public class PrimeGenerator extends Thread {
	int UpperPrimeLimit;
	int LowerPrimeLimit;
	PrimeGenerator(int A,int B){
		this.LowerPrimeLimit=A;
		this.UpperPrimeLimit=B;
		
	}
	public void run() {
		System.out.println();
		for(int i=this.LowerPrimeLimit;i<this.UpperPrimeLimit;i++) {
			boolean check=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					check=false;
			}
			
			if(check==true)
					System.out.print(i+" ");
		}
		
	}

public void set_Limits(int A,int B) {
	this.LowerPrimeLimit=A;
	this.UpperPrimeLimit=B;
}
public int get_UpperLimit() {
	return UpperPrimeLimit;
}
public int get_LowerLimit() {
	return LowerPrimeLimit;
}
public String toString() {
	return "ClassName : "+this.getClass()+"\n "
	    + " UpperPrimeLimit : "+LowerPrimeLimit+"   LowerPrimeLimit : "+UpperPrimeLimit+"";
}
	public static void main(String args []) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the range of the  prime numberrs has to be printed : ");
		int num = Sc.nextInt();
		int num1=Sc.nextInt();
		PrimeGenerator A=new PrimeGenerator(num,(int)(num1+num)/2);
		PrimeGenerator B=new PrimeGenerator((int)(num1+num)/2+1,num1);
		
		System.out.println(A);
	    System.out.println(B);
	    A.start();
		B.start();
	    
	}
	

}
   