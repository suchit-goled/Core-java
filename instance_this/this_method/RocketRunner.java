class RocketRunner {

    public static void main(String[] values) {

        Rocket rocket1 = new Rocket("Falcon 9", "USA", 70.0, 549054, 2,true, "RP-1/LOX", 22800, "SpaceX", true);
        rocket1.properties();

        Rocket rocket2 = new Rocket("PSLV", "India", 44.0, 320000, 4,false, "Solid/Liquid", 1750, "ISRO", true);
        rocket2.properties();

        Rocket rocket3 = new Rocket("Ariane 5", "Europe", 53.0, 777000, 2,false, "Liquid", 21600, "Arianespace", false);
        rocket3.properties();
    }
}