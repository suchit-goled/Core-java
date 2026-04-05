class RocketRunner {

    public static void main(String[] values) {

        Rocket rocket1 = new Rocket("Falcon 9", 70.0,true);
        rocket1.properties();

        Rocket rocket2 = new Rocket( 4,false);
        rocket2.properties();

        Rocket rocket3 = new Rocket( 53.0, 2,false );
        rocket3.properties();
		
		Rocket rocket4 = new Rocket("PSLV",false);
        rocket4.properties();
		
		Rocket rocket5 = new Rocket("Ariane 5", "Europe", 53.0, 777000, 2,false, "Liquid", 21600, "Arianespace", false);
        rocket5.properties();
    }
}