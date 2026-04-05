class ThinkPad {

    String model;
    String processor;
    int ram;
    int storage;
    double price;
    String color;
    double screenSize;
    String operatingSystem;
    boolean isTouchScreen;
    boolean isAvailable;


	public ThinkPad(String model,double price){
		System.out.println("displaying model and price of Thinkpad");
		this.model=model;
		this.price=price;
		
	}
	public ThinkPad(int ram, int storage, String color){
		System.out.println("displaying properties Thinkpad");
		this.ram=ram;
		this.storage=storage;
		this.color=color;
		
	}
	public ThinkPad(double screenSize, String operatingSystem,
                    boolean isTouchScreen){
		System.out.println("displaying properties Thinkpad");
		this.screenSize=screenSize;
		this.operatingSystem=operatingSystem;
		this.isTouchScreen=isTouchScreen;
	}
	public ThinkPad( int storage,String color,double screenSize,boolean isTouchScreen){
		System.out.println("displaying properties of Thinkpad");
		this.storage=storage;
		this.color=color;
		this.screenSize=screenSize;
		this.isTouchScreen=isTouchScreen;
		
	}
    public ThinkPad(String model, String processor, int ram, int storage, double price,
                    String color, double screenSize, String operatingSystem,
                    boolean isTouchScreen, boolean isAvailable) {

        System.out.println("displaying properties of ThinkPad");

        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.color = color;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.isTouchScreen = isTouchScreen;
        this.isAvailable = isAvailable;
    }

    void properties() {

        System.out.println("   ");
        System.out.println("model:" + model);
        System.out.println("processor:" + processor);
        System.out.println("ram:" + ram + "GB");
        System.out.println("storage:" + storage + "GB");
        System.out.println("price:" + price);
        System.out.println("color:" + color);
        System.out.println("screenSize:" + screenSize);
        System.out.println("operatingSystem:" + operatingSystem);
        System.out.println("isTouchScreen:" + isTouchScreen);
        System.out.println("isAvailable:" + isAvailable);
    }
}