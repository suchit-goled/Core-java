class SoftDrinkRunner {

    public static void main(String[] values) {

        SoftDrink drink1 = new SoftDrink("CocaCola", "Cola",true);
        drink1.properties();

        SoftDrink drink2 = new SoftDrink(35,2);
        drink2.properties();

        SoftDrink drink3 = new SoftDrink(1, true);
        drink3.properties();
		
        SoftDrink drink4 = new SoftDrink("Pepsi", 750, true);
        drink4.properties();

        SoftDrink drink5 = new SoftDrink("Sprite", "Lemon", "Clear", 30,1, true, "Small", 300, "Bottle", false);
        drink5.properties();
    }
}