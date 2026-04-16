class ScreenStoreRunner {
    public static void main(String[] args) {


       ScreenStore screenStore = new ScreenStore();

       screenStore.save(new Screen("Samsung", 55, "4K", "LED", 45000, "Black", true, 120, "IPS", 10));
       screenStore.save(new Screen("LG", 43, "Full HD", "OLED", 35000, "Gray", true, 60, "VA", 8));

       System.out.println("---- Screen Details ----");
       screenStore.displayAll();
		
	}
}