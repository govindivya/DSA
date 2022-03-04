package govindProject;

public class Transpose {
	
	
	public static void transPose(int array[][]) {
		int arr[][]=new int[array.length][array.length];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[j][i]=array[i][j];
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		 int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 transPose(array);
		 
		 
	}
	
	

}
