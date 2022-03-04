package govindProject;
import java.util.*;
public class StrongString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		for(int i=0;i<T;i++) 
		{
			int lenght=sc.nextInt();
			int K=sc.nextInt();
			String str=sc.next();
			String str1="";
			for(int j=0;j<K;j++)
				str1+='*';
			if(str.contains(str1))
				System.out.println("Yes");
			else
				System.out.println("NO");
			
		}
		
 
		
	}

	
}
