class Wheel {

    
    String material = "wood";
    double radius = 10.5;
    double width = 5.0;
    String type = "solid";
    boolean isTubeless = false;
    double weight = 7.5;
    String color = "black";
    int spokes = 20;
    boolean isAlloy = false;
    double price = 2500.0;


    public Wheel(String material, double radius, double width, String type, boolean isTubeless,
                 double weight, String color, int spokes, boolean isAlloy, double price) {

        System.out.println("Before change:");
        System.out.println("material: " + this.material);
        System.out.println("radius: " + this.radius);
        System.out.println("width: " + this.width);
        System.out.println("type: " + this.type);
        System.out.println("isTubeless: " + this.isTubeless);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("spokes: " + this.spokes);
        System.out.println("isAlloy: " + this.isAlloy);
        System.out.println("price: " + this.price);


        this.material = material;
        this.radius = radius;
        this.width = width;
        this.type = type;
        this.isTubeless = isTubeless;
        this.weight = weight;
        this.color = color;
        this.spokes = spokes;
        this.isAlloy = isAlloy;
        this.price = price;

		System.out.println("  ");
        System.out.println("After change:");
        System.out.println("material: " + this.material);
        System.out.println("radius: " + this.radius);
        System.out.println("width: " + this.width);
        System.out.println("type: " + this.type);
        System.out.println("isTubeless: " + this.isTubeless);
        System.out.println("weight: " + this.weight);
        System.out.println("color: " + this.color);
        System.out.println("spokes: " + this.spokes);
        System.out.println("isAlloy: " + this.isAlloy);
        System.out.println("price: " + this.price);
    }
}