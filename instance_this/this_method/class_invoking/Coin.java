class Coin{
	
	int number=10;
	String material="aluminium";
	double diameter=3.3;

	void info(){
		
		System.out.println("executing no arg const in coin");
		System.out.println("executing details of coin");
		System.out.println("coin number:"+this.number);
		System.out.println("coin is made up of:"+this.material);
		System.out.println("diameter of the coin:"+this.diameter);
		
	}
	
}