package govindProject;

public class CountPaths {
	
	public static long countPath( int n) {
	 
	  if(n>=2)
	  {
		  long array[]=new long[n+1];
		  array[0]=1;
		  array[1]=1;
		  
		  for(int i=2;i<=n;i++)
		  {
			 array[i]=2*array[i-1];
		  }
		  return array[n];
	  }
	return 1;
   }
	
	
	
	public static void main(String args[]) {
	 
//		System.out.println(countPath(4)); 
		
	}

}
