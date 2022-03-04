package govindProject;

public class MergeShort {
	
	public int [] Merge(int arr1[],int arr2[]) {
		int m=arr1.length;
		int n=arr2.length;
		int i=0;
		int j=0;
		int k=0;
		int arr3[]=new int[m+n];
		while(i<m&&j<n) {
			if(arr1[i]<arr2[j])
				arr3[k++]=arr1[i++];
			else
				arr3[k++]=arr2[j++];
		}
		for(;i<m;i++)
			arr3[k++]=arr1[i];
		for(;j<n;j++)
			arr3[k++]=arr2[j];
		return arr3;
	}
	
	public int []mergeShort(int arr[]){
	   int n=arr.length;
	   if(n==1)
		   return arr;
	   else {
		   int arr1[];
		   int arr2[];
		   int mid=(arr.length/2);
		    if(arr.length%2==0) {
		    	   arr1=new int[mid];
				   arr2=new int[arr.length-arr1.length];
				   for(int i=0;i<mid;i++)
					   arr1[i]=arr[i];
				   for(int j=0;j<arr2.length;j++)
					   arr2[j]=arr[j+mid];
		    }
			    
		    else {
		    	 arr1=new int[mid+1];
				 arr2=new int[arr.length-arr1.length];
				 for(int i=0;i<=mid;i++)
					   arr1[i]=arr[i];
				   for(int j=0;j<arr2.length;j++)
					   arr2[j]=arr[j+mid+1];
		    }
		   arr1=this.mergeShort(arr1);
		   arr2=this.mergeShort(arr2);
		   return this.Merge(arr1, arr2);
		  
		   
	   }
	}

	public static void main(String[] args) {
		MergeShort m=new MergeShort();
		int arr[]= {98,67,34,26,178,37,54,867,1,9,3,0,-1};
		arr=m.mergeShort(arr);
     for(int i=0;i<arr.length;i++)
    	 System.out.println(arr[i]);
		
	}

}
