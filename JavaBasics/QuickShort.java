package govindProject;

public class QuickShort {

	 public static void print(int array[])
	 {
		 for(int i=0;i<array.length;i++)
			 System.out.print(array[i]+" ");
		 System.out.println();
	 }
	
	public int [] quickShort(int arr[],int low,int high) {
		if(low<high) {
			int p=this.Partition(arr, low, high);
			this.quickShort(arr, low,p-1);
			 
			if(p<high)
			this.quickShort(arr, p+1, high);
	 
		}
		return arr;
	}
	public int Partition(int arr[],int low,int high) {
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				System.out.println("Swap  " + arr[i]+ " and "+ arr[j] + " ");
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
			}
		}
		
		System.out.println("Swap at last " + arr[i+1]+ " and "+ arr[high] + " ");
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		System.out.println("P is  " + (i+1));
		System.out.println();
		print(arr);
		return i+1;
		
	}

	public static void main(String[] args) {
	  QuickShort m=new QuickShort();
	  int arr[]= {25,10,72,18,40,11,32,9};
	  int []arr1=m.quickShort(arr, 0, arr.length-1);
	  for(int i=0;i<arr.length;i++)
		  System.out.println(arr1[i]);

	}
}
