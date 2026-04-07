class SugarCaneRunner {

    public static void main(String[] args){

        SugarCane sugarCane = new SugarCane("Co-86032", 12.5);

        Farmer farmer = new Farmer("Ramesh", 5, sugarCane);

        farmer.display();
    }
}