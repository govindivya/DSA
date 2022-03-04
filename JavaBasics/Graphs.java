package govindProject;
import java.util.*;

public class Graphs {
	LinkedList<Node> list;
	Node root;
	int nodesCount=0;
	int edgeCount=0;
	
	private class Node{
		int data;
		LinkedList<Integer> friends;
		
		Node(int val){
		    data=val;
		    friends= new LinkedList<Integer>();
		}
	}
  
 
  
  Graphs(int val){
    	list=new LinkedList<Node>();
    	root=new Node(val);
    	list.add(root);
    	nodesCount++;
    }
  
  public LinkedList<Integer> getFriends(int x){          //return list of friends of node x;
    	Iterator it=this.list.iterator();
    	LinkedList<Integer> list1=new LinkedList<Integer>();
    	while(it.hasNext())
    	{
    	   Node n=(Node) it.next();
    	   if(n.data==x) {
    		  
    		   for(int i=0;i<n.friends.size();i++)
    		   {
    			   list1.add(n.friends.poll());
    		   }
    	   }
    	   
    	}
    	return list1;
    	
    }
  public Node getNode(int x) {
	  Iterator<Node> it=list.iterator();
	  
	  while(it.hasNext())
	  {
		 Node a=(Node)it.next();
		 if(a.data==x) 
		 {
			return a; 
		 }
	  }
	  return null;
  }
 public void makeFriends(int x,int y) {
	 if(!this.isContains(x))
	 {
		 System.out.println(x+ " does not exists ,first Create "+ x+ " then make friends "); 
	 }
	 if(!this.isContains(y))
	 {
		 System.out.println(y +"  does not exists ,first Create " + y+ " then make friends "); 
	 }
	 
	 
	 if(!this.isContains(x)&&!this.isContains(y))
	 {
		 System.out.println(x+ " and " +y + " does not exists ,Create "+ x + " and " + y+ " then make friends ");
	 }
	 
	 if(!areFriend(x,y))
	 {
		 Iterator it=list.iterator();
		 Node m=null;
		 Node n=null;
			
			while(it.hasNext())
			{
				Node s=(Node)it.next();
			    if(s.data==x)
			    	n=s;
			    if(s.data==y)
			    	m=s;
			}
			if(n!=null&m!=null)
			{
				m.friends.add(x);
				n.friends.add(y);
				this.edgeCount++;
			}
			 
			return ;
	  }
	 System.out.println(x+"  and  "+ y+ "  are already friends  ");
	}
 
 
 
 boolean areFriend(int x,int y) {
	Iterator it=list.iterator();
	Node m=null;
	Node n=null;
	while(it.hasNext())
	{
		Node s=(Node)it.next();
	    if(s.data==x)
	    	n=s;
	    if(s.data==y)
	    	m=s;
	}
	if(n!=null&m!=null)
	{
	  Iterator i=n.friends.iterator();
	  while(i.hasNext())
	  {
		  if(i.next().equals(y))
			  return true;
	  }
	}
	 
	 
	 return false;
 }
 public boolean isContains(int x) {
	 Iterator it=list.iterator();
	 while(it.hasNext())
	 {
		 Node n=(Node)it.next();
		 if(n.data==x)
			 return true;
	 }
	 return false;
 }
 public void createNode(int x) {
	 Node n=new Node(x);
	 list.add(n);
	 this.nodesCount++;
 }
 public void showAllFriends(int x) {
	 Iterator it=list.iterator();
	 Node n=null;
	 while(it.hasNext())
	 {
		 Node s=(Node)it.next();
		 if(s.data==x)
		 {
			 n=s;
			 break;
		 }
			 
	 }
	 if(n!=null)
	 {
	     int num=n.friends.size();
	     Object[] array=n.friends.toArray();
	     for(int i=0;i<array.length;i++)
	     {
	    	 System.out.println(array[i]);
	     }
		 return ;
	 }
		 
	 System.out.println("No friend exists now , please make friends");
 }
 void areFriend_of_friends(int x ,int y) {
	 java.util.Queue<Node> q=(java.util.Queue<Node>) new queue();
	  
	 Iterator<Node> it=list.iterator();
	 while(it.hasNext())
	 {
		Node s=it.next();
		Iterator it1=s.friends.iterator();
		
	 }
	 
}
 public  boolean []BFS()
 {
	  Iterator<Node> it=this.list.iterator(); // iterator to list
	  queue q =  new queue(nodesCount);
	  
	  boolean visit[]=new boolean[nodesCount];
	  for(int i=0;i<nodesCount;i++)
		  visit[i]=false;
	  q.enqueue(root.data);
	  while(!q.isEmpty())
	  {
		  Integer node=(Integer) q.dequeue();
		  Node n=this.getNode(node);
		  Iterator<Integer>it1=n.friends.iterator();
		  visit[node]=true;
		 
		 
		  while(it1.hasNext())
		  {
		     int num=it1.next();
			 if(visit[num]==false)
				  q.enqueue(num);
		 } 
			  
	 }
	 return visit;
 }

public static void main(String[] args) {
	
  Graphs g=new Graphs(0);
  g.createNode(1);
  g.createNode(2);
  g.createNode(3);
  g.createNode(4);
  g.createNode(5);
  g.createNode(6);
  g.createNode(7);
  g.makeFriends(0, 1);
  g.makeFriends(1, 2);
  g.makeFriends(2, 3);
  g.makeFriends(3, 4);
  g.makeFriends(4, 5);
  g.makeFriends(5, 6);
  g.makeFriends(6,7);
//  g.makeFriends(7, 0);
  boolean bfs[]=g.BFS();
  for(int i=0;i<bfs.length;i++) 
  {
	  if(bfs[i]==true)
		  System.out.println("Node " + i+ " is visited");
	  else
		  System.out.println("Node " + i+ " is not visited");
  }	  
 System.out.println("Node count is "+ g.nodesCount);
 System.out.println("Edge count is "+ g.edgeCount);



	}

}
