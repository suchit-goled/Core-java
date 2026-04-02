class ThinkPadRunner {

    public static void main(String[] values) {

        ThinkPad laptop1 = new ThinkPad("E14", "Intel i5", 8, 512, 65000,"Black", 14.0, "Windows 11", false, true);
        laptop1.properties();

        ThinkPad laptop2 = new ThinkPad("X1 Carbon", "Intel i7", 16, 1024, 150000,"Black", 14.0, "Windows 11", true, true);
        laptop2.properties();

        ThinkPad laptop3 = new ThinkPad("L15", "AMD Ryzen 5", 8, 512, 70000,"Grey", 15.6, "Windows 10", false, false);
        laptop3.properties();
    }
}