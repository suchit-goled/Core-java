class Tissue {

    String brand;
    String type;
    int layers;
    double price;
    String color;
    boolean isSoft;
    int packSize;
    String fragrance;
    double length;
    String usage;

    Tissue(String brand, String type, int layers, double price, String color,
           boolean isSoft, int packSize, String fragrance, double length, String usage) {

        this.brand = brand;
        this.type = type;
        this.layers = layers;
        this.price = price;
        this.color = color;
        this.isSoft = isSoft;
        this.packSize = packSize;
        this.fragrance = fragrance;
        this.length = length;
        this.usage = usage;
    }

  void display() {
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    System.out.println("Layers: " + layers);
    System.out.println("Price: " + price);
    System.out.println("Color: " + color);
    System.out.println("Soft: " + isSoft);
    System.out.println("Pack Size: " + packSize);
    System.out.println("Fragrance: " + fragrance);
    System.out.println("Length: " + length);
    System.out.println("Usage: " + usage);
	}
}