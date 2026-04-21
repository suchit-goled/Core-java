class TShirt extends Jersey{
	
	 
	 TShirt(String material, int size) {
        super(material, size);   
        System.out.println(material + " " + size);
	 }
	 
}