package govindProject;

public class Heapify {
    int arr[];
    int capacity;
    int size;
    int tail;
	public Heapify(int cap)
	{
	 capacity=cap;
	 size=0;
	 arr=new int[cap];
	 tail=cap-1;
	}
  public void addItem(int num) 
  {
	 if(size==0) 
	 {
		 arr[0]=num;
		 size++;
		 return;
	 }
	 
	 if(size<capacity) 
	 {
		int i=size;
		arr[size]=num;
		size++;
		
		while(arr[i]>arr[(i-1)/2]) 
		{
			int tem=arr[i];
			arr[i]=arr[(i-1)/2];
			arr[(i-1)/2]=tem;
			i=(i-1)/2;
	    }
	 }
	   
	 else
         System.out.println("Heap is full");

	 
	}
  
  public int deleteTop() 
  {
     if(size!=0)
     {
   	     int num=arr[0];
    	 arr[0]=arr[size-1];
    	 size--;
    	 int i=0;
    	  
    	 while(2*i+2<size&&(arr[i]<arr[2*i+1]||arr[i]<arr[2*i+2]))
    	  {
    	     if(arr[2*i+1]>arr[2*i+2]) 
    		  {
    			int temp=arr[i];
    			arr[i]=arr[2*i+1];
    			arr[2*i+1]=temp;
    			i=2*i+1;
    		  }
    		  
    	     else
    		 {
    			int temp=arr[i];
    		   	arr[i]=arr[2*i+2];
    			arr[2*i+2]=temp;
    			i=2*i+2; 
    		  }
    	  }
    	 return num;
    	   
     }
     return Integer.MIN_VALUE;
     
	 
  }
  public void addAll(int []array) {
	  for(int i=0;i<array.length;i++) 
		  this.addItem(array[i]);
	  
  }
  public void sort() {
	  int arr[]=new int[this.capacity];
	   for(int i=0;i<this.capacity;i++)
		    arr[i]=this.deleteTop();
	   this.printSortedArray(arr);
  }
  public void printSortedArray(int arr[]) {
	  for(int i=0;i<this.capacity;i++)
		  System.out.println(arr[i]);
  }
public static void main(String[] args) {
		Heapify hps=new Heapify(20);
		hps.addItem(12);
		hps.addItem(22);
		hps.addItem(32);
		hps.addItem(82);
		hps.addItem(92);
		hps.addItem(62);
		int arr[]= {10,56,90,100,200,101,123,178,167,13,167,18,89,80};
		hps.addAll(arr);
		hps.sort();

		 

	}

}
