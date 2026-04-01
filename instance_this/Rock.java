class Rock {

    String type = "granite";
    double weight = 50.0;
    String color = "gray";
    boolean hard = true;
    double density = 2.7;
    String texture = "rough";
    double price = 1000.0;
    String origin = "natural";
    boolean polished = false;
    int size = 10;

    public Rock(String type, double weight, String color, boolean hard, double density,
                String texture, double price, String origin, boolean polished, int size) {

        System.out.println("Before change:");
        System.out.println("type: " + this.type);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("hard: " + this.hard);
        System.out.println("density: " + this.density);
        System.out.println("texture: " + this.texture);
        System.out.println("price: " + this.price);
        System.out.println("origin: " + this.origin);
        System.out.println("polished: " + this.polished);
        System.out.println("size: " + this.size);

        this.type = type;
        this.weight = weight;
        this.color = color;
        this.hard = hard;
        this.density = density;
        this.texture = texture;
        this.price = price;
        this.origin = origin;
        this.polished = polished;
        this.size = size;

        System.out.println("\nAfter change:");
        System.out.println("type: " + this.type);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("hard: " + this.hard);
        System.out.println("density: " + this.density);
        System.out.println("texture: " + this.texture);
        System.out.println("price: " + this.price);
        System.out.println("origin: " + this.origin);
        System.out.println("polished: " + this.polished);
        System.out.println("size: " + this.size);
    }
}