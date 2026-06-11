package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.SmartWatch;

public class FitnessWatch extends SmartWatch {

    @Override
    protected void showFeatures() {
        System.out.println("Shows fitness tracking features");
    }
}