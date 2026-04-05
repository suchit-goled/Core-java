class UmbrellaRunner {

    public static void main(String[] values) {

        Umbrella umb1 = new Umbrella( "Small",400, true, "Polyester",5);
        umb1.properties();

        Umbrella umb2 = new Umbrella("Wildcraft",true, "Nylon", true);
        umb2.properties();
		
		Umbrella umb4 = new Umbrella("Wildcraft",true,"Polyester", true,3);
        umb4.properties();

        Umbrella umb3 = new Umbrella(400,false,5);
        umb3.properties();

        Umbrella umb5= new Umbrella("LocalBrand", "Red", "Small", 400,false, "Plastic", 5, false, "Basic", false);
        umb5.properties();
    }
}