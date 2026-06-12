package com.suchit.principles.abs;

public interface University {

    void conductExam();

    String universityName();

    int departmentCount();

    boolean isAutonomous();

    char rankingGrade();

    long registrationId();

    float passPercentage();

    double fees();

    byte campusCount();

    short courseCount();

    UniversityType getUniversityType();

    Professor professor();

    Student student();

    BankAccount bankAccount();
}