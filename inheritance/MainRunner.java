class MainRunner {
    public static void main(String[] args) {

		System.out.println("Details of Pdf");
        new PdfDocument("PDF", 120);
		System.out.println("");
		
		System.out.println("Details of camera");
		
        new DigitalCamera(48, "Canon");
		System.out.println("");
		
		System.out.println("Details of pricetag");
		
        new PriceTag("ProductTag", 101);
		System.out.println("");
		
		System.out.println("Details of laptop");
		
        new LaptopTouchPad("Capacitive", true);
		System.out.println("");
		
		System.out.println("Details of puzzle");
        new JigsawPuzzle(500, "Medium");
		System.out.println("");
		
		System.out.println("Details of knife");
        new KitchenKnife("Steel", 8.5);
		System.out.println("");
		
		System.out.println("Details of thread");
        new SewingThread("Red", 2);
		System.out.println("");
		
		System.out.println("Details of dumbell");
        new GymDumbBell(10, "Iron");
		System.out.println("");
		
		System.out.println("Details of wood");
        new FurnitureWood("Teak", 700);
    }
}