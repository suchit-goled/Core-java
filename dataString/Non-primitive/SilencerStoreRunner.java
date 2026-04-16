class  SilencerStoreRunner {

    public static void main(String[] args) {

        
        SilencerStore silencerStore = new SilencerStore();

        silencerStore.save(new Silencer("Bosch", "Steel", 3.5, "Standard", 2500, "Bike", true, 40, "Silver", 5));
        silencerStore.save(new Silencer("Yamaha", "Alloy", 4.0, "Sport", 3500, "Car", true, 45, "Black", 7));

        System.out.println("---- Silencer Details ----");
        silencerStore.displayAll();
    }
}