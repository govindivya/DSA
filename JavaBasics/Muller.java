package govindProject;

import java.util.Scanner;

public class Muller {
    static double MAX=10000;
    
    
	public static double f(double a) {
		
		return 1*a*a*a +2*a*a+10*a-20;
	}
	public static double solveForRoot(double a ,double b,double c) {
		double result;
		int i;
		for(i=0; ;++i) {
			double f1=f(a);
			double f2=f(b);
			double f3=f(c);
			double d1=f1-f3;
			double d2=f2-f3;
			double h1=a-c;
			double h2=b-c;
			double a0=f3;
			double a1=(((d2*h1*h1)-(d1*h2*h2))/(h1*h2*(h1-h2)));
			double a2=(((d1*h2)-(d2*h1))/(h1*h2*(h1-h2)));
			double x=((-2*a0)/(a1+Math.abs(Math.sqrt(a1*a1-4*a0*a2))));
			double y=((-2*a0)/(a1-Math.abs(Math.sqrt(a1*a1-4*a0*a2))));
			
			if(x>=y)
				result=x+c;
			else 
				result=y+c;
			double m=result*100;
			double n=c*100;
			m=Math.floor(m);
			n=Math.floor(n);
			if(m==n)break;
			a=b;
			b=c;
			c=result;
			if(i>MAX) {
			   System.out.println("Root can't be found with Muller method");
			   break;	
			}
		} 
		if(i<=MAX)
			System.out.println("Root is :" +result);
		return 0;
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		double x1=sc.nextDouble();
//		double x2=sc.nextDouble();
//		double x3=sc.nextDouble(); we can pass it argument is solveRoot();
		solveForRoot(0,1,2); 
	}

}
