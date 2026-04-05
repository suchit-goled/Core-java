class Umbrella {

    String brand;
    String color;
    String size;
    double price;
    boolean isFoldable;
    String material;
    int ribs;
    boolean isWaterproof;
    String type;
    boolean isAvailable;


	public Umbrella(String size, double price,boolean isFoldable, String material, int ribs) {

        System.out.println("displaying properties of Umbrella");

        
        this.size = size;
        this.price = price;
		this.isFoldable=isFoldable;
        this.material = material;
        this.ribs = ribs;
       
    }
	
	public Umbrella(String brand,boolean isWaterproof, String type, boolean isAvailable) {

        System.out.println("displaying properties of Umbrella");

        this.brand = brand;
        this.isWaterproof = isWaterproof;
        this.type = type;
        this.isAvailable = isAvailable;
    }
	
	public Umbrella(String brand,boolean isFoldable, String material,boolean isAvailable, int ribs) {

        System.out.println("displaying properties of Umbrella");

        this.brand = brand;
        this.isFoldable = isFoldable;
        this.isAvailable = isAvailable;
		this.material=material;
		this.ribs=ribs;
    }
	
	
	public Umbrella( double price,boolean isFoldable, int ribs) {

        System.out.println("displaying properties of Umbrella");


        this.price = price;
		this.isFoldable=isFoldable;
        this.ribs = ribs;
        
    }
    public Umbrella(String brand, String color, String size, double price,
                    boolean isFoldable, String material, int ribs,
                    boolean isWaterproof, String type, boolean isAvailable) {

        System.out.println("displaying properties of Umbrella");

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.isFoldable = isFoldable;
        this.material = material;
        this.ribs = ribs;
        this.isWaterproof = isWaterproof;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("size:" + size);
        System.out.println("price:" + price);
        System.out.println("isFoldable:" + isFoldable);
        System.out.println("material:" + material);
        System.out.println("ribs:" + ribs);
        System.out.println("isWaterproof:" + isWaterproof);
        System.out.println("type:" + type);
        System.out.println("isAvailable:" + isAvailable);
    }
}