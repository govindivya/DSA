package govindProject;

public class Recursive {
	
	public static boolean checkSorted(int arr[] ,int size,int i) {
		if(size==1)
			return true;
		boolean restArray=checkSorted(arr,size-1,i+1);
		return arr[i]<arr[i+1]&&restArray;
	}
	public static int firstOccurence(int arr[],int size,int pos,int key) {
		if(pos==size)
			return -1;
		if(arr[pos]==key)
		         return pos;
		else 
			return firstOccurence(arr,size,pos+1,key);
		
	}
	public static int lastOccurence(int arr[],int size,int pos,int key) {
		if(pos==size)
			return -1;
		int restArray=lastOccurence(arr,size,pos+1,key);
		if(restArray!=-1) {
			return restArray;
		}
		if(arr[pos]==key)
			return pos;
		return -1;
	}
	public static void reverseString(String str) {
		if(str.length()==0)
			return ;
		String ros=str.substring(1);
		
		reverseString(ros);
		System.out.print(str.charAt(0));
	}
	public static void replacePi(String str) {
	if(str.length()==0)
           return ;
	String s=str.substring(0,2);
	if(s.equals("pi")) {
		System.out.print("3.14 ");
		if(str.length()>=4)
			replacePi(str.substring(2));
	}
	else {
		System.out.print(str.charAt(0));
		replacePi(str.substring(1));
	}
	
	}
	public static String removeDuplicateChar(String str) {
      if(str.length()==0)
    	  return "";
      
      
      
       return str;
		
	}
	
	
	
	public static void main(String args[]) {
//		int arr[]= {1,2,3,4,5,2,8};
//		System.out.println(firstOccurence(arr,arr.length,0,2));
//		System.out.println(lastOccurence(arr,arr.length,0,2));
//		reverseString("dnivog");
//		replacePi("pipppipppi");
		System.out.println(removeDuplicateChar("aabbbccaadddcc"));
		 
	}

}
