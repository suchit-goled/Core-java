class Locker {

    String brand;
    String material;
    String color;
    int capacity;
    double price;
    boolean isDigital;
    int numberOfCompartments;
    boolean isFireResistant;
    String lockType;
    double weight;

    public Locker(String brand, String material, String color, int capacity, double price,
                  boolean isDigital, int numberOfCompartments, boolean isFireResistant,
                  String lockType, double weight) {

        System.out.println("displaying properties of Locker");

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.isDigital = isDigital;
        this.numberOfCompartments = numberOfCompartments;
        this.isFireResistant = isFireResistant;
        this.lockType = lockType;
        this.weight = weight;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("material:" + material);
        System.out.println("color:" + color);
        System.out.println("capacity:" + capacity);
        System.out.println("price:" + price);
        System.out.println("isDigital:" + isDigital);
        System.out.println("numberOfCompartments:" + numberOfCompartments);
        System.out.println("isFireResistant:" + isFireResistant);
        System.out.println("lockType:" + lockType);
        System.out.println("weight:" + weight);
    }
}