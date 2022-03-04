package govindProject;

public class myC {
   public int tob(int b,int [] arr) {
	   int i;
	   for( i=0;b>0;i++) {
		   if(b%2!=0)
			   arr[i]=1;
		   else
			   arr[i]=0;
		   b=b/2;
		   
	   }
	return i;
   }
	
   public int pp(int a,int b) {
	   int arr[]=new int[20];
	   int i,tot,ex,len;
	   tot=1;
	   ex=a;
	   len=tob(b,arr);
	   for(i=0;i<len;i++) {
		   if(arr[i]==1)
			   tot=tot*ex;
		   ex=ex*ex;
	   }
	   
	   
	   
	return (tot);
	   
   }
   
	
	
	public static void main(String args[]) {
		myC a=new myC();
		System.out.println(a.pp(3, 4));
	}

}
