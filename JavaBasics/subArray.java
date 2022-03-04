package govindProject;

import java.util.Scanner;

public class subArray {
	public static void subArraySum(int array[]) {
		 
		int array1[]=new int[array.length];
		    array1[0]=0;
		    int max_Sum=0;
		    
		    for(int i=1;i<array1.length;i++) {
		    	
		    	array1[i]=array[i-1]+array1[i-1];
		    	if(array1[i]<0)
		    		array1[i]=0;
		    	if(max_Sum<array1[i])
		    		max_Sum=array1[i];
		    	
		    }
		 System.out.println(max_Sum);
	}
	public static void Spiral(int array[][]) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the number of rows and column");
		//int row=sc.nextInt();
		//int col=sc.nextInt();
		int start_row=0;
		int end_row=array.length-1;
		int start_col=0;
		int end_col=array[0].length-1;
		 
		while(start_row<=end_row&&start_col<=end_col) {
		for(int i=start_col;i<=end_col;i++) {
			System.out.print(array[start_row][i]+" ");
		    	
		}
		//System.out.println();
		start_row++;
		for(int i=start_row;i<=end_row;i++) {
            System.out.print(array[i][end_col]+" ");
		    	
		}
		
		 
		 end_col--;
		for(int i=end_col;i>=start_col;i--) {
			System.out.print(array[end_row][i]+" ");
		   }
		 
		 end_row--;
		for(int i=end_row;i>=start_row;i--) {
			System.out.print(array[i][start_col]+" ");
		 	
		}
		 
		   start_col++;
		
		}
		
		
	}

 
	public static void main(String[] args) {
    int array[][]= {{4,-1,-5,-1,9,7,8},{2,3,7,9},{10,6,9,1},{8,11,12,15}};
//     for(int i=0;i<4;i++) {
//    	 for(int j=0;j<4;j++) 
//    		 System.out.print(array[i][j]+" ");
//    	 System.out.println();
//    	}
     subArraySum(array[0]);
     
    //int arr [][]=new int [4][5];
    //System.out.println(arr.length);
//    Spiral(array); 
	}


	

}
