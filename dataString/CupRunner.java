class CupRunner {

    public static void main(String[] args) {

        Cup cup = new Cup();

        cup.addCup("Steel Cup");
        cup.addCup("Glass Cup");
        cup.addCup("Plastic Cup");

        cup.searchCup("Glass Cup");
        cup.searchCup("Paper Cup");
    }
}