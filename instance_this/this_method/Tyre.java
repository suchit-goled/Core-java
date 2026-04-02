class Tyre {

    String brand;
    String type;
    String size;
    double price;
    boolean isTubeless;
    String vehicleType;
    String material;
    int durability;
    boolean isAllWeather;
    boolean isAvailable;

    public Tyre(String brand, String type, String size, double price,
                boolean isTubeless, String vehicleType, String material,
                int durability, boolean isAllWeather, boolean isAvailable) {

        System.out.println("displaying properties of Tyre");

        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
        this.isTubeless = isTubeless;
        this.vehicleType = vehicleType;
        this.material = material;
        this.durability = durability;
        this.isAllWeather = isAllWeather;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("type:" + type);
        System.out.println("size:" + size);
        System.out.println("price:" + price);
        System.out.println("isTubeless:" + isTubeless);
        System.out.println("vehicleType:" + vehicleType);
        System.out.println("material:" + material);
        System.out.println("durability:" + durability);
        System.out.println("isAllWeather:" + isAllWeather);
        System.out.println("isAvailable:" + isAvailable);
    }
}