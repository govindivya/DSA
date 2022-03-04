package govindProject;

public class Graph {
    Node nodes[];
    int size;
	Graph(int num){
		nodes=new Node[num];
		size=num;
		for(int i=0;i<size;i++)
			nodes[i]=new Node(i+1,size);
	}
	private class Node{
		double connectTo[][];
	    double value;
		Node(double num,int size){
		value=num;
		connectTo=new double [2][size];
		for(int i=0;i<size;i++) {
			this.connectTo[0][i]=0;
		    this.connectTo[1][i]=0;	
		}
	   }
		public boolean connectIt(int num1,double weight) {
		   if(num1<this.connectTo.length) {
			this.connectTo[0][num1]=num1; 
			this.connectTo[1][num1]=weight;
			return true;
		  }
		   return false;
		}
		public boolean deleteIt(int num) {
		        int k=-1;
				for(int i=0;i<this.connectTo.length;i++) {
				if(this.connectTo[0][i]==num)
					k=i;
				  }
				
				if(k!=-1) {
				this.connectTo[0][num]=0;
				this.connectTo[1][num]=0;
				return true;
				}
					
		return false;
		}
		
	}

	public boolean connectTo(int num1,int num2,double weight) {
	    
	     boolean added=this.nodes[num1].connectIt(num2,weight);
		return added;
		 
	     
	}
	public boolean deleteBond(int num1,int num2) {
		boolean check= this.nodes[num1].deleteIt(num2);
		return check;
	}
	
	public static void main(String[] args) {
		Graph g=new Graph(10);
		System.out.println(g.connectTo(1, 2,9));
		System.out.println(g.deleteBond(1, 8));
		

	}

}
