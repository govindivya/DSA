package govindProject;

import java.util.Scanner;

public class Approximation {

	public static double solveExpression(int index ,double num) {
	 
		if(index==1)
		return ( Math.cos(num)-num*Math.exp(num));
		
		else if(index==2)
		return (Math.tan(num)+Math.tanh(num));
		
		else if(index==3)
		return (num*num*num-num-4);
		
		else if(index==4)
		return (num*num*num-5*num+1);
		else if(index==5)
			return (Math.cos(num)-num*num-num);
		else
		return Double.MIN_VALUE;
	}
	
	public static void evaluateRoot(int index) { 
     double a,b,x;
     a=1000000000;
     b=-1000000000;
     x=-1000000000;
     
     double val1=a;
     double val2=b;
     
     for(float i=-100;i<100;i+=0.0001) {
    	if(solveExpression(index,i)>0) {
    	  if(Math.abs(val1-i)<Math.abs(a-b)) {
    		  a=i;
    		  val1=a;
    	  }
    	}
    	else if(solveExpression(index,i)<0) {
    		 if(Math.abs(val1-i)<Math.abs(a-b)) {
    			 b=i;
    			 val2=b;
    		 }
    	}
    	else if(solveExpression(index,i)==0){
    		System.out.println("The value is :"+solveExpression(index,i) );
    		System.out.println("The root is  :" + i);
    		return ;
    	}
     }
 

    System.out.println("The root is :"+ (a+b)/2);  
    System.out.println("The equation value at root is : "+ solveExpression(index,(a+b)/2));

	}
	
	
	public static void main(String args[]) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the index no of question :");
	 int index=sc.nextInt();
	 evaluateRoot(index);
	 
	}
}
