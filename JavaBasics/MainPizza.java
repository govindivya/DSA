package govindProject;
import java.util.Scanner;
public class MainPizza {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("What type of pizza would you like to buy (Cheese or Meat) ?");
	 String pizzaType=sc.next();
	 
	 if(pizzaType.toLowerCase().equals("meat")) {
		 
		Pizza myPizza=new Pizza();
		System.out.println("What type of crust (thick or thin) ?");
		String crustType=sc.next();
        
		if(crustType.toLowerCase().equals("thick")) {
			myPizza.setCrustType(crustType);
			myPizza.setCost();
		}
		System.out.println("What type of ingerdient (limit one) ?");
		String ingerdient=sc.next();
		myPizza.setIngerdient(ingerdient);
		System.out.println("Your order is : ");
		System.out.println(myPizza.getPizzaType() + " pizza");
		if(crustType.toLowerCase().equals("thick")) {
			System.out.println(myPizza.getIngerdient() + " (+ $2.00)");
		}
		else {
			System.out.println(myPizza.getIngerdient());
		}
		System.out.println(myPizza.getCrustType());
		System.out.println("Total cost is $"+ myPizza.getCost());
		
		 
	  }
	 else if(pizzaType.toLowerCase().equals("cheese")) {
		 Cheese myPizza=new Cheese(); 
			System.out.println("Your order is :");
			System.out.println(myPizza.getPizzaType() + " pizza");
			System.out.println(myPizza.getCrustType()+" crust");
			System.out.println("Total cost is $"+ myPizza.getCost());
	 }
	 else {
		 System.out.println("Order a valid pizza ! Try again !");
	 }
	}

}
