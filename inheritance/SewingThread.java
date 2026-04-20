class SewingThread extends Thread {

    SewingThread(String color, int thickness) {
        super(color, thickness);
        System.out.println("Color: " + color);
        System.out.println("Thickness: " + thickness);
    }
}