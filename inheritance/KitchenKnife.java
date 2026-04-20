class KitchenKnife extends Knife {

    KitchenKnife(String material, double length) {
        super(material, length);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
    }
}