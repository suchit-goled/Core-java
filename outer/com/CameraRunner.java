package outer.com;

public class CameraRunner {

    public static void main(String[] args) {

        DSLRCamera camera = new DSLRCamera();

        camera.clickPhoto();
        camera.recordVideo();
        camera.capture();
    }
}