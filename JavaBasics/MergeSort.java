package govindProject;

import java.math.BigInteger;
import java.util.Random;

public class MergeSort {
	
	public static void main(String[] args) {
 
		BigInteger A=new BigInteger("100");
		BigInteger B=new BigInteger("1000");
		Random rnd = new Random();
		int l=B.bitLength();
		int l1=A.bitLength();
		BigInteger C= new BigInteger(l,rnd);
		while(C.compareTo(A)<0|| C.compareTo(B)>0)
			C=new BigInteger(l,rnd);

				System.out.println("the values is "+C);
	}

}
 