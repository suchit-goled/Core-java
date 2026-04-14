class TabletRunner {

    public static void main(String[] args) {

        Tablet tablet = new Tablet();

        tablet.addTablet("iPad");
        tablet.addTablet("Samsung Tab");
        tablet.addTablet("Lenovo Tab");

        tablet.searchTablet("iPad");
        tablet.searchTablet("Nokia Tab");
    }
}