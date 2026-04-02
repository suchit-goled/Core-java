class TyreRunner {

    public static void main(String[] values) {

        Tyre tyre1 = new Tyre("MRF", "Radial", "17 inch", 5000,true, "Car", "Rubber", 80, true, true);
        tyre1.properties();

        Tyre tyre2 = new Tyre("Apollo", "Tubed", "18 inch", 4500,false, "Bike", "Synthetic", 70, false, true);
        tyre2.properties();

        Tyre tyre3 = new Tyre("CEAT", "Radial", "16 inch", 4000,true, "Car", "Rubber", 75, true, false);
        tyre3.properties();
    }
}