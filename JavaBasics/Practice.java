package govindProject;
import java.util.*;
public class Practice {
	

	public static void main(String[] args) {
	 LinkedList<String> list1=new LinkedList<String>();
	 LinkedList<String> list2=new LinkedList<String>();
	 String s1[]= {"Ram","Sita","Shyam","Geeta","Gitanjali"};
	 String s2[]= {"Love","Hate","Feel","Looks"};
	 list1.add("Shri");
	 list1.offer("Riya");
	 list1.offer("Kriti");
	 Iterator<String> it=list1.iterator();
	 while(it.hasNext())
		 System.out.println(it.next());
     
	 System.out.println(list1.poll());

    
	}

}
