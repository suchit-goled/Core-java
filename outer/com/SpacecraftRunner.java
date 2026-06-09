package outer.com;

public class SpacecraftRunner {

    public static void main(String[] args) {

        Rocket rocket = new Rocket();
        Shuttle shuttle = new Shuttle();
        Satellite satellite = new Satellite();

        rocket.launch();
        rocket.checkCommunication();

        shuttle.launch();

        satellite.launch();
    }
}