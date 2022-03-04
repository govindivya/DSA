package govindProject;

import java.util.Random;
import java.util.Scanner;
                                       
public class RandomNumbers {                       // this program is to generate random integer numbers b/w  two  given  numbers;
  public static Scanner sc = new Scanner(System.in);    // and real number b/w 0 and 1;
  Random gen= new Random();
  double arr1[];
  int arr2 [];
  
 RandomNumbers(int n){
	 
	arr1= new double[n]; 
	arr2=new int[n];
 }
 public void RndGenInt(RandomNumbers A,int max,int min) {      // method to generate  random integer b/w given integers;
	 
		 for(int i=0;i<A.arr2.length;i++) {
	      A.arr2[i]=(int)(Math.random()*(max-min)+min);
	      System.out.print(A.arr2[i]+" ");
		 }
	 
 }
 public void RndGenReal(RandomNumbers A) {      // to generate random  real number 
	 for(int i =0;i<A.arr1.length;i++) {
		 A.arr1[i]=Math.random();
		 System.out.print(A.arr1[i]+" ");
	 } 
 }
public static void main(String args[]) {
	System.out.println("Enter the number of terms in the sequence of random numbers  : ");
	int num= sc.nextInt();
	RandomNumbers obj1=new RandomNumbers(num);
	System.out.println("Enter the type of random numbers :\n 1 : for real or \n 2 : for integers  : ");
	int  type = sc.nextInt();
	
	if(type ==1)
	    obj1.RndGenReal(obj1);
	else if(type==2)
		{
			System.out.println("enetr the minimum and maximum value of integer ");
			int min = sc.nextInt();
			int max = sc.nextInt();
		    obj1.RndGenInt(obj1,max,min);
		 
		}
	else
		System.out.println("enter valid type: ");
	
}
  
}
