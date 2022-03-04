package govindProject;

import java.util.*;
//comparator and comparable both are interface
//comparator gives flexiblity to sort

interface Cab{
	 void Book(String source ,String destination);
}

public class Compare{
	 
	private int marks;
	private String name;
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Compare(String name,int marks){
		this.name=name;
		this.marks=marks;
		
		
	}
 public String toString() {
	 return "["+this.name +"    " + this.marks +"]";
	 
 }
// void bookcab(String Sou,String Des) {
//	Cab c=(Source ,Destination)->{
//	};
//	 System.out.println("Cab Bokked from "+Sou+" to " + Des);
	 

//}
   public static void main(String[] args) {
		List<Compare> list=new ArrayList<Compare>(); 
		list.add(new Compare("Sita",100));
		list.add(new Compare("Rita",80));
		list.add(new Compare("Geeta",90));
		list.add(new Compare("Riya",90));
		list.add(new Compare("Anu",96));
		list.add(new Compare("Anita",89));
//	   	Collections.sort(list);// to sort these sets value
	    Collections.sort(list,(o1,o2)->{
	      return o1.marks-o2.marks;
	    });
		
    	list.forEach(System.out::println);
 
    	
    	Compare st=new Compare("Ram",100);
    	
    	
//    	Cab cab=st::bookcab;
//    	cab.Book("Delhi","Jaipur");
    }

 

//@Override
//public int compareTo(Compare s) {
//    if(s.marks>this.marks)
//    	return -1;
//    if(s.marks<this.marks)
//    	return 1;
//    return this.name.compareTo(s.name);
//}

	
}
