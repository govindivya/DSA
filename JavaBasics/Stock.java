package govindProject;

public class Stock {
	
	public static void stockBruteForce(int array[])
	{
		int max=0;
		int n=array.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int num=array[j]-array[i];
				if(num>max)
					max=num;
			}
		}
		System.out.println(max);
	}
	public static void stockOptimised(int array[])
	{
		int min=array[0];
		int max=0;
		int m=0;
		int l=array.length;
		for(int i=0;i<l;i++)
		{
		   	if(array[i]<min)
		   	{
		   		min=array[i];
		   	}
		   	m=array[i]-min;
		   	if(m>max)
		   		max=m;
		}
		System.out.println(max);
	}
	public static void stockOptimised2(int arr[])
	{
		int l=arr.length;
		int profit=0;
        
        for(int i=1;i<l;i++)
        {
        	if(arr[i]>arr[i-1])
        	{
        		profit+=arr[i]-arr[i-1];
        	}
        }

		System.out.println(profit);
	}
	

	public static void main(String[] args) {
		int arr[]= {5,2,7,3,6,1,2,4};
		stockOptimised(arr);
		stockBruteForce(arr);
		stockOptimised2(arr);

	}

}
