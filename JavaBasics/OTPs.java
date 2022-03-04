package govindProject;

import java.util.Random;
import java.util.Scanner;

public class OTPs {                        // this program is generate otp using stringbuilder and random class objects;
	Random rnd;
	StringBuilder Str;

	public OTPs() {
		rnd = new Random();
		Str=new StringBuilder("");
	
	}
	public OTPs(String A) {
		rnd = new Random();
		Str=new StringBuilder(A);
	}
void otpGenerator(int n,int m){             // OTP generator;
	for(int i=0;i<n;i++) {
		Str.delete(0,Str.length());
		for(int j=0;j<m;j++) {
			this.Str=Str.append(rnd.nextInt(10));
		}
		System.out.println("\nthe "+i+"th  OTP is " +Str);
	}
	
	
}

	public static void main(String[] args) {
		Scanner  Sc=new Scanner(System.in);
		System.out.println("Enter the no of digit in otp");
		int digit=Sc.nextInt();
		System.out.println("Enter the no of otp required ");
		int num=Sc.nextInt();
		OTPs A=new OTPs();
		A.otpGenerator(num, digit);
      
	}

}
