class Boomer {

    String brand;
    String flavor;
    String color;
    double price;
    int quantity;
    boolean isSugarFree;
    String shape;
    double weight;
    String type;
    boolean isAvailable;

   
   
   
	public Boomer(boolean isSugarFree, String shape){
		
		this.isSugarFree = isSugarFree;
        this.shape = shape;
	}
	
	public Boomer(double price, int quantity){
		
		this.price = price;
        this.quantity = quantity;
	}
	
	public Boomer(String brand){
		
		this.isSugarFree = isSugarFree;
        this.shape = shape;
	}
	
	public Boomer(String color, double price){
		
		this.color = color;
        this.price = price;
	}


   public Boomer(String brand, String flavor, String color, double price, int quantity,
                  boolean isSugarFree, String shape, double weight, String type, boolean isAvailable) {

        System.out.println("displaying properties of Boomer");

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.isSugarFree = isSugarFree;
        this.shape = shape;
        this.weight = weight;
        this.type = type;
        this.isAvailable = isAvailable;
    }
	


    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("flavor:" + flavor);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
        System.out.println("quantity:" + quantity);
        System.out.println("isSugarFree:" + isSugarFree);
        System.out.println("shape:" + shape);
        System.out.println("weight:" + weight);
        System.out.println("type:" + type);
        System.out.println("isAvailable:" + isAvailable);
    }
}