package govindProject;

interface CircleInterface {
public double getArea();
public double getRadius();
public double getCircumference();
public void setRadius(double r);
}
public class Circle implements CircleInterface {
    private double radius;
    
	public Circle() {
		this.radius=0;
	}
	
   public Circle(double r) {
	   this.radius=r;
    }
   
	public double getArea() {
	   return Math.PI*this.radius*this.radius;
	}
    public double getCircumference() {
    	return 2*Math.PI*this.radius;
    }
	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double r) {
		this.radius=r;	
	}

}
