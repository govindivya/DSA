package govindProject;

public class Pizza {
    private String pizzaType,crustType,ingerdient;
    private double cost;
	public Pizza() {
		this.pizzaType="Meat";
		this.cost=6;
		this.crustType="Thin";
		this.ingerdient="";
	}
	public Pizza(String type) {
		this.pizzaType=type;
		this.cost=6;
		this.crustType="Thin";
		this.ingerdient="";
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost() {
		this.cost+=2;
	}
	
	public String getCrustType() {
		return crustType;
	}
	public void setCrustType(String crustType) {
		this.crustType = crustType; 
	}
	public String getIngerdient() {
		return ingerdient;
	}
	public void setIngerdient(String ingerdient) {
		this.ingerdient = ingerdient;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
 
	
	

}
