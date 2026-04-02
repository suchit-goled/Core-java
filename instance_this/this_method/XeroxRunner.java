class XeroxRunner {

    public static void main(String[] values) {

        Xerox xerox1 = new Xerox("HP", "LaserJet Pro", "Laser", 15000,true, 20, "A4", true, "Office", true);
        xerox1.properties();

        Xerox xerox2 = new Xerox("Canon", "Pixma G3000", "Inkjet", 12000,true, 15, "A4", true, "Home", true);
        xerox2.properties();

        Xerox xerox3 = new Xerox("Epson", "EcoTank L3150", "Inkjet", 14000,false, 10, "A4", false, "Shop", false);
        xerox3.properties();
    }
}