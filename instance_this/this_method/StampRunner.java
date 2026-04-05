class StampRunner {

    public static void main(String[] values) {

        Stamp stamp1 = new Stamp("Trodat", true, "Plastic");
        stamp1.properties();

        Stamp stamp2 = new Stamp(450,"Rubber", "Office Work", true);
        stamp2.properties();

        Stamp stamp3 = new Stamp(false);
        stamp3.properties();
		
		Stamp stamp4 = new Stamp( 450, "Personal Use");
        stamp4.properties();

        Stamp stamp5 = new Stamp("Generic", "Custom", "Round", "Red", 200,"Large", false, "Wood", "Personal Use", false);
        stamp5.properties();
    }
}