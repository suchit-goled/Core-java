class InkPadRunner {

    public static void main(String[] values) {

        InkPad ink1 = new InkPad("Camlin", "Blue", "Stamp Pad", 120,"Small", true, "Dye Ink", "Rectangle", true, true);
        ink1.properties();

        InkPad ink2 = new InkPad("FaberCastell", "Black", "Office Pad", 150,"Medium", false, "Pigment Ink", "Square", true, true);
        ink2.properties();

        InkPad ink3 = new InkPad("Artline", "Red", "Signature Pad", 100,"Large", true, "Oil Based", "Round", false, false);
        ink3.properties();
    }
}