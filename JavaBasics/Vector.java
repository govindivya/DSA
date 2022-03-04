package govindProject;
import java.util.*;
public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   java.util.Vector<Integer> v1=new java.util.Vector<>();
   v1.setSize(20);
   v1.add(0,1);
   v1.setSize(100);

   System.out.println(v1.capacity());

	}

}
