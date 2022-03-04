package govindProject;
import java.util.*;

public class test {
	
  
		  
	 	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println();
			long t=sc.nextLong();
			while(t-->0){
				long n=sc.nextLong();
				long mult_of_4=n/4;
				long rem=n%4;
				long ans=0;
				if(n==1)
					ans=20;
				else if(n==2)
				ans=2*(6+5+4+3);
				else if(n==3)
					ans=2*(6+5+4+3)+6+5+4;
				else if(n>=4) {
					if(rem==0) {
						ans+=4*(6+5)*mult_of_4;
						ans+=4*4;
						 
						
					}
					else if(rem==1) {
					ans+=4*(6+5)*mult_of_4;
					ans+=3*4;
					ans+=6+5+4+3+2;
					}
					else if(rem==2) {
						ans+=4*(6+5)*mult_of_4;
						ans+=2*4;
						ans+=2*(6+5+4+3);
						}
					else if(rem==3) {
						ans+=4*(6+5)*mult_of_4;
						ans+=4;
						ans+=2*(6+5+4+3)+6+5+4;
						}
				}
				System.out.println(ans);
			}
		}
	    


}
