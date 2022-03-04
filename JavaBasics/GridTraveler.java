package govindProject;

public class GridTraveler {

	public static int TotalPaths=0;
	
 public static boolean is_Safe(int array[][],int i,int j) {
		if(i<array.length&&j<array.length&&i>=0&&j>=0)
		{
			return true;
		}
		return false;
	}
 
	
	public static void find_All_Paths(int array[][],int visited[][],int i,int j) {
		 if(visited[0][0]==1)
		 {
			 return ;
		 }
		 if(i==0&&j==0)
		 {
			 TotalPaths++;
			 return ;
		 }
		 if(!is_Safe(array,i,j))
		 {
			 return;
		 }
		 visited[i][j]=0;
		 if(is_Safe(array,i-1,j)&&visited[i-1][j]==0)
		 {
			find_All_Paths(array,visited,i-1,j); 
		 }
		 if(is_Safe(array,i,j-1)&&visited[i][j-1]==0)
		 {
			find_All_Paths(array,visited,i,j-1); 
		 }
		 visited[i][j]=0;
	 }
	public static double allPath(int i)
	{
		return Math.pow(2,(i-1)*(i-1))+3*(i-1)+i-2;
	}

	public static void main(String[] args) {
		int array[][]=new int[15][15];
        int visited[][]=new int[15][15];
        for(int i=0;i<15;i++)
        {
        	for(int j=0;j<15;j++)
        		visited[i][j]=0;
        }
        find_All_Paths(array,visited,14,14);
         System.out.println(TotalPaths);
         System.out.println(allPath(10));
        

	}

}
