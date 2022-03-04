package govindProject;

import java.util.Scanner;

public class Query {
	 
	public static queue q;
	
	public static void  doQuery(int arr[]) {

     while(q.size!=0)
	  {
			 arr[(int)q.dequeue()]++;
			 if((int)q.peek()+1<arr.length)
				 arr[(int)q.dequeue()+1]--;
			  
	   }
	  int sum=0;
	  for(int i=0;i<arr.length;i++)
	   {
			 sum+=arr[i];
			 System.out.print(sum+" ");
		}
		  
	}

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);	 
	 System.out.println("Enter number of query ");
	int array[]=new int[11];
	for(int i=0;i<11;i++)
		array[i]=0;
    q=new queue(6);
	q.enqueue(1);
	q.enqueue(3);
	q.enqueue(2);
	q.enqueue(5);
	q.enqueue(6);
	q.enqueue(9);
	 
	doQuery(array);
	 
	 
//	 for(int i=1;i<=query;i++)
//	 {
//		 st.push(sc.nextInt());
//		 st.push(sc.nextInt());
//	 }
	 
	}

}
