class LaptopTouchPad extends TouchPad {

    LaptopTouchPad(String type, boolean isMultiTouch) {
        super(type, isMultiTouch);
        System.out.println("Type: " + type);
        System.out.println("MultiTouch: " + isMultiTouch);
    }
}