package govindProject;
import java.util.*;
import java.lang.*;
public class Kangaroo {
   // Method to solve the given problem statement
	
	public static int [] SolveProblem(int N,int M,int expDis[][],int lensCap[][]) {
		
		int arr[]=new int[M];
		for(int i=0;i<M;i++)
			 arr[i]=0;
		 
		for(int i=0;i<M;i++) {
			int num1=lensCap[i][0];
			int num2=lensCap[i][1];
			
			for(int j=0;j<N;j++) {   // loop to compare lens capacity with expected distance of kangaroos;
			   int num3=expDis[j][0];
			   int num4=expDis[j][1];
			    if((num1>=num4)&&(num2>=num4))
			       arr[i]+=0;
			    else if((num1<=num3)&&(num2<=num3))
			    	arr[i]+=0;
			    else 
			    	arr[i]+=1;
			}
			
		}
		return arr;
	}
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Please enter the problem's input :");
	 int n=sc.nextInt();                                // to get no of observations
	 int m=sc.nextInt();                                // to get no of lenses
	 int ObservationArray[][]=new int[m+n][2];          // array to store observations and lens capacity both
	 for(int i=0;i<m+n;i++)
		 for(int j=0;j<2;j++)
			 ObservationArray[i][j]=sc.nextInt();
	 
	int ExpectedDis[][]=new int [n][2];                  //  create new ExpectedDistance array
	
	int LensRange[][]=new int [m][2];                    //   create new LensCapacity array 
	
	for(int i=0;i<n;i++)                                  // copying to ExpectedDistance from observations
		for(int j=0;j<2;j++)
			ExpectedDis[i][j]=ObservationArray[i][j];
	for(int i=0;i<m;i++)                                   // copying to LensCapacity from observation
		for(int j=0;j<2;j++)
			LensRange[i][j]=ObservationArray[n+i][j];
	
	int newSolution []=SolveProblem(n,m,ExpectedDis,LensRange);		// storing result of Problem 
	for(int i=0;i<newSolution.length;i++)
		System.out.println(newSolution[i]);
	 
	 }

}
