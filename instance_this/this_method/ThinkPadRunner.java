class ThinkPadRunner {

    public static void main(String[] values) {



		ThinkPad laptop4 = new ThinkPad("E14", 65000);
        laptop4.properties();

        ThinkPad laptop5 = new ThinkPad(16, 1024, "Black");
        laptop5.properties();

        ThinkPad laptop6 = new ThinkPad( 15.6, "Windows 10", false);
        laptop6.properties();
		
		ThinkPad laptop3 = new ThinkPad(512,"Grey", 15.6,false);
        laptop3.properties();

        ThinkPad laptop2 = new ThinkPad("X1 Carbon", "Intel i7", 16, 1024, 150000,"Black", 14.0, "Windows 11", true, true);
        laptop2.properties();
		
    }
}