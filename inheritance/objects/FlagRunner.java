class FlagRunner{

	public static void main(String[] values){
		
		Flag flag = new Flag();
		System.out.println("Name of the country flag belongs to:"+flag.country);
		flag.country = "India";
		System.out.println("Updated country flag belongs to:"+flag.country);
		System.out.println("");
		
		Flag flag1 = new Flag();
		System.out.println("color of the flag: " + flag1.color);
		flag1.color = "Tricolor"; 
		System.out.println("color of indian flag:"+flag1.color);	
		
		System.out.println("");
		Flag flag2 = new Flag();
		System.out.println("Flag is made up of this material: " + flag2.material);
		flag2.material = "Silk"; 
		System.out.println("Flag is made up of this material:"+flag2.material);	
		
		System.out.println("");
		Flag flag3 = new Flag();
		System.out.println("Size of the flag is :"+flag3.size);
		flag3.size = 3.5;
		System.out.println("Updated flag size :"+flag3.size);
		
		System.out.println("");
		Flag flag4 = new Flag();
		System.out.println("Name of the country flag belongs to:"+flag4.price);
		flag4.price = 300;
		System.out.println("Updated flag price :"+flag4.price);
		
	}
}