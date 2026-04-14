class AeroplaneRunner {

    public static void main(String[] args) {

        Aeroplane aeroplane = new Aeroplane();

        aeroplane.addPlane("Boeing 747");
        aeroplane.addPlane("Airbus A320");

        aeroplane.searchPlane("Boeing 747");
        aeroplane.searchPlane("Concorde");
    }
}