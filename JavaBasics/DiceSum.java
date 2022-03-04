package govindProject;
import java.util.*;;

public class DiceSum {
	public static int rod_cut(int price[],int num)
	{
		if(num==0)
			return 0;
		int q=Integer.MIN_VALUE;
		for(int i=1;i<=num;i++)
		{
			q=Math.max(q,price[i]+rod_cut(price,num-i));
		}
		return q;
	}
	public static int memoized_cut(int price[],int n)
	{
		int array[]=new int[n+1];
		for(int i=0;i<=n;i++)
			array[i]=Integer.MIN_VALUE;
		return mem_rod_cut(price,n,array);
	}
	public static int mem_rod_cut(int price[],int n,int array[])
	{
		if(array[n]>=0)
			return array[n];
		int q;
		if(n==0)
			q=0;
		else
	    q=Integer.MIN_VALUE;
		for(int i=1;i<=n;i++)
			    q=Math.max(q, price[i]+mem_rod_cut(price,n-i,array));
		
		array[n]=q;
		return q;
	}
	public static int Up_cut_Rod(int price[],int n)
	{
		int array[]=new int[n+1];
		array[0]=0;
		for(int i=1;i<=n;i++) {
		   int q=Integer.MIN_VALUE;
			for(int j=1;j<=i;j++)
			{
				q=Math.max(q,price[j]+array[i-j]);
			}
			array[i]=q;
		}
		return array[n];
	}

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int arr[]=new int[11];
	  arr[0]=0;
	  arr[1]=1;
	  arr[2]=5;
	  arr[3]=8;
	  arr[4]=9;
	  arr[5]=10;
	  arr[6]=17;
	  arr[7]=17;
	  arr[8]=20;
	  arr[9]=24;
	  arr[10]=30;
	  System.out.println(Up_cut_Rod(arr,9));
	  System.out.println(memoized_cut(arr,9));
	  System.out.println(rod_cut(arr,9));
	  
	    

	}

}
