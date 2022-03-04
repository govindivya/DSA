package govindProject;

public class linklist {
      Node head;
      
	public linklist(Object item) {
	   head=new Node();
	   head.data=item;
	   head.next=null;
	 }
	
	class Node {
		Node next;
		Object data;
	}
  public boolean addItem(Object item) {
	  Node n=new Node();
	  n.data=item;
	  Node m=head;
	  while(m.next!=null){
		  m=m.next;
	  }
	  m.next=n;
	  n.next=null;
	  return true;
  }
  public boolean deleteItem(Object item) {
	     Node x=head;
		  Node y=head;
		  while(true) {
			  if(y.data.equals(item)||y.next==null) 
				  break;
			  else {
				  x=y;
				  y=y.next;
		     }
	      }
		  
		  if(y!=null) {
			  x.next=y.next;
			  return true;
		  }
		  
	 return false;
  }
  
  public boolean addAtHead(Object item) {
	  Node n=new Node();
	  n.data=item;
	  n.next=head;
	  head=n;
	  return true;
  
  }
  public void reverse() {
	  Node current=head;
	  Node next=null;
	  Node previous=null;
	  while(current!=null) {
		 next=current.next;
		 current.next=previous;
		 previous=current;
		 current=next;
		 
	  }
	  head=previous;
  }
  public void printAll() {
	  Node n=head;
	  while(n.next!=null) {
		  System.out.println(n.data);
		  n=n.next;
	  }
	  System.out.println(n.data);
  }
	  
	  
	 public static void main(String[] args) {
       linklist l=new linklist("11");
       System.out.println(l.addItem("12"));
       l.addItem("13");
       l.addItem("14");
       l.addItem("15");
       l.printAll();
       l.deleteItem("12");
       System.out.println();
       l.reverse();
       l.printAll();
      

	}

}
