package govindProject;

public class BitManipulation {
    
	public static boolean getBitsAt(int num,int pos) {
	    return ((num&((int)Math.pow(2, pos)))!=0);
	}
	public static int setBitAt(int num,int pos,int value) {
		if (value==1)
		return ((num|(int)(Math.pow(2, pos))));
		else
			return  ((num&(~(int)(Math.pow(2, pos)))));
		
	}
	public static boolean isPowerofTwo(int n) {
		return ((n&(n&(n-1)))==0);
	}
	public static int countOnes(int n) {
		int count=0;
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		return count;
	}
	public static void printAllSubset(int arr[]) {
		int num=arr.length;
		for(int i=0;i<(1<<num);i++) {
			for(int j=0;j<num;j++) {
				if((i&(1<<j))!=0) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
	}
	public static int getUniqueNo(int arr[]) {
		int xsum=0;
		for(int i=0;i<arr.length;i++) {
		  xsum=xsum^arr[i];
		}
		return xsum;
	}
 
	public static void main(String[] args) {
		int a=16;
//		String b=Integer.toBinaryString(a);
//		int c=Integer.parseInt(b);
//	   System.out.println(a<<2);
//       System.out.println(a>>2);
//       System.out.println(getBitsAt(a,3));
//       System.out.println(setBitAt(a,2,1));
//       System.out.println(Integer.toBinaryString(2));
//       System.out.println(4&(~4));
//       System.out.println(Integer.toBinaryString(~2));
//       System.out.println(isPowerofTwo(0));
//       System.out.println(countOnes(6));
       int arr[]= {5,5,3,8,7,8,2,3,2};
//       printAllSubset(arr);
//       System.out.println(1<<3);
//       System.out.println(getUniqueNo(arr));
     
       
	}

}
