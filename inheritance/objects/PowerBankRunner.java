class PowerBankRunner{

	public static void main(String[] values){
		
		PowerBank powerbank1=new PowerBank();
		System.out.println("capacity of powerbank:"+powerbank1.capacity);
		powerbank1.capacity=10000;
		System.out.println("updated capacity:"+powerbank1.capacity);
		System.out.println("");
		
		PowerBank powerbank2=new PowerBank();
		System.out.println("brand of powerbank:"+powerbank2.brand);
		powerbank2.brand="Mi";
		System.out.println("updated brand:"+powerbank2.brand);
		System.out.println("");
		
		PowerBank powerbank3=new PowerBank();
		System.out.println("price of powerbank:"+powerbank3.price);
		powerbank3.price=1200;
		System.out.println("updated price:"+powerbank3.price);
		System.out.println("");
		
		PowerBank powerbank4=new PowerBank();
		System.out.println("ports of powerbank:"+powerbank4.outputPorts);
		powerbank4.outputPorts=2;
		System.out.println("updated ports:"+powerbank4.outputPorts);
		System.out.println("");
		
		PowerBank powerbank5=new PowerBank();
		System.out.println("color of powerbank:"+powerbank5.color);
		powerbank5.color="Black";
		System.out.println("updated color:"+powerbank5.color);
	}
}