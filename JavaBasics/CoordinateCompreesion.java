package govindProject;

public class CoordinateCompreesion {

	public CoordinateCompreesion() {
		// TODO Auto-generated constructor stub
	}
	
	
public int hcf(int num1,int num2) {
	     int num4;
	 
		if(num1%num2==0) 
			return num2;
		
		else if(num2%num1==0) 
		  return num1;
		else if(num1>num2)
			return hcf(num1%num2,num2);
		else if(num1==num2)
			return num1;
		else
			return hcf(num1,num2%num1);
		
}
   public int[] Compress(int arr[]) {
	        int num1;
	        int arr1 []=new int[arr.length];
	        for(int i=0;i<arr.length;i++)
	        	arr1[i]=arr[i];
	        for(int i=0;i<arr.length-1;i++) {
	          arr[i+1]=this.hcf(arr[i], arr[i+1]);
	        }
           num1=arr[arr.length-1];
           for(int i=0;i<arr.length;i++)
        	   arr1[i]=arr1[i]/num1;
	        return arr1;
    }
   

public static void main(String args[]) {
	CoordinateCompreesion  a=new  CoordinateCompreesion();
    int []arr1= {10,20,30,40,50,60};
    int arr[]=a.Compress(arr1);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
  }
}
