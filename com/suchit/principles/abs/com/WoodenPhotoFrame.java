package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.PhotoFrame;

public class WoodenPhotoFrame extends PhotoFrame {

    public WoodenPhotoFrame(int size, int material) {
        super(size, material);
    }

    @Override
    public void production() {
        System.out.println("Wooden photo frame is built");
    }
}