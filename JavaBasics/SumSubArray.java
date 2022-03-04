package govindProject;
import java.util.Scanner;
public class SumSubArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elemnts");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the sumValue");
	int S=sc.nextInt();
	
	int crSum=0;
	int left=-1;
	int right=-1;
	for(int i=0;i<n;i++)
	{
	 if(crSum==S)
		 break;
	 if(crSum<S) {
		 right++;
		 crSum+=arr[i];
	 }
	 else {
		 while(crSum>S&&left<=right)
		 {
			 left++;
			 crSum-=arr[left];
		 }
	 }
	
	}
    
    if(crSum!=S) {
    	System.out.println("no Sub ARray");
    }
    else {
    	System.out.println("From " + (left+1) +" to " + right);
    }
	
	}

}
