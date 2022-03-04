package govindProject;

public class CountSort {
	
	public static void countSort(int array[],int x)
	{
		int n=array.length;
		int[] b=new int[x+1];
		int []c=new int[n+1];
		int count=0;
		for(int i=0;i<=x;i++)
			b[i]=0;
	    for(int i=0;i<n;i++)
	    {
	    	b[array[i]]++;
	    }
	    for(int i=1;i<=x;i++)
	    {
	    	b[i]=b[i]+b[i-1];
	    }
	    
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
