class WaterMelon {

    String color;
    double weight;
    String shape;
    int seeds;
    String taste;
    double price;
    String origin;
    boolean isFresh;
    double diameter;
    String season;

    WaterMelon(String color, double weight, String shape, int seeds,
               String taste, double price, String origin,
               boolean isFresh, double diameter, String season) {

        this.color = color;
        this.weight = weight;
        this.shape = shape;
        this.seeds = seeds;
        this.taste = taste;
        this.price = price;
        this.origin = origin;
        this.isFresh = isFresh;
        this.diameter = diameter;
        this.season = season;
    }

    void display() {
        System.out.println("color:"+color);
		System.out.println( "weight: " + weight);
		System.out.println( "shape: " + shape);
		System.out.println("seeds:" + seeds);
		System.out.println("price:" + price );
		System.out.println( "origin: " + origin );
		System.out.println("isFresh: " + isFresh);
		System.out.println("diameter:"+ diameter);
		System.out.println( "season" + season);
		System.out.println("taste"+ taste);
		System.out.println("================================");
    }
}