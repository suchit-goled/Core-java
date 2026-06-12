package com.suchit.principles.abs.inner;

public interface Hospital {

    void admitPatient();

    String hospitalName();

    int roomCount();

    boolean isEmergencyAvailable();

    char hospitalCategory();

    long registrationNumber();

    float rating();

    double consultationFee();

    byte ambulanceCount();

    short staffCount();

    HospitalType getHospitalType();

    Surgery surgery();

    Patient patient();
}