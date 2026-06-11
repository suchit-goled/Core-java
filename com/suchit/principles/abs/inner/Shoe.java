package com.suchit.principles.abs.inner;

public interface Shoe {

    int Size=6;

    void brand();

    int price();

    void Running();

    default void Trekking(){


    }
}
