package govindProject;

interface CylinderInterface {
	
   public double getBaseArea();
   public double getLateralArea();
   public double getTotalSurfaceArea();
   public double getVolume();
   public void setHeight(double height);
   public double getHeight();
   public void setRadius(double r);
   public double getRadius();

}

class Cylinder extends Circle implements CylinderInterface{
    double height;
	Cylinder(){
		super();
		this.height=0;
	}
	Cylinder(double radius,double height){
		super(radius);
		this.height=height;
	}
	@Override
	public double getBaseArea() {
		return super.getArea();
	}

	@Override
	public double getLateralArea() {
		return 2*Math.PI*super.getRadius()*this.height;
	}

	@Override
	public double getTotalSurfaceArea() {
		return this.getBaseArea()+this.getLateralArea();
	}

	@Override
	public double getVolume() {
		return this.height*this.getBaseArea();
	}

	@Override
	public void setHeight(double height) {
		// TODO Auto-generated method stub
		this.height=height;
		
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	@Override
	public void setRadius(double r) {
		// TODO Auto-generated method stub
		super.setRadius(r);
		
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return super.getRadius();
	}
	
	public static void main(String args[]) {
		Cylinder A=new Cylinder(20,10);
		System.out.println(A.getArea());
		System.out.println(A.getRadius());
		System.out.println(A.getTotalSurfaceArea());
		System.out.println(A.getLateralArea());
		A.setRadius(5);
		System.out.println(A.getRadius());
	}
	
}
