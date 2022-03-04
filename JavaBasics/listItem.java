package govindProject;

import java.util.*;

public class listItem <T> implements Comparator {
	
	
  public static void Find(Set<String> list) {
		
	}

	public static void main(String[] args) {
		HashSet<String> list= new HashSet<String>();
	    list.add("Ram");
		list.add("Shyam");
		list.add("Sam");
		list.add("Ramu");
		list.add("Samantha");
		list.add("Kohali");
		
		for(String str:list)
			System.out.println(str);
	}

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
