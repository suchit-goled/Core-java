package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.Spacecraft;

class Rocket implements Spacecraft {

    public void launch() {
        System.out.println("Rocket launched successfully.");
    }

    public void checkCommunication() {
        communicationStatus();
    }
}


