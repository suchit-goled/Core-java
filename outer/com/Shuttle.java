package outer.com;

import inner.Spacecraft;

class Shuttle implements Spacecraft {

    public void launch() {
        System.out.println("Shuttle launched with astronauts.");
    }
}
