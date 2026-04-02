class LocketRunner{
	
	
	public static void main(String[] values){
		
		Locket locket1=new Locket("Gold", "Yellow", "Heart", 5.5, 15000, true, "Tanishq", "Engraved", 2, false);
		locket1.properties();
		
		Locket locket2=new Locket("Silver", "White", "Round", 3.2, 5000, false, "Malabar", "Plain", 1, false);
		locket2.properties();
		
		Locket locket3=new Locket("Platinum", "Grey", "Oval", 4.0, 25000, true, "Kalyan", "Diamond Studded", 3, true);
		locket3.properties();
	}
}