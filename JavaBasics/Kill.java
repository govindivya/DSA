package govindProject;

import java.util.Scanner;

public class Kill {
   
	DoublyLinked lk=new DoublyLinked(Integer.valueOf(1));
	 
   
 public  void getSolution() {
    Node x=this.lk.head;
    Node y=x;
	while(this.lk.size!=1) {
	   y=x;
	   x=x.next.next;
	   this.lk.deleteNode(y.next.data);
	   
	}	
	System.out.println(y.data);
		
		
		
    }
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     Kill obj =new Kill();
     for(int i=2;i<=9;i++)
    	 obj.lk.insertTail(i);
     obj.getSolution();
//     System.out.println(obj.lk.size);
//     obj.lk.printAll();
 
	}

}
