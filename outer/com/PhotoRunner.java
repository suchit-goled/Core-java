package outer.com;

import inner.PhotoFrame;

public class PhotoRunner {

    public static void main(String[] args) {

        PhotoFrame frame = new WoodenPhotoFrame(12, 1);

        frame.displayInfo();
        frame.production();
    }
}