// interfaces have only incomplete method, the devlpr can define the method as default which can or cannot be used in other classes
package com.suchit.principles.abs.inner;

public interface Drone {

    int MAX_ALTITUDE = 500; // public static final by default, the variable defined is public static final which can be used in any other class

    void fly(); // public abstract by default, it is complusory to override these method in other class


    //default is method which is not compulsory to use in any class, the required class can use it, it is a complete method return
    default void gpsStatus() {
        System.out.println("GPS Connected Successfully");
    }
}