class ChainRunner{
	
	
	public static void main(String[] values){
		
		Chain chainproperties1= new Chain("Gold", "Yellow", 20.5, 10.2, 25000,
                                           "Rope", "Tanishq", true, "Traditional", true);
		chainproperties1.properties();
		
		Chain chainproperties2= new Chain("Silver", "White", 18.0, 8.5, 8000,
                                           "Box", "Malabar", false, "Simple", true);
		chainproperties2.properties();
		
		Chain chainproperties3= new Chain("Platinum", "Grey", 22.0, 9.8, 40000,
                                           "Cuban", "Kalyan", true, "Modern", false);
		chainproperties3.properties();
		
	}
}