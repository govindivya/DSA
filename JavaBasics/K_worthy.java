package govindProject;

public class K_worthy {
  
	public static void preProcessor(int mat[][],int key) {
		long Aux[][]=new long[mat.length][mat[0].length];
		
		for(int i=0;i<mat[0].length;i++)
			Aux[0][i]=mat[0][i];
		
		for(int i=1;i<mat.length;i++)                         // row wise sum
			for(int j=0;j<mat[0].length;j++)
				Aux[i][j]=mat[i][j]+Aux[i-1][j];
		
		for(int i=0;i<mat.length;i++)                   // coloumn wise sum
			for(int j=1;j<mat[0].length;j++)
				Aux[i][j]+=Aux[i][j-1];
	    int N=mat.length;
	    int M=mat[0].length;
	    for(int len=1;len<=N;len++)
	    {
	      	
	    }
		
	}
//	public static int sumQuery(int aux[][],int tli,int tlj,int rbi,int rbj) {
//		int res=aux[rbi][rbj];
//		if(tli>0)
//			res+=aux[tli-1][rbj];
//		if(tlj>0)
//			res-=aux[rbj][rbj-1];
//		if(tli>0&&tlj>0)
//			res+=aux[tli-1][tlj-1];
//		return res;
//	}
//	
	public static void printMat(int mat[][]) {
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{5,6,7},
				      {8,5,8},
				      {8,6,3}}; 
		preProcessor(arr,5);
	 
	}

}
