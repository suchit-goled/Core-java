class TyreRunner {
    public static void main(String[] args) {

        double price = Tyre.getPrice("MRF", "medium");
        System.out.println("Tyre price: " + price);
		price = Tyre.getPrice("MRF", "small");
        System.out.println("Tyre price: " + price);
		price = Tyre.getPrice("MRF", "large");
        System.out.println("Tyre price: " + price);

		price = Tyre.getPrice("CEAT", "small");
        System.out.println("Tyre price: " + price);
		price = Tyre.getPrice("CEAT", "medium");
        System.out.println("Tyre price: " + price);
        price = Tyre.getPrice("CEAT", "large");
        System.out.println("Tyre price: " + price);

        price = Tyre.getPrice("Apollo", "small");
        System.out.println("Tyre price: " + price);
		price = Tyre.getPrice("Apollo", "medium");
        System.out.println("Tyre price: " + price);
        price = Tyre.getPrice("Apollo", "large");
        System.out.println("Tyre price: " + price);

        price = Tyre.getPrice("JK", "small");
        System.out.println("Tyre price: " + price);
		price = Tyre.getPrice("JK", "medium");
        System.out.println("Tyre price: " + price);
        price = Tyre.getPrice("JK", "large");
        System.out.println("Tyre price: " + price);
    }
}