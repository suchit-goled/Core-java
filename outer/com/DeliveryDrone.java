package outer.com;

import inner.Drone;

class DeliveryDrone implements Drone {

    @Override
    public void fly() {
        System.out.println("Delivery Drone is transporting packages.");
        System.out.println("Maximum Altitude: " + MAX_ALTITUDE);
    }

    //only this class use checkgps as a mthod but others don't
    public void checkGPS() {
        gpsStatus();
    }
}