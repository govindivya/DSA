package govindProject;

public class KnapSackGreedy {
	public static void bubbleSort(double arr[],double price[],double weight[])
	{
		int l=arr.length;
		for(int i=0;i<l;i++)
		{
			for(int j=l-1;j>=i+1;j--)
			{
				if(arr[j]>arr[j-1])
				{
					double num=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=num;
					
					double num2=price[j];
					price[j]=price[j-1];
					price[j-1]=num2;
					
					double num3=weight[j];
					weight[j]=weight[j-1];
					weight[j-1]=num3;
				}
			}
		}
	}
	
	public static void greedy(double weight[],double price[],double capacity)
	{
		int l=price.length;
		double ratio[]=new double[l];
		for(int i=0;i<l;i++)
		{
			ratio[i]=price[i]/weight[i];
		}
		bubbleSort(ratio,price,weight);
		print(ratio);
		System.out.println();
		print(price);
		System.out.println();
		print(weight);
		
		int TotalPrice=0;
		for(int i=0;i<l;i++)
		{
			 if(weight[i]<=capacity)
			 {
				TotalPrice+= price[i];
				capacity-=weight[i];
			 }
		}
		System.out.println();
		System.out.println(TotalPrice);
	}

	public static void print(double array[])
	{
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
			
	}
	public static void main(String[] args) {
		 
        double price[]= {100,200,50,80};
        double weight[]= {10,25,2,5};
        greedy(weight,price,30);
	}

}
