package com.suchit.principles.abs.inner;

public interface Banner {
    int Size=20;


    void display();

    default void typeOfAdvertise(){

        System.out.println("displaying the brand name");
    }
}
