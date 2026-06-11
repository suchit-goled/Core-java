package com.suchit.principles.abs.com;



public class SuitcaseRunner {

    public static void main(String[] args) {

        TravelSuitcase suitcase =
                new TravelSuitcase("Safari", "Black", 65, 4.5);

        suitcase.displayDetails();
    }
}