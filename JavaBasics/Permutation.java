package govindProject;

import java.util.*;

public class Permutation {
	public static int arrsize;
	public static int n=0;
	public static String []array;
	public static String swap(String str,int i,int j) {
		char[]a=str.toCharArray();
		char ch=a[i];
		a[i]=a[j];
		a[j]=ch;
		return String.valueOf(a);
	}
	public static void Permut(String str,int start , int end) {
		if(start==end) {
			array[n]=str;
			n++;
			}
		else
		{
			for(int i=start;i<=end;i++) {
				 str=swap(str,start,i);
				 Permut(str,start+1,end);
			   	 str=swap(str,start,i);
			}
		}	
	}
public static void Print() {
	System.out.println(" There are total " + arrsize + " permutation but the  distinct pemutation of given string are");
	for(int i=0;i<array.length;i++) {
	    boolean check = false;
		for(int j=i+1;j<array.length;j++) {
	     if(array[i].equals(array[j]))
	    	 check=true;
	     }
		if(check==false)
			System.out.println(array[i]);
	}	
}
public static int fact(int n) {
	if(n==0||n==1)
	   return 1;
	else 
		return n*fact(n-1);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String ");
	String st=sc.next();
	int len=st.length();
	arrsize=fact(len);
	array=new String[arrsize];
	Permut(st,0,st.length()-1);
	Print();
	
}


}
