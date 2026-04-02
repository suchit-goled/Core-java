class Chain {

    String material;
    String color;
    double length;
    double weight;
    double price;
    String type;
    String brand;
    boolean isGoldPlated;
    String design;
    boolean isFlexible;

    public Chain(String material, String color, double length, double weight, double price,
                 String type, String brand, boolean isGoldPlated, String design, boolean isFlexible) {

        System.out.println("displaying properties of Chain");

        this.material = material;
        this.color = color;
        this.length = length;
        this.weight = weight;
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.isGoldPlated = isGoldPlated;
        this.design = design;
        this.isFlexible = isFlexible;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("material:" + material);
        System.out.println("color:" + color);
        System.out.println("length:" + length);
        System.out.println("weight:" + weight);
        System.out.println("price:" + price);
        System.out.println("type:" + type);
        System.out.println("brand:" + brand);
        System.out.println("isGoldPlated:" + isGoldPlated);
        System.out.println("design:" + design);
        System.out.println("isFlexible:" + isFlexible);
    }
}