package inner;

public abstract class PhotoFrame {

    int size;
    int material;

    public PhotoFrame(int size, int material) {
        this.size = size;
        this.material = material;
    }


    public abstract void production();


    public void displayInfo() {
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}