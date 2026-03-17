class MovieTicket {

    static double getPrice(String movie, String seatType, String theater) {

        System.out.println("Movie: " + movie + ", Seat: " + seatType + ", Theater: " + theater);

        if (movie == "KGF" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 250"); 
			return 250;
        }
        if (movie == "KGF" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 200"); 
			return 200;
        }
        if (movie == "KGF" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 300"); 
			return 300;
        }
        if (movie == "KGF" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 240"); 
			return 240;
        }
        if (movie == "KGF" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 190");
			return 190;
        }
		
        if (movie == "RRR" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 260"); 
			return 260;
        }
        if (movie == "RRR" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 210"); 
			return 210;
        }
        if (movie == "RRR" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 320");
			return 320;
        }
        if (movie == "RRR" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 250"); 
			return 250;
        }
        if (movie == "RRR" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 200");
			return 200;
        }

        if (movie == "Leo" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 270"); 
			return 270;
        }
        if (movie == "Leo" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 220"); 
			return 220;
        }
        if (movie == "Leo" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 330"); 
			return 330;
        }
        if (movie == "Leo" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 260"); 
			return 260;
        }
        if (movie == "Leo" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 210");
			return 210;
        }

        if (movie == "Jawan" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 280");
			return 280;
        }
        if (movie == "Jawan" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 230"); 
			return 230;
        }
        if (movie == "Jawan" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 340"); 
			return 340;
        }
        if (movie == "Jawan" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 270"); 
			return 270;
        }
        if (movie == "Jawan" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 220"); 
			return 220;
        }

        if (movie == "Salaar" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 300");
			return 300;
        }
        if (movie == "Salaar" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 250"); 
			return 250;
        }
        if (movie == "Salaar" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 360"); 
			return 360;
        }
        if (movie == "Salaar" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 290"); 
			return 290;
        }
        if (movie == "Salaar" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 240");
			return 240;
        }
		
        if (movie == "Pushpa" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 260");
			return 260;
        }
        if (movie == "Pushpa" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 210"); 
			return 210;
        }
        if (movie == "Kantara" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 240"); 
			return 240;
        }
        if (movie == "Kantara" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 200"); 
			return 200;
        }
        if (movie == "Vikram" && seatType == "Platinum" && theater == "PVR") {
            System.out.println("Price: 320"); 
			return 320;
        }
        if (movie == "Vikram" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 260"); 
			return 260;
        }
        if (movie == "Beast" && seatType == "Silver" && theater == "PVR") {
            System.out.println("Price: 210"); 
			return 210;
        }
        if (movie == "Beast" && seatType == "Gold" && theater == "INOX") {
            System.out.println("Price: 250"); 
			return 250;
        }
        if (movie == "Master" && seatType == "Gold" && theater == "PVR") {
            System.out.println("Price: 270"); 
			return 270;
        }
        if (movie == "Master" && seatType == "Silver" && theater == "INOX") {
            System.out.println("Price: 220");
			return 220;
        }

        else {
            System.out.println("This combination is not available");
            return 0;
        }
    }
}