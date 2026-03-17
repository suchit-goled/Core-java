class Tyre {

    static double getPrice(String brand, String size) {
        System.out.println("Brand: " + brand + ", Size: " + size);

        if (brand == "MRF" && size == "small") {
            System.out.println("Price");
			return 2000.0;
        }

        if (brand == "MRF" && size == "medium") {
            System.out.println("Price");
			return 3000.0;
        }

        if (brand == "MRF" && size == "large") {
            System.out.println("Price");
			return 4000.0;
        }

        if (brand == "CEAT" && size == "small") {
            System.out.println("Price");
			return 1800.0;
        }

        if (brand == "CEAT" && size == "medium") {
            System.out.println("Price");
			return 2800.0;
        }

        if (brand == "CEAT" && size == "large") {
            System.out.println("Price");
			return 3800.0;
        }

        if (brand == "Apollo" && size == "small") {
            System.out.println("Price");
			return 1900.0;
        }

        if (brand == "Apollo" && size == "medium") {
            System.out.println("Price");
			return 2900.0;
        }

        if (brand == "Apollo" && size == "large") {
            System.out.println("Price");
			return 3900.0;
        }

        if (brand == "JK" && size == "small") {
            System.out.println("Price");
			return 1700.0;
        }

        if (brand == "JK" && size == "medium") {
            System.out.println("Price");
			return 2700.0;
        }

        if (brand == "JK" && size == "large") {
            System.out.println("Price");
			return 3700.0;
        }
		else{
			System.out.println("not matching requirements and company");
			return 0.0;
		}
    }
}
