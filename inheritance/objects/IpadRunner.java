class IpadRunner{

	public static void main(String[] values){
		
		Ipad ipad = new Ipad();
		System.out.println("model of the ipad is:"+ipad.model);
		ipad.model="Air";
		System.out.println("updated model of the ipad:"+ipad.model);
		System.out.println("");
		
		Ipad ipad2 = new Ipad();
		System.out.println("price of the ipad is:"+ipad2.price);
		ipad2.price=50000;
		System.out.println("updated price of the ipad:"+ipad2.price);
		System.out.println("");
		
		Ipad ipad3 = new Ipad();
		System.out.println("storage of the ipad is:"+ipad3.storage);
		ipad3.storage=128;
		System.out.println("updated storage of the ipad:"+ipad3.storage);
		System.out.println("");
		
		Ipad ipad4 = new Ipad();
		System.out.println("color of the ipad is:"+ipad4.color);
		ipad4.color="Silver";
		System.out.println("updated color of the ipad:"+ipad4.color);
		System.out.println("");
		
		Ipad ipad5 = new Ipad();
		System.out.println("screen size of the ipad is:"+ipad5.screenSize);
		ipad5.screenSize=10.9;
		System.out.println("updated screen size of the ipad:"+ipad5.screenSize);
		System.out.println("");
	}
}