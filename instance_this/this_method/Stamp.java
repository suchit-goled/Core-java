class Stamp {

    String brand;
    String type;
    String shape;
    String color;
    double price;
    String size;
    boolean isSelfInking;
    String material;
    String usage;
    boolean isAvailable;

    public Stamp(String brand, boolean isSelfInking, String material) {

        System.out.println("displaying properties of Stamp");

        this.brand = brand;
        this.isSelfInking = isSelfInking;
        this.material = material;
		}	

    public Stamp(double price,String material,String usage, boolean isAvailable) {

        System.out.println("displaying properties of Stamp");

      
        this.price = price;
        this.material = material;
        this.usage = usage;
        this.isAvailable = isAvailable;}
		
    public Stamp(boolean isAvailable) {

        System.out.println("displaying properties of Stamp");

		this.isAvailable = isAvailable;}
		
    public Stamp(double price, String usage) {

        System.out.println("displaying properties of Stamp");

       
        this.price = price;
        this.usage = usage;
		}
    
	public Stamp(String brand, String type, String shape, String color, double price,
                 String size, boolean isSelfInking, String material,
                 String usage, boolean isAvailable) {

        System.out.println("displaying properties of Stamp");

        this.brand = brand;
        this.type = type;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.size = size;
        this.isSelfInking = isSelfInking;
        this.material = material;
        this.usage = usage;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("type:" + type);
        System.out.println("shape:" + shape);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
        System.out.println("size:" + size);
        System.out.println("isSelfInking:" + isSelfInking);
        System.out.println("material:" + material);
        System.out.println("usage:" + usage);
        System.out.println("isAvailable:" + isAvailable);
    }
}