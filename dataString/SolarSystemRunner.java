class SolarSystemRunner {

    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();

        solarSystem.addPlanet("Earth");
        solarSystem.addPlanet("Mars");
        solarSystem.addPlanet("Jupiter");

        solarSystem.searchPlanet("Mars");
        solarSystem.searchPlanet("Venus");
    }
}