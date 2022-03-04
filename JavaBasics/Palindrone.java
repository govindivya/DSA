package govindProject;

import java.util.Scanner;

public class Palindrone {               // this program is to check whether the given string is palindrome or not;
	 String var;
	public static Scanner sc=new Scanner(System.in);
	

public Palindrone(String a) {
	var=a;

	}
public static boolean isPalindrone(String A) {
	char[] arr=new char[A.length()];
	char [] arr1=new char[A.length()];
	boolean check = false;
	int l=A.length();
	for(int i=0;i<A.length();i++)
		arr1[i]=A.charAt(i);
	for(int i=0;i<A.length();i++) {
		arr[i]=A.charAt(l-i-1);
	}
	for(int i=0;i<A.length();i++) {
		if(arr[i]==arr1[i])
			check=true;
	}
	return check;
	
}

	public static void main(String[] args) {
	while(true)	{
		System.out.println("\nEnter the string to check ");
		String str=sc.nextLine();
		Palindrone A=new Palindrone(str);
		
		System.out.print(isPalindrone(A.var));
	}

	}

}
