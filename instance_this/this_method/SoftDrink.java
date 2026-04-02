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