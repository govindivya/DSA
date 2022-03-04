package govindProject;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class PassWord {                              // generating password using stringBuilder and random class objects;
	 private StringBuilder PASS=new StringBuilder();
	private  Random gen = new Random();
	static Scanner sc = new Scanner(System.in);

public void Pass(int n, int m) {
	String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	String allchar="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789@#$%^&*.?/|_~";
	
	for(int j=0;j<m;j++) {
		int l=PASS.length();
	    if(l!=0)
		    PASS.delete(0,l);
		System.out.println("the "+(j+1)+" password is : ");
		
		for(int i=0;i<n;i++) {
		    char c;
		       if(i<=1) {
			       c= alpha.charAt(gen.nextInt(alpha.length()-1));
			       PASS.append(c);
		}
		    else {
			   c=allchar.charAt(gen.nextInt(allchar.length()-1));
			   PASS.append(c);
		}
     }
		System.out.println(PASS);
		System.out.println("\n");
        
   }
}
	
 public static void main(String args[]) {
		System.out.println("Enter the number of digits in password : ");
		int num1=sc.nextInt();
		System.out.println("Enter the number of Passwords required   : ");
		int num2=sc.nextInt();
		PassWord obj1=new PassWord();
		obj1.Pass(num1,num2);
		
	}

}
