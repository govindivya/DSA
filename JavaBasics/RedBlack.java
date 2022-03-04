package govindProject;

public class RedBlack <T> {
    
	private Node root;
	private Node nill=null;
	private static int NodeCount=0;
	
	
	private class Node<T>{
		Node left;
		Node right;
		Node parent;
		int color;
		T data;
		Node(T data,int color){
			this.data=data;
			this.color=color;
			
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		@Override
		public String toString() {
			return "Node [left=" + left.data + ", right=" + right.data+ ", parent=" + parent.data + ", data=" + data + "]";
		}
		
	}
	public RedBlack(T data) {
		root=new Node<T>(data,0);
		root.left=null;
		root.right=null;
		
	}
	public int compare(T a,T b) {
		if(a.toString().compareTo(b.toString())>0)
			return 1;
		else 
			return 0;
	}
	public boolean contains(T data,Node<T> node) {
		 while(node!=null && node.data!=data) {
			 if(this.compare(node.data, data)>0)
				 node=node.left;
			 else
				 node=node.right;
		 }
		 return (node!=null);
		
	}
	public boolean insert(T data) {
		if(contains(data, root)) {
			return false;
		}
		else {
			root=insert(root,data);
			NodeCount++;
			update(root);
		}
		
		return true;
	}
	public Node insert(Node<T> node,T data) {
		if(node==null)
			return null;
		int cmp=this.compare(data,node.data);
		if(cmp>0) {
			node.right=insert(node.right,data);
		}
		else
			node.left=insert(node.left,data);
		update(node);
		return balance(node);
		
		
	}
	public void update(Node node) {
		if(node!=root)
			node.color=1;
		else
			node.color=0;
		if(node.parent!=null) {
			
		}
	}
   public Node balance(Node node) {
	   
	   
	   
	   
	   return node;
   }
	public static void main(String[] args) {
		 

	}

}
