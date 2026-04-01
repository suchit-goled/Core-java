class VRBox{
	
	String brand = "sony";
    double price = 5000;
    String type = "wireless";
    boolean hasController = true;
    double weight = 1.2;
    String color = "black";
    int warranty = 1;
    boolean hasSensors = true;
    String resolution = "1080p";
    boolean bluetooth = true;
	
	public VRBox(String brand, double price, String type, boolean hasController, double weight,
                 String color, int warranty, boolean hasSensors, String resolution, boolean bluetooth){
			
		System.out.println("Before change:");
        System.out.println("brand: " + this.brand);
        System.out.println("price: " + this.price);
        System.out.println("type: " + this.type);
        System.out.println("hasController: " + this.hasController);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("warranty: " + this.warranty);
        System.out.println("hasSensors: " + this.hasSensors);
        System.out.println("resolution: " + this.resolution);
        System.out.println("bluetooth: " + this.bluetooth);
		
		this.brand = brand;
        this.price = price;
        this.type = type;
        this.hasController = hasController;
        this.weight = weight;
        this.color = color;
        this.warranty = warranty;
        this.hasSensors = hasSensors;
        this.resolution = resolution;
        this.bluetooth = bluetooth;
		
		System.out.println("  ");
		System.out.println("After change:");
        System.out.println("brand: " + this.brand);
        System.out.println("price: " + this.price);
        System.out.println("type: " + this.type);
        System.out.println("hasController: " + this.hasController);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("warranty: " + this.warranty);
        System.out.println("hasSensors: " + this.hasSensors);
        System.out.println("resolution: " + this.resolution);
        System.out.println("bluetooth: " + this.bluetooth);
	}
}