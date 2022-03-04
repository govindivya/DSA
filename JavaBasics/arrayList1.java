package govindProject;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class arrayList1 {

	public arrayList1() {
		
	}
public static void main(String args []) {
	ArrayList <Integer> arr=new ArrayList<Integer>();
	arr.add(Integer.valueOf(4));
	arr.add(1,3);
	Stack A= new Stack();
	A.push("1");
	A.push("2");
	A.push("3");
	System.out.println(A.get(1));
	System.out.println(A.get(1));
	A.add("4");
	Integer i=(Integer)A.get(1);
	A.add(3, "Priya");
	System.out.println(A.get(3));
	System.out.println(A.get(4));
	
	}
}
