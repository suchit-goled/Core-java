class AsianPaint {

    String color = "white";
    double quantity = 10.0;
    String finish = "matte";
    boolean waterproof = true;
    double price = 3000.0;
    String brand = "asian";
    int warranty = 5;
    boolean ecoFriendly = true;
    String type = "interior";
    boolean washable = true;

    public AsianPaint(String color, double quantity, String finish, boolean waterproof, double price,
                      String brand, int warranty, boolean ecoFriendly, String type, boolean washable) {

        System.out.println("Before change:");
        System.out.println("color: " + this.color);
        System.out.println("quantity: " + this.quantity);
        System.out.println("finish: " + this.finish);
        System.out.println("waterproof: " + this.waterproof);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("ecoFriendly: " + this.ecoFriendly);
        System.out.println("type: " + this.type);
        System.out.println("washable: " + this.washable);

        this.color = color;
        this.quantity = quantity;
        this.finish = finish;
        this.waterproof = waterproof;
        this.price = price;
        this.brand = brand;
        this.warranty = warranty;
        this.ecoFriendly = ecoFriendly;
        this.type = type;
        this.washable = washable;

        System.out.println("\nAfter change:");
        System.out.println("color: " + this.color);
        System.out.println("quantity: " + this.quantity);
        System.out.println("finish: " + this.finish);
        System.out.println("waterproof: " + this.waterproof);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("ecoFriendly: " + this.ecoFriendly);
        System.out.println("type: " + this.type);
        System.out.println("washable: " + this.washable);
    }
}