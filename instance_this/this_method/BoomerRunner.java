class BoomerRunner {

    public static void main(String[] values) {

        Boomer boomer1 = new Boomer("Wrigley", "Strawberry", "Pink", 10, 5,false, "Cube", 2.0, "Bubble Gum", true);
        boomer1.properties();

        Boomer boomer2 = new Boomer("Boomer", "Mint", "Green", 12, 6,true, "Round", 1.8, "Chewing Gum", true);
        boomer2.properties();

        Boomer boomer3 = new Boomer("CenterFresh", "Fruit", "Orange", 8, 4,false, "Oval", 2.2, "Bubble Gum", false);
        boomer3.properties();
		
		Boomer boomer4= new Boomer(false, "Oval");
		boomer4.properties();
		
		Boomer boomer5= new Boomer(8, 4);
		boomer5.properties();
		
		Boomer boomer6= new Boomer("CenterFresh");
		boomer6.properties();
		
		Boomer boomer7= new Boomer("Orange", 8);
		boomer7.properties();
    }
}