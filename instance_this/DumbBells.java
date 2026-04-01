class DumbBells {

    String material = "iron";
    double weight = 10.0;
    String type = "fixed";
    String color = "black";
    boolean adjustable = false;
    String gripType = "rubber";
    double price = 2000.0;
    String brand = "local";
    int warranty = 1;
    boolean rustProof = true;

    public DumbBells(String material, double weight, String type, String color, boolean adjustable,
                     String gripType, double price, String brand, int warranty, boolean rustProof) {

        System.out.println("Before change:");
        System.out.println("material: " + this.material);
        System.out.println("weight: " + this.weight);
        System.out.println("type: " + this.type);
        System.out.println("color: " + this.color);
        System.out.println("adjustable: " + this.adjustable);
        System.out.println("gripType: " + this.gripType);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("rustProof: " + this.rustProof);

        this.material = material;
        this.weight = weight;
        this.type = type;
        this.color = color;
        this.adjustable = adjustable;
        this.gripType = gripType;
        this.price = price;
        this.brand = brand;
        this.warranty = warranty;
        this.rustProof = rustProof;

		System.out.println(" ");
        System.out.println("After change:");
        System.out.println("material: " + this.material);
        System.out.println("weight: " + this.weight);
        System.out.println("type: " + this.type);
        System.out.println("color: " + this.color);
        System.out.println("adjustable: " + this.adjustable);
        System.out.println("gripType: " + this.gripType);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("rustProof: " + this.rustProof);
    }
}