class CupRunner{

	public static void main(String[] values){
		
		Cup c1=new Cup();
		System.out.println("color:"+c1.color);
		c1.color="White";
		System.out.println("updated color:"+c1.color);
		System.out.println("");
		
		Cup c2=new Cup();
		System.out.println("material:"+c2.material);
		c2.material="Ceramic";
		System.out.println("updated material:"+c2.material);
		System.out.println("");
		
		Cup c3=new Cup();
		System.out.println("price:"+c3.price);
		c3.price=200;
		System.out.println("updated price:"+c3.price);
		System.out.println("");
		
		Cup c4=new Cup();
		System.out.println("capacity:"+c4.capacity);
		c4.capacity=250;
		System.out.println("updated capacity:"+c4.capacity);
		System.out.println("");
		
		Cup c5=new Cup();
		System.out.println("handle:"+c5.handle);
		c5.handle=true;
		System.out.println("updated handle:"+c5.handle);
	}
}