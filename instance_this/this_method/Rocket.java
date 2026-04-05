class Rocket {

    String name;
    String country;
    double height;
    double weight;
    int stages;
    boolean isReusable;
    String fuelType;
    double payloadCapacity;
    String manufacturer;
    boolean isActive;


    public Rocket(String name, double height,boolean isActive) {

        System.out.println("displaying properties of Rocket");

        this.name = name;
        this.height = height;
        this.isActive = isActive;
    }
	
	public Rocket( int stages,boolean isReusable) {

        System.out.println("displaying properties of Rocket");

        
        this.stages = stages;
        this.isReusable = isReusable;
       
	}
	public Rocket( double weight, int stages,boolean isActive) {

        System.out.println("displaying properties of Rocket");

        this.weight = weight;
        this.stages = stages;
        this.isActive = isActive;
    }
	
	public Rocket(String name,boolean isActive) {

        System.out.println("displaying properties of Rocket");

        this.name = name;
        this.isActive = isActive;
    }
	
	

    public Rocket(String name, String country, double height, double weight, int stages,
                  boolean isReusable, String fuelType, double payloadCapacity,
                  String manufacturer, boolean isActive) {

        System.out.println("displaying properties of Rocket");

        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.stages = stages;
        this.isReusable = isReusable;
        this.fuelType = fuelType;
        this.payloadCapacity = payloadCapacity;
        this.manufacturer = manufacturer;
        this.isActive = isActive;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("name:" + name);
        System.out.println("country:" + country);
        System.out.println("height:" + height);
        System.out.println("weight:" + weight);
        System.out.println("stages:" + stages);
        System.out.println("isReusable:" + isReusable);
        System.out.println("fuelType:" + fuelType);
        System.out.println("payloadCapacity:" + payloadCapacity);
        System.out.println("manufacturer:" + manufacturer);
        System.out.println("isActive:" + isActive);
    }
}