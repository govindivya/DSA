package govindProject;

import java.math.BigInteger;

public class NFriends {
	
	public static int MakeChoice(int n,int arr[])
	{
		if(n==1||n==2)
		{
			arr[n]=n;
			return n;
		}
		if(arr[n]!=-1)
		{
			return arr[n];
		}
		arr[n]=(MakeChoice(n-1,arr))+ (n-1)*MakeChoice(n-2,arr);
		return arr[n];
	}

	public static void main(String[] args) {
		 int arr[]=new int[51];
		 for(int i=0;i<51;i++)
			 arr[i]=-1;
		 System.out.println(MakeChoice(15,arr));
//		 BigInteger i=new BigInteger();

	}

}
