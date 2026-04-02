class Locket{
	
	String material;
    String color;
    String shape;
    double weight;
    double price;
    boolean hasChain;
    String brand;
    String design;
    int size;
    boolean hasStone;
	
	 public Locket(String material, String color, String shape, double weight, double price,
                  boolean hasChain, String brand, String design, int size, boolean hasStone) {
		
		System.out.println("displaying properties of Locket");
		this.material=material;
		this.color=color;
		this.shape=shape;
		this.weight=weight;
		this.price=price;
		this.hasChain=hasChain;
		this.brand=brand;
		this.design=design;
		this.size=size;
		this.hasStone=hasStone;
		}
		
	void properties(){
		
		System.out.println("   ");
		System.out.println("material:"+material);
		System.out.println("color:"+color);
		System.out.println("shape:"+shape);
		System.out.println("weight:"+weight);
		System.out.println("price:"+price);
		System.out.println("hasChain:"+hasChain);
		System.out.println("brand:"+brand);
		System.out.println("design:"+design);
		System.out.println("size:"+size);
		System.out.println("hasStone:"+hasStone);
	}

	
}