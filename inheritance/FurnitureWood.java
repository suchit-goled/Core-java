class FurnitureWood extends Wood {

    FurnitureWood(String type, int density) {
        super(type, density);
        System.out.println("Type: " + type);
        System.out.println("Density: " + density);
    }
}