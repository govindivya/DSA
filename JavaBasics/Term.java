package govindProject;
import java.util.*;
interface Terms{
	public Term add(Term A);
	public Term multiply(Term B);
	public Term subtract(Term C);
	public Term divide(Term D);
	
}
public class Term  implements Terms {
	
   int coefficient,power;
   
	
	Term() {
		this.coefficient=2;
		this.power=3;
	}
    Term(int c,int p) {
	   this.coefficient=c;
	   this.power=p;
   }

 
   public String toString() {
	  return ""+coefficient+"x^"+power+"";
	}
   
	@Override
	public Term add(Term A) {
		 if(A.power==this.power) {
			 this.coefficient+=A.coefficient;
		 return new Term(this.coefficient,this.power);
		}
		 else {
			 System.out.println("The power of both Terms should be same");
			 return this;
		 }
	}

   @Override
   public Term multiply(Term A) { 	 
		 if(A.power==this.power) {
			 this.coefficient*=A.coefficient;
		 return new Term(this.coefficient,this.power);
		}
		 else {
			 System.out.println("The power of both Terms should be same");
			 return this;
		 }
   }
   @Override
   public Term subtract(Term A) {
		 if(A.power==this.power) {
			 this.coefficient-=A.coefficient;
		 return new Term(this.coefficient,this.power);
		}
		 else {
			 System.out.println("The power of both Terms should be same");
			 return this;
		 }
	
   }
   @Override
   public Term divide(Term A) {
		 if(A.power==this.power) {
			 this.coefficient/=A.coefficient;
		 return new Term(this.coefficient,this.power);
		}
		 else {
			 System.out.println("The power of both Terms should be same");
			 return this;
		 }
	
   }
public static int r(int p) {
	if(p<7) {
		return p+r(p+1);
	}
	else {
		return 2;
	}
}
 
    public static void main(String args[]) {
	 Term a=new Term(2,5);
	 System.out.println(r(4));
  
	 
    }
 }
