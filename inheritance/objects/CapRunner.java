class CapRunner{

	public static void main(String[] values){
		
		Cap cap= new Cap();
		System.out.println("color of the cap is:"+cap.color);
		cap.color="red";
		System.out.println("updated color of the cap:"+cap.color);
		System.out.println("");
		
		Cap cap2= new Cap();
		System.out.println("brand of the cap is:"+cap2.brand);
		cap2.brand="Levi's";
		System.out.println("updated brand of the cap:"+cap2.brand);
		System.out.println("");
		
		Cap cap3= new Cap();
		System.out.println("material of the cap is:"+cap3.material);
		cap3.material="jeans Cotton";
		System.out.println("updated material of the cap:"+cap3.material);
		System.out.println("");
		
		Cap cap4= new Cap();
		System.out.println("price of the cap is:"+cap4.price);
		cap4.price=1200;
		System.out.println("updated price of the cap:"+cap4.price);
		System.out.println("");
		
		Cap cap5= new Cap();
		System.out.println("free size of the cap is:"+cap5.isFreeSize);
		cap5.isFreeSize=true;
		System.out.println("updated free size of the cap:"+cap5.isFreeSize);
		System.out.println("");
		
		
	}

}