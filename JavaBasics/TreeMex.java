package govindProject;

import java.util.Iterator;
import java.util.LinkedList;

class Tuple {
	
	Integer tuple[];
	
	Tuple(int n)
	{
		tuple=new Integer[n];
		for(int i=0;i<n;i++)
			tuple[i]=null;
		
	}
	
	void setTuple(int array[])
	{
		int count=0;
		for(int i=0;i<tuple.length;i++)
		{
		   if(!isPresent(array[i]))
		   {
			   tuple[count]=array[i];
			   count++;
		   }
		}
	}
	boolean isPresent(int num)
	{
		for(int i=0;i<tuple.length;i++)
		{
			if(tuple[i]!=null)
			{
				if(tuple[i]==num)
					return true;
			}
			
		}
		return false;
		
	}
	void printTuple()
	{
		for(int i=0;i<tuple.length;i++)
			System.out.print(tuple[i]+" ");
	}
}

public class TreeMex {
	public static void  swap(int array[],int i,int j)
	{
		int num=array[i];
		array[i]=array[j];
		array[j]=num;
				 
	}

	public static void permute(LinkedList ls,int array[],int l,int r)
	{
		// it craetes permutation of a given array and add it to linkedlist;
		 if(l==r)
		 {
			int newArray[]=new int[array.length];
			for(int i=0;i<array.length;i++)
				newArray[i]=array[i];
			ls.add(newArray);
			return;
		 }
		 
			
		  for(int i=l;i<=r;i++)
		  { 
			  swap(array,l,i);
			  permute(ls,array,l+1,r);
			  swap(array,l,i);
		  }
			  
	 }
	
	

	public static void main(String[] args) {
//		 Tuple t=new Tuple(10);
		 int array[]=new int[10];
		 for(int i=0;i<10;i++)
			 array[i]=i;
//		 t.setTuple(array);
//		 t.printTuple();
		LinkedList<Integer[]> ls=new LinkedList();
		permute(ls,array,0,array.length-1);
		Iterator<Integer[]> it=ls.iterator();
		while(it.hasNext())
		{
		   Integer arr[]=it.next();
		   for(int i=0;i<arr.length;i++)
			   System.out.print(arr[i]+" ");
		   System.out.println();
		}
		
		

	}

	 

}
