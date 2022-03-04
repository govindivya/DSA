package govindProject;

public class Sudoko {
	
	public static boolean is_safe(int arr[][],int i,int j,int num,int n)
	{
		for(int k=0;k<n;k++)
		{
			if(arr[k][j]==num)
				return false;
		}
		for(int k=0;k<n;k++)
		{
			if(arr[i][k]==num)
				return false;
		}
		
		return true;
	}
	
	public static boolean sudoko(int arr[][],int row,int col,int n){
		 if(row<=n-1&&col==n-1)
	     {
	        	row=row+1;
	        	col=0;
	     }
        if(row==n)
        	return true;
       
        for(int k=1;k<=9;k++)
        {
        	if(is_safe(arr,row,col,k,n))
        	{
        		arr[row][col]=k;
        		if(sudoko(arr,row,col+1,n))
        		{
        			return true;
        		}
        		arr[row][col]=0;
        	}
        }
		
        return false;
		
	}

	public static void main(String[] args) {
		 
		int array[][]= { {1,0,0,0,3,0,0,0,0},
				         {0,0,9,0,0,0,0,0,0},
				         {0,0,0,0,0,0,0,9,0},
				         {0,0,0,0,0,0,0,0,0},
				         {0,0,0,0,7,0,0,0,0},
				         {0,0,0,0,0,0,0,0,0},
				         {0,5,0,0,0,0,0,0,0},
				         {0,0,0,0,0,0,0,0,0},
				         {0,0,0,0,0,0,0,0,0},
				          
				           };
		
				        
		sudoko(array,0,0,9);
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(array[i][j]+ "  ");
			}
			System.out.println();
		}
		}

}
