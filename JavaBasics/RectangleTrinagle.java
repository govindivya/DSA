package govindProject;
import java.util.*;
public class RectangleTrinagle {

	
	public static void getRandomPoint() {
	  double ymin=-75 , ymax=75,xmin=-25,xmax=25;
	  double x=Math.random()*50-25;
	  double y=Math.random()*150-75;
	  
	  System.out.println("The generated random point inside the rectangle is ( "+ x+ " "+y+" )");
	
	}
	public static void getPerimeter(double x1,double y1,double x2, double y2,double x3, double y3) {
		    double d1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		    double d2=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		    double d3=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));

//		    if((d1+d2<d3)||(d2+d3<d1)||(d3+d1)<d2){
//		        System.out.println("Inputs are invalid");
//		        return;
//		    }
//		    else{
//		        System.out.println("The perimeter of triangle is "+(d1+d2+d3));
//		        return;
//		    }	
		    System.out.println(d1+ " "+d2+" "+d3);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3;
		System.out.println("Enter the coordinates of first edge ");
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		System.out.println("Enter the coordinates of second edge ");
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		System.out.println("Enter the coordinates of third edge ");
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		getPerimeter(x1,y1,x2,y2,x3,y3);
		getRandomPoint();

	}

}
