package govindProject;

public class Example {
	
	int roll;
	Example(int a){
		this.roll=a;
	}
	public static void primitiveData(int a ) {
	a=20;	
	}
	public static void compositeData(Example A) {
		A.roll=20;
	}
	public static void main(String[] args) {
		 
    Example ex=new Example(10);
    int a=10;
    primitiveData(a);
    compositeData(ex);
    System.out.println(a); // it prints 10
    System.out.println(ex.roll); //it prints 20
	}

}
