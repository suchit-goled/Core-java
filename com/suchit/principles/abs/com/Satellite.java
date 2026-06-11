package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.Spacecraft;

class Satellite implements Spacecraft {

    public void launch() {
        System.out.println("Satellite deployed into orbit.");
    }
}
