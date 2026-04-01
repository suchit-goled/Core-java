class Fishtank{
	
	
	String material="glass";
	double capacity=40.2;
	String shape="square";
	String waterType="fresh-water";
	boolean filterationSystem=true;
	boolean lightings=true;
	boolean aerationSystem=false;
	double temperature=16.4;
	boolean decoration=true;
	String animal="snail";
	
	
	public Fishtank(String material,double capacity,String shape,String waterType,boolean filterationSystem,
	boolean lightings,boolean aerationSystem,double temperature,boolean decoration,String animal){
		
	System.out.println("Before change:");
	System.out.println("material: " + this.material);
	System.out.println("capacity: " + this.capacity);
	System.out.println("shape: " + this.shape);
	System.out.println("waterType: " + this.waterType);
	System.out.println("filterationSystem: " + this.filterationSystem);
	System.out.println("lightings: " + this.lightings);
	System.out.println("aerationSystem: " + this.aerationSystem);
	System.out.println("temperature: " + this.temperature);
	System.out.println("decoration: " + this.decoration);
	System.out.println("animal: " + this.animal);
	
	this.material = material;
    this.capacity = capacity;
    this.shape = shape;
    this.waterType = waterType;
    this.filterationSystem = filterationSystem;
    this.lightings = lightings;
    this.aerationSystem = aerationSystem;
    this.temperature = temperature;
    this.decoration = decoration;
    this.animal = animal;
	
	
	System.out.println("\nAfter change:");
    System.out.println("material: " + this.material);
    System.out.println("capacity: " + this.capacity);
    System.out.println("shape: " + this.shape);
    System.out.println("waterType: " + this.waterType);
    System.out.println("filterationSystem: " + this.filterationSystem);
    System.out.println("lightings: " + this.lightings);
    System.out.println("aerationSystem: " + this.aerationSystem);
    System.out.println("temperature: " + this.temperature);
    System.out.println("decoration: " + this.decoration);
    System.out.println("animal: " + this.animal);
	}
	
	
}