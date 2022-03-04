package govindProject;

public class Compettitve1 {
	
	public static void Test(String num,int size,int divisor) {
		System.out.println(num); 
		int max=0;
		int k=0;
		for(int i=0;i<size;i++) {
			String s=num.substring(0,i)+num.substring(i+1,size);
		    int number=Integer.parseInt(s);
		    max=Math.max(max,number%divisor);
		}
		System.out.println(max);
		 
	}
	

	public static void main(String[] args) {
		String num="175";
		Test(num,3,5);

	}

}
