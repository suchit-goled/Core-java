class CupRunner{

	public static void main(String[] values){
		
		Cup c1=new Cup();
		System.out.println("color:"+c1.color);
		System.out.println("Material:"+c1.material);
		System.out.println("price:"+c1.price);
		System.out.println("capacity:"+c1.capacity);
		System.out.println("handle:"+c1.handle);
		System.out.println("");
		
		Cup c2=new Cup();
		c2.color="Black";
		c2.material="Ceramic";
		c2.price=150;
		c2.capacity=100;
		c2.handle=true;
		System.out.println("updated color:"+c2.color);
		System.out.println("updated material:"+c2.material);
		System.out.println("Updated Price:"+c2.price);
		System.out.println("updated capacity:"+c2.capacity);
		System.out.println("updated material:"+c2.handle);
		System.out.println("");
		
		Cup c3=new Cup();
		c3.color="Red";
		c3.material="Ceramic";
		c3.price=180;
		c3.capacity=120;
		c3.handle=false;
		System.out.println("updated color:"+c3.color);
		System.out.println("updated material:"+c3.material);
		System.out.println("Updated Price:"+c3.price);
		System.out.println("updated capacity:"+c3.capacity);
		System.out.println("updated material:"+c3.handle);
		System.out.println("");
		
		Cup c4=new Cup();
		c4.color="purple";
		c4.material="Ceramic";
		c4.price=130;
		c4.capacity=100;
		c4.handle=false;
		System.out.println("updated color:"+c4.color);
		System.out.println("updated material:"+c4.material);
		System.out.println("Updated Price:"+c4.price);
		System.out.println("updated capacity:"+c4.capacity);
		System.out.println("updated material:"+c4.handle);
		System.out.println("");
		
		Cup c5=new Cup();
		c5.color="pink";
		c5.material="glass";
		c5.price=250;
		c5.capacity=70;
		c5.handle=true;
		System.out.println("updated color:"+c5.color);
		System.out.println("updated material:"+c5.material);
		System.out.println("Updated Price:"+c5.price);
		System.out.println("updated capacity:"+c5.capacity);
		System.out.println("updated material:"+c5.handle);
		System.out.println("");
		
		Cup c6=new Cup();
		c6.color="transparent";
		c6.material="glass";
		c6.price=300;
		c6.capacity=90;
		c6.handle=true;
		System.out.println("updated color:"+c6.color);
		System.out.println("updated material:"+c6.material);
		System.out.println("Updated Price:"+c6.price);
		System.out.println("updated capacity:"+c6.capacity);
		System.out.println("updated material:"+c6.handle);
		System.out.println("");
	}
}
