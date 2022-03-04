package govindProject;

import java.util.Random;
import java.util.Scanner;

public class PassGen {
                                             // this program is to generate password using random class object
	 private static StringBuilder PASS;
	 private static  Random gen ;
	 public static Scanner sc = new Scanner(System.in);
	 public PassGen() {
		PASS=new StringBuilder("");
		gen=new Random();
    }
public PassGen(String A) {
	PASS=new StringBuilder("A");
	gen=new Random();
}	 
	 
	 
public static  void Pass(int n,int m) {          // password generator function
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
				System.out.println(PASS+"\n");
		        
		   }
		}
			
		 public static void main(String args[]) {
				System.out.println("Enter the number of digits in password : ");
				int num1=sc.nextInt();
				System.out.println("Enter the number of Passwords required   : ");
				int num2=sc.nextInt();
				PassGen obj1=new PassGen();
				obj1.Pass(num1,num2);
				
			}

	

}
