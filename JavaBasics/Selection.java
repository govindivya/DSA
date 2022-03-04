package govindProject;

public class Selection {

	
	public static int [] sort(int arr[]) {
		int l=arr.length;
		for(int i=0;i<l-1;i++) {
			int min=i;
			for(int j=i+1;j<l;j++) 
				if(arr[j]<arr[min])
					min=j;
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {78,6,83,15,4,35,73,89,90};
     int arr1 []=sort(arr);
     for(int i=0;i<arr.length;i++)
    	 System.out.println(arr1[i]);
	}

}
