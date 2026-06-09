package outer.com;

import inner.Drone;

class CameraDrone implements Drone {

    @Override
    public void fly() {
        System.out.println("Camera Drone is recording aerial videos.");
        System.out.println("Maximum Altitude: " + MAX_ALTITUDE);
    }
}
