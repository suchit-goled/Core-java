class SolarSystem {

    String[] planets = new String[5];
    int index = 0;

    void addPlanet(String planet) {

        System.out.println("Adding planet");

        if (planet != null) {

            if (this.index < this.planets.length) {
                this.planets[this.index] = planet;
                System.out.println("Planet stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("No space for more planets");
            }

        } else {
            System.out.println("Planet name is null");
        }
    }

    void searchPlanet(String name) {

        System.out.println("Searching planet");

        if (name != null) {

            boolean found = false;

            for (int i = 0; i < planets.length; i++) {
                if (name.equals(planets[i])) {
                    System.out.println("Planet found at index " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Planet not found");
            }

        } else {
            System.out.println("Planet name is null");
        }
    }
}