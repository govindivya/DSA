package govindProject;

public class Count_Short {

	public static int[] count_Short(int arr[],int k) {
		int arr1[]=new int[k+1];
		int arr2[]=new int [arr.length+1];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=0;
		}
		for(int i=0;i<=k;i++) {
			arr1[i]=0;
		}
		for(int i=1;i<=arr.length;i++) {
			arr1[arr[i-1]]=arr1[arr[i-1]]+1;
		}
		for(int i=1;i<=k;i++) {
			arr1[i]=arr1[i]+arr1[i-1];
		}
		for(int i=arr.length;i>=1;i--) {
			arr2[arr1[arr[i-1]]]=arr[i-1];
			arr1[arr[i-1]]=arr1[arr[i-1]]-1;
		}
		int arr3[]=new int[arr2.length-1];
		for(int i=0;i<arr2.length-1;i++)
			arr3[i]=arr2[i+1];
		
		 
		return arr3;
				
		
	}
	public static void main(String[] args) {
	     int arr[] = {1,8,7,13,8,7,12,14,9,19,20,31}; 
	     arr=count_Short(arr,31);
	     for(int i=0;i<arr.length;i++)
	    	 System.out.print(arr[i]+" ");
	}

}
