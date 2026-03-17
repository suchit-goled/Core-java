class WaterMelon {

    static double getPrice(int quantity) {
        System.out.println("price for the quantity of watermelon: " + quantity);

        if (quantity == 1) {
            System.out.println("Price: 50");
            return 50.0;
        }

        if (quantity == 2) {
            System.out.println("Price: 100");
            return 100.0;
        }

        if (quantity == 3) {
            System.out.println("Price: 150");
            return 150.0;
        }

        if (quantity == 4) {
            System.out.println("Price: 200");
            return 200.0;
        }

        if (quantity == 5) {
            System.out.println("Price: 250");
            return 250.0;
        }

        if (quantity == 6) {
            System.out.println("Price: 300");
            return 300.0;
        }

        if (quantity == 7) {
            System.out.println("Price: 350");
            return 350.0;
        }

        if (quantity == 8) {
            System.out.println("Price: 400");
            return 400.0;
        }

        if (quantity == 9) {
            System.out.println("Price: 450");
            return 450.0;
        }

        if (quantity == 10) {
            System.out.println("Price: 500");
            return 500.0;
        }

        else {
            System.out.println("this quantity is not available");
            return 0.0;
        }
    }
}