package govindProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Johny {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int T=sc.nextInt();
		int N[]=new int[T];
		int P[][]=new int[T][];
		int J[]=new int[T];
		for(int i=0;i<T;i++) 
		{
		  N[i]=sc.nextInt();
		  P[i]=new int[N[i]];
		  for(int j=0;j<N[i];j++)
		  {
			  P[i][j]=sc.nextInt();
		  }
		  J[i]=sc.nextInt();
		}
		for(int i=0;i<T;i++) 
		{ 
		 int songIndex=J[i]-1;
		 int songValue=P[i][songIndex];
		 ArrayList<Integer> a=new ArrayList();
	     for(int t=0;t<P[i].length;t++)
	     {
	    	 a.add(Integer.valueOf(P[i][t]));
	     }
	     Collections.sort(a);
	     for(int t=0;t<P[i].length;t++)
	     {
	    	 P[i][t]=a.get(t);
	     }
		 int newIndex=a.indexOf(Integer.valueOf(songValue));
		 System.out.println(newIndex+1);
		}
		

	}

}
