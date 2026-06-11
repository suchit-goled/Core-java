package com.suchit.principles.abs.com;

import com.suchit.principles.abs.inner.Shoe;

public class Puma implements Shoe {

    @Override
    public void brand() {
        System.out.println("This is Puma brand");
    }

    @Override
    public int price() {
        return 3000;
    }

    @Override
    public void Running() {

    }


}