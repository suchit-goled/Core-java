class ReturnTicket{
	
	static double getPriceByPlace(String place){
		
		System.out.println("price for the place:"+place);
		
		if (place == "BangaloreUrban") {
            System.out.println("Price: 200");
			return 200.0;
        }

        if (place == "BangaloreRural") {
            System.out.println("Price: 250");
			return 250.0;
        }

        if (place == "Mysore") {
            System.out.println("Price: 300");
			return 300.0;
        }

        if (place == "Mandya") {
            System.out.println("Price: 280");
			return 280.0;
        }

        if (place == "Tumkur") {
            System.out.println("Price: 260");
			return 260.0;
        }

        if (place == "Kolar") {
            System.out.println("Price: 270");
			return 270.0;
        }

        if (place == "Chikkaballapur") {
            System.out.println("Price: 290");
			return 290.0;
        }

        if (place == "Ramanagara") {
            System.out.println("Price: 240");
			return 240.0;
        }

        if (place == "Hassan") {
            System.out.println("Price: 350");
			return 350.0;
        }

        if (place == "Chikmagalur") {
            System.out.println("Price: 400");
			return 400.0;
        }

        if (place == "Shimoga") {
            System.out.println("Price: 420");
			return 420.0;
        }

        if (place == "Davangere") {
            System.out.println("Price: 450");
			return 450.0;
        }

        if (place == "Bellary") {
            System.out.println("Price: 500");
			return 500.0;
        }

        if (place == "Raichur") {
            System.out.println("Price: 520");
			return 520.0;
        }

        if (place == "Koppal") {
            System.out.println("Price: 480");
			return 480.0;
        }

        if (place == "Gadag") {
            System.out.println("Price: 460");
			return 460.0;
        }

        if (place == "Hubli") {
            System.out.println("Price: 550");
			return 550.0;
        }

        if (place == "Dharwad") {
            System.out.println("Price: 540");
			return 540.0;
        }

        if (place == "Belgaum") {
            System.out.println("Price: 600");
			return 600.0;
        }

        if (place == "Bijapur") {
            System.out.println("Price: 580");
			return 580.0;
        }

        if (place == "Bagalkot") {
            System.out.println("Price: 560");
			return 560.0;
        }

        if (place == "Gulbarga") {
            System.out.println("Price: 620");
			return 620.0;
        }

        if (place == "Bidar") {
            System.out.println("Price: 650");
			return 650.0;
        }

        if (place == "Yadgir") {
            System.out.println("Price: 630");
			return 630.0;
        }

        if (place == "Udupi") {
            System.out.println("Price: 700");
			return 700.0;
        }

        if (place == "DakshinaKannada") {
            System.out.println("Price: 720");
			return 720.0;
        }

        if (place == "UttaraKannada") {
            System.out.println("Price: 740");
			return 740.0;
        }

        if (place == "Kodagu") {
            System.out.println("Price: 680");
			return 680.0;
        }

        if (place == "Chamarajanagar") {
            System.out.println("Price: 360");
			return 360.0;
        }

        if (place == "Haveri") {
            System.out.println("Price: 470");
			return 470.0;
        }

		else {
			System.out.println("this place is not available for return ticket");
			return 0.0;
		}
	}
}