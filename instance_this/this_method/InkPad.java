class InkPad {

    String brand;
    String color;
    String type;
    double price;
    String size;
    boolean isRefillable;
    String inkType;
    String shape;
    boolean isWaterproof;
    boolean isAvailable;

    public InkPad(String brand, String color, String type, double price, String size,
                  boolean isRefillable, String inkType, String shape,
                  boolean isWaterproof, boolean isAvailable) {

        System.out.println("displaying properties of InkPad");

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.size = size;
        this.isRefillable = isRefillable;
        this.inkType = inkType;
        this.shape = shape;
        this.isWaterproof = isWaterproof;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("type:" + type);
        System.out.println("price:" + price);
        System.out.println("size:" + size);
        System.out.println("isRefillable:" + isRefillable);
        System.out.println("inkType:" + inkType);
        System.out.println("shape:" + shape);
        System.out.println("isWaterproof:" + isWaterproof);
        System.out.println("isAvailable:" + isAvailable);
    }
}