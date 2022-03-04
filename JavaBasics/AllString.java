package govindProject;

public class AllString {

	
	
	public static int getAllSub(String str,String output[]) {
		if(str.length()==0) {
			output[0]="";
			return 1;
		}
		int out=getAllSub(str.substring(1),output);
		for(int i=0;i<out;i++)
		{
			output[i+out]=str.charAt(0)+output[i];
		}
		return 2*out;
	}
	public static void allSubstring(String str) {
		if(str.length()==0)
			System.out.println();
		allSubstring(str.substring(1));
		System.out.println(str.charAt(0));
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(0));
		
	}
	
	public static void main(String[] args) {
		 
        String str[]=new String[100];
        int num=getAllSub("ABCD",str);
        for(int i=0;i<num;i++)
        	System.out.println(str[i]);
	}

}
