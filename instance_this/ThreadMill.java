class ThreadMill {

    String brand = "fit";
    double speed = 10.0;
    boolean automatic = true;
    double weight = 60.0;
    String color = "black";
    double price = 40000.0;
    boolean foldable = true;
    int warranty = 2;
    boolean display = true;
    String type = "electric";

    public ThreadMill(String brand, double speed, boolean automatic, double weight, String color,
                      double price, boolean foldable, int warranty, boolean display, String type) {

        System.out.println("Before change:");
        System.out.println("brand: " + this.brand);
        System.out.println("speed: " + this.speed);
        System.out.println("automatic: " + this.automatic);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println("foldable: " + this.foldable);
        System.out.println("warranty: " + this.warranty);
        System.out.println("display: " + this.display);
        System.out.println("type: " + this.type);

        this.brand = brand;
        this.speed = speed;
        this.automatic = automatic;
        this.weight = weight;
        this.color = color;
        this.price = price;
        this.foldable = foldable;
        this.warranty = warranty;
        this.display = display;
        this.type = type;

        System.out.println("\nAfter change:");
        System.out.println("brand: " + this.brand);
        System.out.println("speed: " + this.speed);
        System.out.println("automatic: " + this.automatic);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println("foldable: " + this.foldable);
        System.out.println("warranty: " + this.warranty);
        System.out.println("display: " + this.display);
        System.out.println("type: " + this.type);
    }
}