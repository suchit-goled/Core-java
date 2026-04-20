class GymDumbBell extends DumbBell {

    GymDumbBell(int weight, String material) {
        super(weight, material);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
    }
}