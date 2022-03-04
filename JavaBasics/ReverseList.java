package govindProject;
import java.util.*;
public class ReverseList {
  
	public static LinkedList reverseList(LinkedList<Object> list) {
    Iterator<Object> it=list.iterator();
    LinkedList<Object> newList=new LinkedList<Object>();
    while(it.hasNext()) {
    	Object o=it.next();
    	newList.addFirst(o);
    }
    return newList;
	}
	
	public static void reverseWord(Stack<String> stack) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<Object> list=new LinkedList<Object>();
		  list.add("Govind");
		  list.add("Riya");
		  list.add("Priya");
		  list.add("Anmol");
		  list=reverseList(list);		 
		
		  
	}

}
