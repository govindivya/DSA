package govindProject;

public class AVL <T>{
	
    private Node root;
    int nodeCount=0;
	public AVL(T value) {
		root=new Node<T>(value);
		nodeCount++;
		
	}
	
	
	private class Node<T>{
		Node left,right;
		int height;
		T data;
		int bf;
		Node(T value){
			this.data=value;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public int getBf() {
			return bf;
		}
		public void setBf(int bf) {
			this.bf = bf;
		}
		@Override
		public String toString() {
			return "Node [height=" + height + ", data=" + data + ", bf=" + bf + "]";
		}
		 
	}
	
	public boolean insert(T value) throws Exception {
		if(value==null)
			return false;
		if(!contains(root, value)) {
		root=insert(root,value);
		nodeCount++;
		return true;
		}
		return false;
		
	}
	public Node<T> insert(Node<T> node,T value) throws Exception {
		if(node==null) 
			return new Node<T>(value);
		int cmp=this.compare(value,node.data);
		if(cmp>=0) 
			node.right=insert(node.right,value);
		else 
			node.left=insert(node.left,value);
		
		update(node);
		return balance(node);
		
	}
	public void update(Node node) {
		int lh=-1;
		int rh=-1;
		if(node.left!=null)
			lh=node.left.height;
		if(node.right!=null)
			rh=node.right.height;
		node.height=1+Math.max(lh, rh);
		node.bf=rh-lh;
		
	}
	public Node balance(Node node) {
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
	public Node<T> leftLeftCase(Node<T> node) {
		
		return rightRotate(node);
		
	}
	public Node leftRightCase(Node node) {
		node.left=leftRotate(node.left);
		return leftLeftCase(node);
		
	}
	public Node<T> rightRightCase(Node<T> node) {
		return leftRotate(node);
		
	}
	public Node rightLeftCase(Node node) {
		node.right=rightRotate(node.right);
		return rightRightCase(node);
		
	}
	public Node<T> rightRotate(Node<T> A) {
		Node<T> B=A.left;
		A.left=B.right;
		B.right=A;
		 
		update(A);
		update(B);
		return B;
		
	}
	public Node<T> leftRotate(Node<T> A) {
		Node<T> B=A.right;
		A.right=B.left;
		B.left=A; 
		update(A);
		update(B);
		return B;
	}
	public boolean contains(Node<T> node,T value) {
	   while(node!=null) {
		   int cmp=compare(value,node.data);
		   if(cmp>0)
			   node=node.right;
		   else if(cmp<0)
			   node=node.left;
		   else if(cmp==0)
			   return true;
	   }
	   return false;
			
	}
	public boolean remove(T value) {
		if(value==null)
			return false;
		if(contains(root,value)) {
			root=remove(root,value);
			nodeCount--;
			return true;
		}
		return false;
		
	}
	public Node<T> remove(Node<T> node,T value) {
		if(node==null)
			return null;
		int cmp=compare(value,node.data);
		if(cmp<0)
			node.left=remove(node.left,value);
		else if(cmp>0)
			node.right=remove(node.right,value);
		else {
			if(node.left==null)
				return node.right;
			else if(node.right==null)
				return node.left;
			else {
				if(node.right.height<node.left.height) {
					T succesor=(T) findMax(node.left);
					node.data=succesor;
					node.left=remove(node.left,succesor);
					
				}
				else {
					T succesor=(T) findMin(node.left);
					node.data=succesor;
					node.right=remove(node.right,succesor);
				}
			}
		}
		update(node);
		return balance(node);
	}
	 
	public int compare(T value1,T value2) {
		return value1.toString().compareTo(value2.toString());
	}
	public T findMax(Node<T> node) {
		while(node.right!=null)
			node=node.right;
		return node.data;
	}
	public T findMin(Node<T> node) {
		while(node.left!=null)
			node=node.left;
		return node.data;
	}
	public int getNodeCount() {
		return nodeCount;
	}
	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}
	public void printALL(Node node) {
		if(node!=null) {
			System.out.println(node.data);
			this.printALL(node.left);
			this.printALL(node.right);
			
		}
	}
	public static void main(String[] args) throws Exception {
		 
    AVL<Integer> avl=new AVL<Integer>(56);
    avl.insert(25);
    avl.insert(45);
    avl.insert(56);
    avl.insert(23);
    avl.insert(67);
    avl.insert(89);
    avl.insert(10);
//    avl.insert(9);
    avl.insert(8);
    avl.printALL(avl.root);

    
	}

}
