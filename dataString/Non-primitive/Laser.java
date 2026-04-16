class Laser {

    String brand;
    String type;
    double power;
    String color;
    double wavelength;
    boolean isPortable;
    double price;
    String usage;
    int batteryLife;
    String material;

    Laser(String brand, String type, double power, String color,
          double wavelength, boolean isPortable, double price,
          String usage, int batteryLife, String material) {

        this.brand = brand;
        this.type = type;
        this.power = power;
        this.color = color;
        this.wavelength = wavelength;
        this.isPortable = isPortable;
        this.price = price;
        this.usage = usage;
        this.batteryLife = batteryLife;
        this.material = material;
    }

	void display() {
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("Power: " + power);
		System.out.println("Color: " + color);
		System.out.println("Wavelength: " + wavelength);
		System.out.println("Portable: " + isPortable);
		System.out.println("Price: " + price);
		System.out.println("Usage: " + usage);
		System.out.println("Battery Life: " + batteryLife);
		System.out.println("Material: " + material);
	}
}