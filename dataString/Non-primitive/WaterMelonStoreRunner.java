class WaterMelonStoreRunner {

    public static void main(String[] args) {

       
        WaterMelonStore waterMelonStore = new WaterMelonStore();

        waterMelonStore.save(new WaterMelon("Green", 5.2, "Round", 150, "Sweet", 100, "India", true, 28, "Summer"));
		System.out.println("================================");
        waterMelonStore.save(new WaterMelon("Dark Green", 6.0, "Oval", 200, "Juicy", 120, "Brazil", true, 32, "Summer"));

        System.out.println("---- WaterMelon Details ----");
        waterMelonStore.displayAll();
	}
}