package outer.com;

public class DroneRunner {

    public static void main(String[] args) {

        DeliveryDrone drone1 = new DeliveryDrone();
        CameraDrone drone2 = new CameraDrone();
        AgricultureDrone drone3 = new AgricultureDrone();

        System.out.println("Delivery Drone ");
        drone1.fly();
        drone1.checkGPS();

        System.out.println("");

        System.out.println(" Camera Drone");
        drone2.fly();

        System.out.println("");

        System.out.println(" Agriculture Drone ");
        drone3.fly();
    }
}
