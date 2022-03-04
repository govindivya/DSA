package govindProject;

import java.util.ArrayList;
import java.util.Scanner;


public class MoneyLoot {
	
	 public static void subset(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> sub, int index)
	{
	    res.add(sub);
	    for (int i = index; i < A.size(); i++)
	    {
	        sub.add(A.get(i));
	        subset(A, res, sub, i + 1);
	        sub.remove(sub.size()-1);
	    }
	    return;
	}
	public static  ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
	{
		ArrayList<Integer> sub =new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
	    int index = 0;
	    subset(A, res, sub, index);
	  
	    for(int i=0;i<res.size();i++)
		{
			for(int j=0;j<res.get(i).size();j++)
			{
				System.out.print(res.get(i).get(j)+" ");
			}
			System.out.println();
		}
	    return res;
	}

 
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> A=new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		ArrayList<ArrayList<Integer>> arr=subsets(A);
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.get(i).size();j++)
			{
				System.out.print(arr.get(i).get(j)+" ");
			}
			System.out.println();
		}
		System.out.print(false);
	}

}
