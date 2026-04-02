class SpecsRunner{
	
	public static void main(String[] values){
		
		Specs specsProperty1=new Specs("RayBan", "Black", "Full Rim", "UV Protection", 4500,
                                        true, "Aviator", "Medium", "Metal", true);
		specsProperty1.specs();
		
		Specs specsProperty2=new Specs("Fastrack", "Blue", "Half Rim", "Anti Glare", 2500,
                                        false, "Rectangle", "Large", "Plastic", true);
		specsProperty2.specs();
		
		Specs specsProperty3=new Specs("Oakley", "Grey", "Rimless", "Polarized", 8000,
                                        true, "Round", "Small", "Fiber", false);
		specsProperty3.specs();
	}
	
	
	
}