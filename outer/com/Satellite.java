package outer.com;

import inner.Spacecraft;

class Satellite implements Spacecraft {

    public void launch() {
        System.out.println("Satellite deployed into orbit.");
    }
}
