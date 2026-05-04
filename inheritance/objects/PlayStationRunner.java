class PlayStationRunner{

	public static void main(String[] values){
		
		PlayStation p1=new PlayStation();
		System.out.println("model:"+p1.model);
		p1.model="PS5";
		System.out.println("updated model:"+p1.model);
		System.out.println("");
		
		PlayStation p2=new PlayStation();
		System.out.println("storage:"+p2.storage);
		p2.storage=825;
		System.out.println("updated storage:"+p2.storage);
		System.out.println("");
		
		PlayStation p3=new PlayStation();
		System.out.println("price:"+p3.price);
		p3.price=50000;
		System.out.println("updated price:"+p3.price);
		System.out.println("");
		
		PlayStation p4=new PlayStation();
		System.out.println("controllers:"+p4.controllers);
		p4.controllers=2;
		System.out.println("updated controllers:"+p4.controllers);
		System.out.println("");
		
		PlayStation p5=new PlayStation();
		System.out.println("online support:"+p5.onlineSupport);
		p5.onlineSupport=true;
		System.out.println("updated online support:"+p5.onlineSupport);
	}
}