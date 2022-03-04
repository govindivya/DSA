package govindProject;

public class RainTap {
	
	public static void rainTap(int arr[]) {
		 int l=arr.length;
		 int left[]=new int[l];
		 int right[]=new int[l];
		 int max=arr[0];
		 for(int i=0;i<l;i++)
		 {
			 if(arr[i]>max)
				 max=arr[i];
			 left[i]=max;
	     }
		 max=arr[l-1];
		 for(int i=l-1;i>=0;i--)
		 {
			 if(arr[i]>max)
				 max=arr[i];
			 right[i]=max;
		 }
		 int volume=0;
		 for(int i=0;i<l;i++)
		 {
			 volume+=Math.min(left[i], right[i])-arr[i];
		 }
		 System.out.println(volume);
	}

	public static void main(String[] args) {
		int arr[]= {3,1,2,4,0,1,3,2,1,0,3};
		 rainTap(arr);
	}

}
