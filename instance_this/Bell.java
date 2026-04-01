class Bell {

    String material = "brass";
    double weight = 2.0;
    String soundType = "loud";
    String color = "gold";
    boolean electric = false;
    double price = 800.0;
    String brand = "local";
    int warranty = 1;
    boolean portable = true;
    String usage = "temple";

    public Bell(String material, double weight, String soundType, String color, boolean electric,
                double price, String brand, int warranty, boolean portable, String usage) {

        System.out.println("Before change:");
        System.out.println("material: " + this.material);
        System.out.println("weight: " + this.weight);
        System.out.println("soundType: " + this.soundType);
        System.out.println("color: " + this.color);
        System.out.println("electric: " + this.electric);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("portable: " + this.portable);
        System.out.println("usage: " + this.usage);

        this.material = material;
        this.weight = weight;
        this.soundType = soundType;
        this.color = color;
        this.electric = electric;
        this.price = price;
        this.brand = brand;
        this.warranty = warranty;
        this.portable = portable;
        this.usage = usage;

        System.out.println("\nAfter change:");
        System.out.println("material: " + this.material);
        System.out.println("weight: " + this.weight);
        System.out.println("soundType: " + this.soundType);
        System.out.println("color: " + this.color);
        System.out.println("electric: " + this.electric);
        System.out.println("price: " + this.price);
        System.out.println("brand: " + this.brand);
        System.out.println("warranty: " + this.warranty);
        System.out.println("portable: " + this.portable);
        System.out.println("usage: " + this.usage);
    }
}