class UmbrellaRunner {

    public static void main(String[] values) {

        Umbrella umb1 = new Umbrella("Puma", "Black", "Large", 1200,true, "Polyester", 8, true, "Automatic", true);
        umb1.properties();

        Umbrella umb2 = new Umbrella("Wildcraft", "Blue", "Medium", 900,true, "Nylon", 6, true, "Manual", true);
        umb2.properties();

        Umbrella umb3 = new Umbrella("LocalBrand", "Red", "Small", 400,false, "Plastic", 5, false, "Basic", false);
        umb3.properties();
    }
}