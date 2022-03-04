package govindProject;
import java.awt.Point;
import java.util.*;

public class ShortestPath {
	
	public static boolean isSafe(int array[][],int i ,int j)
	{
		int n=array.length;
		 if(i>=0&&i<n&&j>=0&&j<n)
		 {
			 if(array[i][j]!=1)
				 return true;
		 }
		 return false;
	}
	public static Point[] getNeighour(int array[][],int i,int j)
	{
		Point arr[]=new Point[4];
		int count=0;
		if(isSafe(array,i+1,j))
		{
		   arr[count]=new Point(i+1,j);
		   count++;
		}
		if(isSafe(array,i-1,j))
		{
			arr[count]=new Point(i-1,j);
			count++;
		}
		if(isSafe(array,i,j+1))
		{
			arr[count]=new Point(i,j+1);
			count++;
		}
		if(isSafe(array,i,j-1))
		{
			arr[count]=new Point(i,j-1);
			count++;
		}
		return arr;
		
	  }
	
	@SuppressWarnings("rawtypes")
	public static void find_Shortest_Path(int array[][])
	{
		int n=array.length;
		boolean visited[][]=new boolean[n][n];
		
	     
		@SuppressWarnings("unchecked")
		Queue<Point> q= new LinkedList<Point>();
	    q.add(new Point(n-1,n-1));
	    while(!q.isEmpty())
	    {
	    	Point p=q.peek();
	    	if(p.getX()==0&&p.getY()==0) {
	    		System.out.println("Goal Reached");
	            return;
	    	}
	    	Point arr[]=getNeighour(array,p.x,p.y);
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		if(arr[i]!=null) 
	    		{
	    		  if(visited[arr[i].x][arr[i].y]==false)
	    		  {
	    		     q.add(arr[i]); 	
	    		  }
	    	     }
	        }
	    	q.poll();
	    }
	    
	    System.out.println("Goal cannot be Reached"); 
	 }

	public static void main(String[] args) {
	  
		int array[][]= {{0,0,0,1,1,0},
				        {1,1,0,0,0,1},
				        {1,0,0,0,1,1},
				        {0,0,0,1,0,1},
				        {1,1,1,1,1,1},
				        {0,0,0,0,0,1}};
		find_Shortest_Path(array);
		
		 


	}

}
