class TissueStoreRunner {

    public static void main(String[] args) {


        TissueStore tissueStore = new TissueStore();

        tissueStore.save(new Tissue("Origami", "Facial", 3, 120, "White", true, 50, "Rose", 20, "Face"));
        tissueStore.save(new Tissue("Softy", "Toilet", 2, 90, "White", true, 30, "None", 15, "Bathroom"));

        System.out.println("---- Tissue Details ----");
        tissueStore.displayAll();
	}
}