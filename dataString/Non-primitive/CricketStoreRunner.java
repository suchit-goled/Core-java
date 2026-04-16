class  CricketStoreRunner {

    public static void main(String[] args) {

        CricketStore cricketStore = new CricketStore();

        cricketStore.save(new Cricket("Virat", "RCB", 35, "Batsman", 250, 12000, 4, 52.3, "India", false));
        cricketStore.save(new Cricket("Dhoni", "CSK", 42, "WicketKeeper", 300, 10000, 1, 50.0, "India", true));

        System.out.println("---- Cricket Details ----");
        cricketStore.displayAll();
    }
}