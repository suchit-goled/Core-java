class PhotoFrameRunner{

	public static void main(String[] values){
		
		PhotoFrame p1=new PhotoFrame();
		System.out.println("material:"+p1.material);
		p1.material="Wood";
		System.out.println("updated material:"+p1.material);
		System.out.println("");
		
		PhotoFrame p2=new PhotoFrame();
		System.out.println("size:"+p2.size);
		p2.size="A4";
		System.out.println("updated size:"+p2.size);
		System.out.println("");
		
		PhotoFrame p3=new PhotoFrame();
		System.out.println("price:"+p3.price);
		p3.price=500;
		System.out.println("updated price:"+p3.price);
		System.out.println("");
		
		PhotoFrame p4=new PhotoFrame();
		System.out.println("color:"+p4.color);
		p4.color="Brown";
		System.out.println("updated color:"+p4.color);
		System.out.println("");
		
		PhotoFrame p5=new PhotoFrame();
		System.out.println("glass:"+p5.glass);
		p5.glass=true;
		System.out.println("updated glass:"+p5.glass);
	}
}