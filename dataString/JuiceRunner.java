class JuiceRunner {

    public static void main(String[] args) {

        Juice juice = new Juice();

        juice.addJuice("Orange Juice");
        juice.addJuice("Apple Juice");
        juice.addJuice("Mango Juice");

        juice.searchJuice("Apple Juice");
        juice.searchJuice("Grape Juice");
    }
}