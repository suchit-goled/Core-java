class SoftDrink {

    String brand;
    String flavor;
    String color;
    double price;
    int quantity;
    boolean isCarbonated;
    String size;
    double volume;
    String packaging;
    boolean isAvailable;

    
	 public SoftDrink(String brand, String flavor, boolean isAvailable) {

        System.out.println("displaying properties of SoftDrink");

        this.brand = brand;
        this.flavor = flavor;
        this.isAvailable = isAvailable;
    }
	
	 public SoftDrink( double price, int quantity) {

        System.out.println("displaying properties of SoftDrink");

       
        this.price = price;
        this.quantity = quantity;
    }
	
	 public SoftDrink(int quantity,boolean isCarbonated) {

        System.out.println("displaying properties of SoftDrink");

       
        this.quantity = quantity;
        this.isCarbonated = isCarbonated;
       
    }
	
	 public SoftDrink(String brand, double volume, boolean isAvailable) {

        System.out.println("displaying properties of SoftDrink");

        this.brand = brand;
        this.volume = volume;
        this.isAvailable = isAvailable;
    }
	
	public SoftDrink(String brand, String flavor, String color, double price, int quantity,
                     boolean isCarbonated, String size, double volume, String packaging, boolean isAvailable) {

        System.out.println("displaying properties of SoftDrink");

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.isCarbonated = isCarbonated;
        this.size = size;
        this.volume = volume;
        this.packaging = packaging;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("flavor:" + flavor);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
        System.out.println("quantity:" + quantity);
        System.out.println("isCarbonated:" + isCarbonated);
        System.out.println("size:" + size);
        System.out.println("volume:" + volume);
        System.out.println("packaging:" + packaging);
        System.out.println("isAvailable:" + isAvailable);
    }
}