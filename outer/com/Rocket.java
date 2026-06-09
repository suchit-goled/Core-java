package outer.com;

import inner.Spacecraft;

class Rocket implements Spacecraft {

    public void launch() {
        System.out.println("Rocket launched successfully.");
    }

    public void checkCommunication() {
        communicationStatus();
    }
}


