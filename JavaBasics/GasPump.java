package govindProject;
import java.util.*;
import static java.lang.Thread.currentThread;

public class GasPump implements Runnable{

	private double  pricePerLitre, costOfGasDispensedTillNow, gasDispensedTillNow, leftGasToBeDispensed,totalAmountPaidByUser,
	totalAmountLeftPaidByUser, totalAmountOfGasToBeDispensed, deliveryPerSecond;
	private boolean isDispensing;
	
	public GasPump(double price,double deliveryPerSecond) {
		this.deliveryPerSecond=deliveryPerSecond;
		this.pricePerLitre=price;
		this.pricePerLitre=100;
		this.costOfGasDispensedTillNow=0;
		this.gasDispensedTillNow=0;
		this.totalAmountPaidByUser=0;
		this.totalAmountLeftPaidByUser=0;
		this.totalAmountOfGasToBeDispensed=0;
		this.isDispensing=false;
	}
	public GasPump(double price) {
		this.deliveryPerSecond=0.5;
		this.pricePerLitre=price;
		this.pricePerLitre=100;
		this.costOfGasDispensedTillNow=0;
		this.gasDispensedTillNow=0;
		this.totalAmountPaidByUser=0;
		this.totalAmountLeftPaidByUser=0;
		this.totalAmountOfGasToBeDispensed=0;
		this.isDispensing=false;
	}
	public GasPump() {
		this.deliveryPerSecond=0.5;
		this.pricePerLitre=100;
		this.costOfGasDispensedTillNow=0;
		this.gasDispensedTillNow=0;
		this.totalAmountPaidByUser=0;
		this.leftGasToBeDispensed=0;
		this.totalAmountLeftPaidByUser=0;
		this.totalAmountOfGasToBeDispensed=0;
		this.isDispensing=false;
	}
    public void showPricePerLitre() {
    	System.out.println("The price of gas per litre is :"+this.pricePerLitre);
    }
    public void showCostOfGasDispensed() {
    	System.out.println("The price of gas per litre is :"+this.costOfGasDispensedTillNow);
    }
    public void showGasDispensed() {
    	System.out.println("The price of gas per litre is :"+this.gasDispensedTillNow);
    }
    public void dispenseGas(double amountOfMoney) throws Exception {
    	 	this.totalAmountPaidByUser=amountOfMoney;
    	 	this.totalAmountOfGasToBeDispensed=(this.totalAmountPaidByUser/this.pricePerLitre);
    	 	this.totalAmountLeftPaidByUser=this.totalAmountPaidByUser;
    	 	this.gasDispensedTillNow=0;
    	 	this.costOfGasDispensedTillNow=0;
    	 	this.leftGasToBeDispensed=this.totalAmountOfGasToBeDispensed;
    	 	this.isDispensing=true;
    	 	System.out.println("Total amount of gas to be dispensed is :" + this.totalAmountOfGasToBeDispensed);
    }
	public void run() {
		while(this.isDispensing && this.leftGasToBeDispensed>0) {
			if(this.leftGasToBeDispensed>this.deliveryPerSecond) {	
					this.leftGasToBeDispensed-=this.deliveryPerSecond;
					this.gasDispensedTillNow+=this.deliveryPerSecond;
					this.totalAmountLeftPaidByUser-=(this.pricePerLitre)*this.deliveryPerSecond;
					this.costOfGasDispensedTillNow=this.pricePerLitre*this.gasDispensedTillNow;
					System.out.println("Amount of gas dispensed till now is "+ this.gasDispensedTillNow);
			 }
			else {
				this.gasDispensedTillNow=this.totalAmountOfGasToBeDispensed;
				this.totalAmountLeftPaidByUser=0;
				this.leftGasToBeDispensed=0;
				this.costOfGasDispensedTillNow=this.totalAmountLeftPaidByUser;
				System.out.println("Amount of gas dispensed till now is "+ this.gasDispensedTillNow);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(this.totalAmountOfGasToBeDispensed==this.gasDispensedTillNow) {
			System.out.println("Dispensing finished !😍😍😍");
		}
		else {
			System.out.println("Dispensing is stoped by user ! 😌😌😌");
		}
		this.isDispensing=false;
		return ;
	}
	public void stop() {
		this.isDispensing=false;
	}
	
    
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
	    GasPump p=new GasPump(100);
		Thread thread = new Thread(p, "T1");
		p.dispenseGas(500);
	    thread.start();
	    System.out.println(Thread.currentThread()+ " is calling run method ");
	    System.out.println("\n To stop dispensing gas write stop and hit enter");
//	    kill the running thread by p.stop() . It will stop dispensing process;
	    String s="";
	    while(!s.toLowerCase().equals("stop") && p.isDispensing) {
	    	s=sc.next();
	    	if(s.toLowerCase().equals("stop")) {
	    		p.stop();
	    	}
	    }
	    System.out.println("Main stopped !");
	      
	}
}
