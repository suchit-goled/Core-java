package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.Banner;



public class PoleBanner implements Banner {


    @Override
    public void display() {
        System.out.println("displaying ads on pole banner");
    }

    @Override
    public void typeOfAdvertise() {
        System.out.println("displaying ads of grocery");
    }

}
