package instance_this.this_method.class_invoking;

public class Carrom {
	
	int noOfCoins = 19;
	String material = "wood";
	
	public void info() {
		System.out.println("Carrom details");
		System.out.println("no. of coins in carrom: " + this.noOfCoins);
		System.out.println("Carrom board is made up of: " + this.material);
	}
}