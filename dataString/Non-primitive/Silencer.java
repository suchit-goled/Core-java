class Silencer {

    String brand;
    String material;
    double weight;
    String type;
    double price;
    String vehicleType;
    boolean isNoiseReduced;
    double length;
    String color;
    int durability;

    Silencer(String brand, String material, double weight, String type,
             double price, String vehicleType, boolean isNoiseReduced,
             double length, String color, int durability) {

        this.brand = brand;
        this.material = material;
        this.weight = weight;
        this.type = type;
        this.price = price;
        this.vehicleType = vehicleType;
        this.isNoiseReduced = isNoiseReduced;
        this.length = length;
        this.color = color;
        this.durability = durability;
    }

    void display() {
		System.out.println("==========");
		System.out.println("Brand: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Weight: " + weight);
		System.out.println("Type: " + type);
		System.out.println("Price: " + price);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Noise Reduced: " + isNoiseReduced);
		System.out.println("Length: " + length);
		System.out.println("Color: " + color);
		System.out.println("Durability: " + durability);
}
}