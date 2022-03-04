package govindProject;

public class GEn {
private int arr[];
public GEn(int n) {
	arr=new int[n];
	
}
public void Fibbo(GEn A) {
	A.arr[0]=0;
	A.arr[1]=1;
	int n=A.arr.length;
	for(int i=2;i<n;i++) {
		A.arr[i]=A.arr[i-1]+A.arr[i-2];
		
	}
}
public void print(GEn A) {
	
	for(int i=0;i<A.arr.length;i++) 
		System.out.print(A.arr[i]+" ");
	}
		



}
