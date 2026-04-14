class SparkPlugRunner {

    public static void main(String[] args) {

        SparkPlug plug = new SparkPlug();

        plug.addPlug("NGK Plug");
        plug.addPlug("Bosch Plug");

        plug.searchPlug("NGK Plug");
        plug.searchPlug("Denso Plug");
    }
}