class Screen {

    String brand;
    double size;
    String resolution;
    String type;
    double price;
    String color;
    boolean isSmart;
    int refreshRate;
    String panelType;
    double weight;

    Screen(String brand, double size, String resolution, String type,
           double price, String color, boolean isSmart,
           int refreshRate, String panelType, double weight) {

        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.type = type;
        this.price = price;
        this.color = color;
        this.isSmart = isSmart;
        this.refreshRate = refreshRate;
        this.panelType = panelType;
        this.weight = weight;
    }

    void display() {
		System.out.println("==============");
        System.out.println("brand:" + brand);
		System.out.println("size:" + size);
		System.out.println("resolution:" + resolution);
		System.out.println("type:" + type);
		System.out.println("price:" + price);
		System.out.println("color:" + color);
		System.out.println("isSmart:" + isSmart);
		System.out.println("refreshRate:" + refreshRate);
		System.out.println("panelType:" + panelType);
		System.out.println("weight:" + weight);
    }
}