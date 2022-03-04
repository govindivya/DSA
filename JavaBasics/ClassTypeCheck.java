package govindProject;

public class ClassTypeCheck {
	private int roll;
	private String name;
	static String className;
	int keyValue;

	public ClassTypeCheck(String name,int roll) {
		 this.name=name;
		 this.roll=roll;
		 
	}
	public String toString() {
		return this.name+ "    " + this.roll;
	}
	public class Inner{
		int roll;
		String name;
		int p=keyValue;
		String classN=className;
		Inner(int roll,String name){
			this.name=name;
			this.roll=roll;
			
		}
		public String getName() {
			return this.name;
		}
		public int getRoll() {
			return this.roll;
		}
		public String toString() {
			return this.name+ "    " + this.roll;
		}
	}
	
	static class Innerstatic{
		int roll;
		String name;
		String cl=className;
	
		static {
			System.out.println("This is Innerstatic block");
		}
		Innerstatic(int n,String na){
			this.name=na;
			this.roll=n;
			
		}
		public String getName() {
			return this.name;
		}
		public int getRoll() {
			return this.roll;
		}
		public String toString() {
			return this.name+ "    " + this.roll;
		}
	}

	public static void main(String[] args) {
		 ClassTypeCheck A=new ClassTypeCheck("Amit",190786);
		 ClassTypeCheck.Innerstatic B=new ClassTypeCheck.Innerstatic(180786,"Aman");
		 ClassTypeCheck.Inner C=A.new Inner(109786,"Anushka");
		 System.out.println(A);
		 System.out.println(B);
		 System.out.println(C);
		 

	}

}
