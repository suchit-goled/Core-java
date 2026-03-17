class TissuePaper{
	static double getPriceByThickness(String thickness){
		System.out.println("price for the thickness of the tissue:"+thickness);
		if (thickness == "ultra thin") {
            System.out.println("Price: 10");
			return 10.0;
        }

        if (thickness == "very thin") {
            System.out.println("Price: 15");
			return 15.0;
        }

        if (thickness == "thin") {
            System.out.println("Price: 20");
			return 20.0;
        }

        if (thickness == "light") {
            System.out.println("Price: 25");
			return 25;
        }

        if (thickness == "medium") {
            System.out.println("Price: 40");
			return 40;
        }

        if (thickness == "semi thick") {
            System.out.println("Price: 50");
			return 50;
        }

        if (thickness == "thick") {
            System.out.println("Price: 60");
			return 60.0;
			
        }

        if (thickness == "very thick") {
            System.out.println("Price: 70");
			return 70.0;
        }

        if (thickness == "extra thick") {
            System.out.println("Price: ₹80");
			return 80.0;
        }

        if (thickness == "paper thick") {
            System.out.println("Price: ₹100");
			return 100.0;
        }
		else {
			System.out.println("this thickness is not considered as tissue paper");
			return 0.0;
		}
	}
}