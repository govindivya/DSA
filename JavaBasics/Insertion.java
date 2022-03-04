package govindProject;

public class Insertion {

	public Insertion() {
		
	}
  public static int [] sort(int arr[] ){
	  int l=arr.length;
	  for(int i=1;i<l;i++) {
		  int key= arr[i];
		  int j=i-1;
		  while(j>=0&&arr[j]>key) {
			  arr[j+1]=arr[j];
			  j--;
		  }
		  arr[j+1]=key;
	  }
	  
	 return arr; 
	  
	  
  }
	public static void main(String[] args) {
		int arr[]= {8,19,2,67,23,7,26,89,14,24};
		int arr2[]=sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
