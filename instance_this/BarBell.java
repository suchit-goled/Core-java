class BarBell {

    String material = "steel";
    double length = 5.0;
    double weight = 15.0;
    String type = "olympic";
    boolean knurling = true;
    String color = "silver";
    double price = 5000.0;
    String brand = "local";
    int warranty = 1;
    boolean rustProof = true;

    public BarBell(String material, double length, double weight, String type, boolean knurling,
                   String color, double price, String brand, int warranty, boolean rustProof) {

        System.out.println("Before change:");
        System.out.println("material: " + this.material);
        System.out.println("length: " + this.length);
        System.out.println("weight: " + this.weight);
        System.out.println("type: " + this.type);
        System.out.println("knurling: " + this.knurling);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("rustProof: " + this.rustProof);

        this.material = material;
        this.length = length;
        this.weight = weight;
        this.type = type;
        this.knurling = knurling;
        this.color = color;
        this.price = price;
        this.brand = brand;
        this.warranty = warranty;
        this.rustProof = rustProof;

		System.out.println(" ");
        System.out.println("After change:");
        System.out.println("material: " + this.material);
        System.out.println("length: " + this.length);
        System.out.println("weight: " + this.weight);
        System.out.println("type: " + this.type);
        System.out.println("knurling: " + this.knurling);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("rustProof: " + this.rustProof);
    }
}