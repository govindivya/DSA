package govindProject;

public class queue {
	Integer arr[];
	int size=0;
	int capacity;
	int rear=-1;
	int front=-1;
	

	public queue() {
		// TODO Auto-generated constructor stub
		capacity=50;
		arr=new Integer[50];
		
	}
	public queue(int num) {
		capacity=num;
		arr =new Integer[num];
	}
	 
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size<capacity;
	}
	public boolean enqueue(Integer num) { 
		    if(front==-1)
		    	front=0;
			size++;
			rear=(rear+1)%capacity;
			arr[rear]=num;
			
			return true;
		
	}
	public Object dequeue() {
		if(isEmpty()==false) {
			Integer num=arr[front];
			size--;
			front=(front+1)%capacity;
            return num;
			
		}
		else 
			return Boolean.valueOf(false);
	}
	public Integer peek() {
		if(size!=0)
		  return arr[front];
		else 
			return null;
	}
	public void printAll() {
		if(size>0) 
		for(int i=front;i<=rear;i++) 
			System.out.println(arr[i]);
		
		else 
			System.out.println("Empty Queue");
	}
	public Object find(Integer num) {
		if(size!=0) {
		for(int i=front;i<=rear;i++) {
			if(num.equals(arr[i]))
				return "found at "+i+" position";
		}}
		 
		return "Not found";
	}
	public boolean replace(Integer num1,Integer num2) {
		if(size!=0) {
		for(int i=front;i<=rear;i++) {
			if(arr[i].equals(num1))
				arr[i]=num2;
			return true;
		}
	}
	 
		return false;
	 
  }
	public String remove(Integer num) {
		if(size!=0) {
			for(int i=front;i<=rear;i++) 
				if(arr[i].equals(num)) {
					for(int j=i;j<rear;j++) {
						arr[j]=arr[j+1];
					    arr[rear]=null;
					    rear--;
					}
				return "removed";
			}
		}
		return "Value not found in queue"	;		
			
	}
	public static void main(String[] args) {
		queue q=new queue(50);
		q.enqueue(Integer.valueOf(20));
		q.enqueue(Integer.valueOf(100));
		q.enqueue(Integer.valueOf(39));
		q.enqueue(Integer.valueOf(50));
	    q.enqueue(Integer.valueOf(56));
	    q.printAll();
	    System.out.println(q.peek());
	    System.out.println(q.size);
	    System.out.println(q.capacity);
	    System.out.println(q.rear);
	    System.out.println(q.front);
	    System.out.println(q.dequeue());
	    System.out.println(q.peek());
	    System.out.println(q.size);
	    System.out.println(q.capacity);
	    System.out.println(q.rear);
	    System.out.println(q.front);
	    
		 
		 
		 
		 
	   
	     

	}

}
