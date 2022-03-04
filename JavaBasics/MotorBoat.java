package govindProject;

import java.util.*;

public class MotorBoat {

	private double fuelCapacity,currentAmoutOfFuel,maxSpeed,currentSpeed,efficiency,distanceTravelled;
	public MotorBoat(double efficiency,double fuelCapacity,double maxSpeed) {
		this.efficiency=efficiency;
		this.fuelCapacity=fuelCapacity;
		this.maxSpeed=maxSpeed;
		this.currentAmoutOfFuel=0;
		this.currentSpeed=0;
		this.distanceTravelled=0;
	}

 
	public double getCurrentAmoutOfFuel() {
		return currentAmoutOfFuel;
	
	}
    public void fillTheFuel(double fuel) {
    	if(this.currentAmoutOfFuel+fuel<=this.fuelCapacity) {
    		this.currentAmoutOfFuel+=fuel;
    		System.out.println("The fuel has been filled ! . Now amount of fuel is "+ this.currentAmoutOfFuel+"L");
 
    	}
    	else {
    		System.out.println("The given fuel is out of the capacity ! ");
    	}
    }
	public void operateBoatUptoTime(double time) {
		if(this.currentAmoutOfFuel>=(this.efficiency*this.currentSpeed*time)) {
			this.distanceTravelled+=time*this.currentSpeed;
			this.currentAmoutOfFuel-=(this.efficiency*this.currentSpeed*time);
			System.out.println("You can travel upto your destination . Happy journey !");
		}
		else {
			double t=this.currentAmoutOfFuel/(this.efficiency*this.currentSpeed);
			System.out.println("Please refill the fuel to reach the destination beacuse you can travel only to "+ t + " time at the current speed of  "+ this.currentSpeed);
		}
	}
	public void setSpeed(double speed) {
		if(this.maxSpeed>=speed) {
			this.currentSpeed = speed;
			System.out.println("Your boat speed is changed to " + speed);
		}
		else {
			System.out.println("Over speed !");
		}
	}
 
	public double getDistanceTravelled() {
		return distanceTravelled;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		MotorBoat b=new MotorBoat(1,500000,150);
		b.fillTheFuel(20000);
		b.setSpeed(100);
		b.operateBoatUptoTime(10);
		System.out.println("The left fuel is "+b.getCurrentAmoutOfFuel());
		System.out.println("Distance travelled by boat is "+b.getDistanceTravelled());
	}

}
