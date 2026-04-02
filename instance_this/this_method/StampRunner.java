class StampRunner {

    public static void main(String[] values) {

        Stamp stamp1 = new Stamp("Trodat", "Office", "Rectangle", "Blue", 300,"Medium", true, "Plastic", "Official Use", true);
        stamp1.properties();

        Stamp stamp2 = new Stamp("Shiny", "Date Stamp", "Square", "Black", 450,"Small", true, "Rubber", "Office Work", true);
        stamp2.properties();

        Stamp stamp3 = new Stamp("Generic", "Custom", "Round", "Red", 200,"Large", false, "Wood", "Personal Use", false);
        stamp3.properties();
    }
}