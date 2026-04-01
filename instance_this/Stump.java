class Stump{
	//declaring i-variables
	String material="wood";
	boolean withLights=true;
	double diameter=3.5;
	double height=4;
	double weight=6.7;
	boolean isBailsSupported=true;
	int noOfBails=2;
	boolean baseSpike=true;
	boolean impactSensitivity=false;
	double price=3500.0;
	
	//constructor declaration with parameter
	
	public Stump(String material,boolean withLights,double diameter,double height,double weight,boolean isBailsSupported,int noOfBails,boolean baseSpike,
	boolean impactSensitivity,double price){
		
		//printing the statments and changing the values from the default values using this 
		
		//before the value are changed 
		System.out.println("Before change:");
        System.out.println("material: " + this.material);
        System.out.println("withLights: " + this.withLights);
        System.out.println("diameter: " + this.diameter);
        System.out.println("height: " + this.height);
        System.out.println("weight: " + this.weight);
        System.out.println("isBailsSupported: " + this.isBailsSupported);
        System.out.println("noOfBails: " + this.noOfBails);
        System.out.println("baseSpike: " + this.baseSpike);
        System.out.println("impactSensitivity: " + this.impactSensitivity);
        System.out.println("price: " + this.price);
		
		//values changed through the parameters 
		this.material=material;
		this.withLights=withLights;
		this.diameter=diameter;
		this.height=height;
		this.weight=weight;
		this.isBailsSupported=isBailsSupported;
		this.noOfBails=noOfBails;
		this.baseSpike=baseSpike;
		this.impactSensitivity=impactSensitivity;
		this.price=price;
	
		System.out.println("    ");
		//printing those values
		System.out.println("After change:");
        System.out.println("material: " + this.material);
        System.out.println("withLights: " + this.withLights);
        System.out.println("diameter: " + this.diameter);
        System.out.println("height: " + this.height);
        System.out.println("weight: " + this.weight);
        System.out.println("isBailsSupported: " + this.isBailsSupported);
        System.out.println("noOfBails: " + this.noOfBails);
        System.out.println("baseSpike: " + this.baseSpike);
        System.out.println("impactSensitivity: " + this.impactSensitivity);
        System.out.println("price: " + this.price);
			
		
		
		
	}
	
	
	
	
	
}