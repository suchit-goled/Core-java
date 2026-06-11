package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.Drone;

class AgricultureDrone implements Drone {

    @Override
    public void fly() {
        System.out.println("Agriculture Drone is spraying pesticides.");
        System.out.println("Maximum Altitude: " + MAX_ALTITUDE);
    }
}
