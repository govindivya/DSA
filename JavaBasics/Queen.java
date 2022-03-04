package govindProject;

public class Queen {
	
	public static boolean isSafe(int arr[][],int x,int y,int n)
	{
	 
		for(int i=0;i<x;i++)
		{
			if(arr[i][y]==1)
				return false;
			
		}
		int i=x;
		int j=y;
		while(i>=0&&j>=0)
		{
			if(arr[i][j]==1)
				return false;
			i--;
			j--;
		}
		
		 i=x;
		 j=y;
		while(i>=0&&j<n)
		{
			if(arr[i][j]==1)
				return false;
			i--;
			j++;
		}
		
		return true;
		
	}
	public static boolean n_Queen(int array[][],int x,int n)
	{
		if(n>=x)
			return true;
		for(int i=0;i<n;i++)
		{
			if(isSafe(array,x,i,n))
			{
				array[x][i]=1;
				if(n_Queen(array,x+1,n))
				{
					return true;
				}
				array[x][i]=0;
			}
				
		}
		return false;
	}

	public static void main(String[] args) {
        int array[][]=new int[4][4];
        for(int i=0;i<4;i++)
        	for(int j=0;j<4;j++)
        		array[i][j]=0;
        n_Queen(array,0,5);
        for(int i=0;i<4;i++) {
        	for(int j=0;j<4;j++)
        		System.out.print(array[i][j]+" ");
        	System.out.println();
        }
        
        
        
        

	}

}
