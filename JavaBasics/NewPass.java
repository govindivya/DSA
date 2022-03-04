package govindProject;

import java.util.Random;
import java.util.Scanner;

public class NewPass {
	 private static Random rnd = new Random();
	 public static Scanner sc=new Scanner(System.in);


	public NewPass() {
	
	}
public void Pass(int n,int m) {
	String str = " ABCDEFGHIJKLMNOPQRSTUVWXYabcdefghijklmnopqrstuvwxyz123456780!@#$%^&*></\"";
	char[]ch=new char[n];
	for(int j=0;j<m;j++) {
		System.out.println("\n\nthe "+(j+1)+"  password is ");
	for(int i=0;i<n;i++) {
		ch[i]=str.charAt(rnd.nextInt(str.length()));
		System.out.print(ch[i]);
          }
	}
	
}
public static void main(String args[]) {
	NewPass A=new NewPass();
	System.out.println("Enter the number of terms in password");
	int num=sc.nextInt();
	System.out.println("Enter the number of passwords required");
	int num1=sc.nextInt();
	A.Pass(num,num1);
	
}



}
