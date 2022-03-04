package govindProject;
import java.math;
public class AVLTree<T extends Comparable<T>> {
	
	
	private class Node<T>{
		T data;
		int height;
		int bf;
		Node left ,right;
		public Node(T value) {
			this.data=value;
		}
		public int getHeight() {
			return this.height;
		}
		
	}
	private Node root;
	private int nodeCount=0;
	public int height() {
		
		if(root==null)
			return 0;
		else
			return root.height;
		
	}
	public int size() {
		return nodeCount;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public boolean contains(T value) {
		return contains(this.root,value);
	}
	public boolean contains(Node node,T value) {
		if(node==null)
			return false;
		int cmp= compare(value,(T) node.data);
		if(cmp<0)
			return contains(node.left,value);
		if(cmp>0)
			return contains(node.right,value);
		 
		
		return true;
		
	}
	public boolean insert(T value) {
		if(value==null)
			return false;
		if(!contains(root,value)) {
		  root=insert(root,value);
		  nodeCount++;
		  return true;
		}
		return false;
		
	}
	public Node<T> insert(Node<T> node,T value) {
		if(node==null)
			return new Node<T>(value);
		int cmp=compare(value,node.data);
		if(cmp<0)
			node.left=insert(node.left,value);
		else
			node.right=insert(node.right,value);
		update(node);
		return balance(node);
	}
	private void update(Node node) {
		int leftNodeHeight=(node.left==null)?-1:node.left.height;
		int rightNodeHeight=(node.right==null)?-1:node.right.height;
		node.height=1+Math.max(leftNodeHeight, rightNodeHeight);
		node.bf=rightNodeHeight-leftNodeHeight;
		
	}
	private Node balance(Node node) {
		if(node.bf==-2) {
			if(node.left.bf<=0)
				return leftLeftCase(node);
			else 
				return leftRightCase(node);
		}
		else if(node.bf==+2) {
			if(node.right.bf>=0)
				return rightRightCase(node);
			else 
				return rightLeftCase(node);
		}
		return node;
		
	}
	private Node<T> leftLeftCase(Node<T> node) {
		return rightRotation(node);
	}
	private Node leftRightCase(Node node) {
		node.left=leftRotation(node.left);
		return leftLeftCase(node);
	}
	private Node<T> rightRightCase(Node<T> node) {
		return leftRotation(node);
	}
	private Node rightLeftCase(Node node) {
		node.right=rightRotation(node.right);
		return rightRightCase(node);
	}
	private Node<T> leftRotation(Node<T> node) {
		Node<T> newParent=node.right;
		node.right=newParent.left;
		newParent.left=node;
		update(node);
		update(newParent);
		return newParent;
	}
	private Node<T> rightRotation(Node<T> node) {
		Node<T> newParent=node.left;
		node.left=newParent.right;
		newParent.right=node;
		update(node);
		update(newParent);
		return newParent;
	}
	
	public boolean remove(T elem) {
		if(elem==null)
			return false;
		if(contains(root,elem)) {
			root=remove(root,elem);
			nodeCount++;
			return true;
		}
		return false;
		
	}
	public Node<T> remove(Node<T> node,T elem) {
		if(node==null)
			return null;
		int  cmp=compare(elem,(node.data));
		if(cmp<0)
			node.left=remove(node.left,elem);
		else if(cmp>0)
			node.right=remove(node.right,elem);
		else {
			if(node.left==null)
				return node.right;
			else if(node.right==null)
				return node.left;
			else {
				if(node.left.height>node.right.height) {
					T succ_value=(T) findMax(node.left);
					node.data=succ_value;
					node.left=remove(node.left,succ_value);
					
				}
				else {
					T succ_value=(T) findMin(node.right);
					node.data=succ_value;
					node.right=remove(node.right,succ_value);
					
				}
			}
				
		}
		update(node);
		return balance(node);
	}
	private T findMin(Node<T> node) {
		while(node.left!=null)
			node=node.left;
		return node.data;
		
		
	}
	private T findMax(Node<T> node) {
		while(node.right!=null)
			node=node.right;
		return node.data;
		
	}
	
 
    public int compare(T node1,T node2) {
    	String s1=node1.toString();
    	String s2=node2.toString();
    	
    	if(s1.compareTo(s2)>0)
    		return 1;
    	else if(s1.compareTo(s2)<0)
    		return -1;
    	else return 0;
    	
    }
    public String toString() {
    	return this.root.toString();
    }
    public void printAll(Node node) {
    	 if(node!=null) {
    		System.out.println(node.data);
    		printAll(node.left);
    		printAll(node.right);
    	}
    }
    public static void main(String args[]) {
    	AVLTree<Integer> t1=new AVLTree<Integer>();
    	t1.insert(79);
    	t1.insert(56);
    	t1.insert(54);
    	t1.insert(45);
    	t1.insert(29);
    	t1.insert(20);
    	t1.insert(90);
    	t1.insert(100);
    	t1.printAll(t1.root);
    	
    		
    	}
    }


