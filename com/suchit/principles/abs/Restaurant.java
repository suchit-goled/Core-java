package com.suchit.principles.abs;

public interface Restaurant {

    void serveFood();

    String restaurantName();

    int tableCount();

    boolean isOpen();

    char foodCategory();

    long licenseNumber();

    float rating();

    double averageCost();

    byte chefCount();

    short employeeCount();

    RestaurantType getRestaurantType();

    Chef chef();

    Menu menu();

    BankAccount bankAccount();
}
