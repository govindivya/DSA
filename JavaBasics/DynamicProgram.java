package govindProject;

public class DynamicProgram {
 
	public static void Longest_Inc_Sub_Array(int array[]) { 
		
	 int original_Pointer1=0;
	 int original_Pointer2=0;
	 int aux_Pointer1=0;
	 int aux_Pointer2=0;;
	 for(int i=0;i+1<array.length;i++)
	 {
		 if(array[i+1]>=array[i])
		 {
			 aux_Pointer2=i+1;
			 if((  aux_Pointer2-aux_Pointer1)>=original_Pointer2-original_Pointer1)
			 {
				 original_Pointer1=aux_Pointer1;
				 original_Pointer2=aux_Pointer2;
			 }
		 }
		 else
		 {
		    aux_Pointer1=aux_Pointer2=i+1;
			 
		 }
	   }
	 for(int i=original_Pointer1;i<=original_Pointer2;i++)
	 {
		 System.out.println(array[i]);
	 }
	}
	public static int[] LIS(int array[])
	{
		int l=array.length;
		
		 int orig[]=new int[l];
	     int origCount=0;
	     for(int i=0;i<l;i++)
	     {
	    	 
	    	 int aux[]=new int[l];
	    	 aux[0]=array[i];
	    	 int count=1;
	    	 for(int j=0;j<l;j++)
	    	 {
	    		 if(array[j]>aux[count-1])
	    		 {
	    			 aux[count]=array[j];
	    			 count++;
	    		 }
	    	 }
	    	 if(count>origCount)
	    	 {
	    		 origCount=count;
	    		 orig=aux;
	    	 }
	     }
		 
		
		  
	 
		 return orig;
	}
	public static void main(String args[]) {
		int array[]= {3,7,8,9,10,6,8,9,4,1,0};
		int array1[]= {1,7,2,3,5,4,9,2,8,1};
		Longest_Inc_Sub_Array(array);
		System.out.println();
		array1=LIS(array1);
		for(int i=0;i<array1.length;i++)
		{
			System.out.print(array1[i]+"  ");
		}
	}
}



