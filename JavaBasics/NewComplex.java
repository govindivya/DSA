 package govindProject;

public class NewComplex {
	private double img;
	private double real;
	
	

public NewComplex() {
		real=0;         // constructor
		img=0;
	}
	
public void setValues(double re,double im) {  // set method
	    real=re;
		img=im;
	}
public String  getValues() {   // get method
	return ""+real+"  + "+img+"i";
}
public static void Sum(NewComplex A1,NewComplex A2) {   // sum method
	double realsum=A1.real+A2.real;
	double imgsum=A1.img+A2.img;
	if(imgsum>=0)
	    System.out.println("The sum of given numbers is : "+ realsum +" + "+ imgsum+"i" );
	else
		System.out.println("The sum of given numbers is : "+ realsum +" - "+ Math.abs(imgsum)+"i" );
}	
public static void Subtract(NewComplex A1,NewComplex A2) {   // difference method
	double realdiff=A1.real-A2.real;
	double imgdiff=A1.img-A2.img;
	if(imgdiff>0)
	  System.out.println("The difference of given numbers is : "+ realdiff +" + "+ imgdiff+"i" );
	else
		System.out.println("The difference of given numbers is given as : "+ realdiff+" - "+Math.abs(imgdiff)+"i");
}
public static void Show(NewComplex A) {
	if(A.img>0)
     	System.out.println("The given complex  number  is  : "+A.real+" + "+A.img+"i");
	else
		System.out.println("The given  complex number is : "+A.real+" - "+Math.abs(A.img)+"i");
	
	
	
}
public static void main(String args[]) {
	double real1=Double.parseDouble(args[0]);
	double img1=Double.parseDouble(args[1]);
	double real2=Double.parseDouble(args[2]);
	double img2=Double.parseDouble(args[3]);
    
	NewComplex s1= new NewComplex();
    NewComplex s2=new NewComplex();
    
    s1.setValues(real1,img1);
    s2.setValues(real2, img2);
    s1.Show(s1);
    s1.Show(s2);
    s1.Sum(s1, s2);
    s1.Subtract(s1, s2);
   
    

}

}
