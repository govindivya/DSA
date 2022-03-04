package govindProject;
class Node{
	Node prev , next;
	Integer data;
	
	
}
public class DoublyLinked {
     Node head;
     int size=0;
	
    public DoublyLinked() {
    		head=new Node();
    		head.prev=head.next=null;
    		head.data=null;
    		
    		}  
  public Node getHead() {
		return head;
	}

public DoublyLinked(Integer a) {
	head=new Node();
	head.prev=head.next=head;
	head.data=a;
	this.size=1;

	
	}
   public boolean insertTail(Integer value) {
	   Node node =new Node();
	   node.data=value;
	   size++;
	   if(head.prev==null) {
		   node.next=head;
		   node.prev=head;
		   head.next=head.prev=node;
		   return true;
	   }
	   else {
		   Node n=head.prev;
		   node.next=head;
		   node.prev=n;
		   n.next=node;
		   head.prev=node;
		   return true;
	   }
	 
   }
   public void insertHead(Integer value) {
	   Node node =new Node();
	   node.data=value;
	   node.next=head;
	   node.prev=head.prev;
	   head.prev.next=node;
	   head.prev=node;
	   head=node;
	   size++;
     }
   public boolean deleteNode(Integer value) {
	   if(head==null)
		   return false;
	   size--;
	   if(head.data.equals(value)) {
		   head.prev.next=head.next;
		   head.next.prev=head.prev;
		   head=head.next;
		   return true;
		}
	   Node x=head.next;
	   while(x!=head) {
		   if(x.data.equals(value))
			   break;
		   x=x.next;
	   }
	   if(x==head)
		   return true;
	   else {
		   x.prev.next=x.next;
	      x.next.prev=x.prev;
	      x=x.next;
	     return true;
	    }
	   
   }

   public void printAll() {
	 Node a=head.next;
	 System.out.println(head.data);
	 while(a.next!=head) {
		 System.out.println(a.data);
		 a=a.next;
	 }
	 System.out.println(a.data);
   }
   
   public void addAll(Integer[] arr) {
	   for(int i=0;i<arr.length;i++) {
		   this.insertHead(arr[i]);
	   }
   }
   
	public static void main(String[] args) {
	System.out.println();
	Integer arr[]=new Integer[20];
	for(int i=0;i<20;i++) {
		arr[i]=Integer.valueOf(1);
	}
    DoublyLinked l=new DoublyLinked(Integer.valueOf(1));
    l.insertHead(Integer.valueOf(1));
    l.insertHead(Integer.valueOf(2));
    l.insertHead(Integer.valueOf(11));
    l.insertHead(Integer.valueOf(12));
    l.deleteNode( Integer.valueOf(11));
    l.deleteNode( Integer.valueOf(12));
    l.addAll(arr);
    l.printAll();
	}

}
