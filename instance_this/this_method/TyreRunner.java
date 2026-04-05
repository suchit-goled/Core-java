class TyreRunner {

    public static void main(String[] values) {

        Tyre tyre1 = new Tyre("MRF", "Radial", "17 inch", 5000);
        tyre1.properties();

        Tyre tyre2 = new Tyre( "Tubed", "Bike");
        tyre2.properties();

        Tyre tyre3 = new Tyre(true,75,4000);
        tyre3.properties();
		
		Tyre tyre4 = new Tyre("18 inch",false,7500,75);
        tyre4.properties();

        Tyre tyre5 = new Tyre("CEAT", "Radial", "16 inch", 4000,true, "Car", "Rubber", 75, true, false);
        tyre5.properties();
    }
}