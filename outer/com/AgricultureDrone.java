package outer.com;

import inner.Drone;

class AgricultureDrone implements Drone {

    @Override
    public void fly() {
        System.out.println("Agriculture Drone is spraying pesticides.");
        System.out.println("Maximum Altitude: " + MAX_ALTITUDE);
    }
}
