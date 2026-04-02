class Xerox {

    String brand;
    String model;
    String type;
    double price;
    boolean isColor;
    int speed;
    String paperSize;
    boolean isWireless;
    String usage;
    boolean isAvailable;

    public Xerox(String brand, String model, String type, double price, boolean isColor,
                 int speed, String paperSize, boolean isWireless, String usage, boolean isAvailable) {

        System.out.println("displaying properties of Xerox");

        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.isColor = isColor;
        this.speed = speed;
        this.paperSize = paperSize;
        this.isWireless = isWireless;
        this.usage = usage;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("brand:" + brand);
        System.out.println("model:" + model);
        System.out.println("type:" + type);
        System.out.println("price:" + price);
        System.out.println("isColor:" + isColor);
        System.out.println("speed:" + speed);
        System.out.println("paperSize:" + paperSize);
        System.out.println("isWireless:" + isWireless);
        System.out.println("usage:" + usage);
        System.out.println("isAvailable:" + isAvailable);
    }
}