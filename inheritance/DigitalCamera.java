class DigitalCamera extends Camera {

    DigitalCamera(int megapixel, String brand) {
        super(megapixel, brand);
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Brand: " + brand);
    }
}