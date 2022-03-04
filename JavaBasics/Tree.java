package govindProject;
import java.util.Comparator;

public class Tree{
	Node root;

	public Tree(Integer A) {
	  root =new Node();
	  root.data=A;
	  root.leftchild=null;
	  root.rightchild=null;
	  
	}
	private class Node{
//		Node parent;
		Node leftchild;
		Node rightchild;
		Integer data;
		
	}
	public boolean addNode(Integer A) {
		Node n=new Node();
		n.data=A;
		
		if(root==null)
			root=n;
		Node p=root;
		Node c=root;
		 
		n.rightchild=null;
		n.leftchild=null;
		while(c!=null){
			p=c;
			if(A.intValue()<c.data.intValue())
				c=c.leftchild;
			else 
				c=c.rightchild;
			}
		if(A.intValue()<p.data.intValue()) 
			p.leftchild=n;
		
		else 
			p.rightchild=n;
		
		return true;
		
	}
	public void showAll(Node p) {
		  if(p!=null) {
			 System.out.println(" "+p.data);
			 showAll(p.leftchild);
			 showAll(p.rightchild);
		 }
		
	}
	
  public Node findParentNode(Integer A) {
	  Node check=this.findNode(A);
	  if(check!=null) {
		  Node a,b,c;
		  a=b=c=root;
		  if(A.intValue()==root.data.intValue())
			  return null;
		  while(c!=null) {
			  a=c;
			  if(A.intValue()>c.data.intValue())
				  c=c.rightchild;
			  else if(c.data.intValue()>A.intValue())
				  c=c.leftchild;
			  else 
				  break;
			  b=a;
		 }
		  return b;
	   } 
	return null;  
  }

  public Node findNode(Integer A) {
	  Node c=root;
	  while(c!=null) {
		  if(A.intValue()==c.data.intValue())
		  	  break;
		  else if(A.intValue()>c.data.intValue())
			  c=c.rightchild;
		  else
			  c=c.leftchild;
	  }
	  return c;
  }
  public boolean Delete(Integer value) {
	  if(this.root==null)
		  return false;
	  if(value==null)
		  return false;
	  Node x=this.findNode(value);
	  if(x==null)
		  return false;
	  Node y=x;
	  Node z=x;
	  while(x!=null) {
		  y=x;
		  x=x.rightchild;
	  }
	  x=y;
	  Integer par=null;
	  if(y.leftchild!=null) 
		  par=y.leftchild.data;
	 
	  while(z!=y) {
		  z.data=z.rightchild.data;
		  z=z.rightchild;
	  }
	  y.leftchild=null;
	  y.data=par;
	  
	  
	 return true;		  
	  
  }
	public static void main(String[] args) {
       Tree tree=new Tree(Integer.valueOf(12));
       tree.addNode(Integer.valueOf(14));
	   tree.addNode(Integer.valueOf(17));
	   tree.addNode(Integer.valueOf(11));
	   tree.addNode(Integer.valueOf(9));
	   tree.addNode(Integer.valueOf(19));
	   tree.addNode(Integer.valueOf(6));
	   tree.showAll(tree.root);
	   System.out.println();
	   tree.Delete(Integer.valueOf(14));
	   tree.Delete(Integer.valueOf(17));
	   tree.showAll(tree.root);
   
   
	    
	 }

}
