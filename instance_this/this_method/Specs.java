class Specs {

    String brand;
    String color;
    String frameType;
    String lensType;
    double price;
    boolean isPolarized;
    String shape;
    String size;
    String material;
    boolean isFlexible;

    public Specs(String brand, String color, String frameType, String lensType, double price,
                 boolean isPolarized, String shape, String size, String material, boolean isFlexible) {

        System.out.println("displaying properties of Specs");

        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.isPolarized = isPolarized;
        this.shape = shape;
        this.size = size;
        this.material = material;
        this.isFlexible = isFlexible;
    }

    void specs() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("color:" + color);
        System.out.println("frameType:" + frameType);
        System.out.println("lensType:" + lensType);
        System.out.println("price:" + price);
        System.out.println("isPolarized:" + isPolarized);
        System.out.println("shape:" + shape);
        System.out.println("size:" + size);
        System.out.println("material:" + material);
        System.out.println("isFlexible:" + isFlexible);
    }
}