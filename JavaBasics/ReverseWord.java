package govindProject;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stack<String> st=new Stack<String>();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter line !");
		  String line=sc.nextLine();
		  String [] arr=line.split(" ");
		  
		  for(int i=0;i<arr.length;i++) {
			  st.push(arr[i]);
		  }
		  
		  while(!st.isEmpty()) {
			  System.out.println(st.pop().toString());
		  }
	}

}
