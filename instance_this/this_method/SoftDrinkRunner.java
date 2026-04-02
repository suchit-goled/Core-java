class SoftDrinkRunner {

    public static void main(String[] values) {

        SoftDrink drink1 = new SoftDrink("CocaCola", "Cola", "Black", 40,1, true, "Medium", 500, "Bottle", true);
        drink1.properties();

        SoftDrink drink2 = new SoftDrink("Pepsi", "Cola", "Dark Brown", 35,2, true, "Large", 750, "Can", true);
        drink2.properties();

        SoftDrink drink3 = new SoftDrink("Sprite", "Lemon", "Clear", 30,1, true, "Small", 300, "Bottle", false);
        drink3.properties();
    }
}